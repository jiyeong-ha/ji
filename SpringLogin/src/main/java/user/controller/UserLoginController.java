package user.controller;

import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import user.domain.LoginDTO;
import user.domain.UserVO;
import user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserLoginController {
	
	@Autowired
	private UserService userService;
	
	//로그인 페이지 리턴
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGET(){
		return "user/login";
	}
	
	//로그인 처리
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public String loginPOST(LoginDTO loginDTO, HttpSession httpsession, Model model) throws Exception {
		System.out.println(loginDTO);//입력된 로그인 정보 잘 받아왔는지 체크
		UserVO userVO = userService.login(loginDTO);//입력된 로그인정보를 이용하여 DB에 저장된 회원 정보를 가져옴
		System.out.println(userVO);//DB에서 회원정보를 잘 가져왔는지 체크
		if(userVO == null||!BCrypt.checkpw(loginDTO.getUserpw(), userVO.getUserpw())) {//DB에서 받아온 회원정보가 없거나 페스워드 비교값이 일치하지않으면
			return "redirect:/jsp/user/login";//다시 로그인페이지로 이동
		}
		model.addAttribute("user", userVO);//로그인 정보값이 일치하면
		return "user/loginPost";//로그인 성공페이지로 이동
	}
	
	//세션으로 받아온 로그인정보와 페이지에서 보낸 데이터 콘솔창에 출력후 loginPost페이지로 이동
	@RequestMapping(value = "/donepage", method = RequestMethod.POST)
	public String donpage(HttpSession httpsession, String test){
		
		UserVO uservo = (UserVO)httpsession.getAttribute("login");//로그인 성공 후 세션에 login이란 이름으로 저장된  UserVO타입의 사용자 정보를 가져옴 
		System.out.println("userid :: "+uservo.getUserid() + "userpw :: " + uservo.getUserpw());//잘 가져왔는지 확인
		System.out.println(test);//페이지 정보 가져오는지 확인
		
		return "user/loginPost";//위 코드에서 오류가 없다면 다시 로그인 성공페이지로 이동 ... 반복
	}
	
	//세션정보를 지우고 로그인페이지로 이동
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpSession httpsession){
		httpsession.removeAttribute("login");//세션정보를 지움
		return "redirect:/jsp/user/login";//로그인 페이지로 이동
	}
}
