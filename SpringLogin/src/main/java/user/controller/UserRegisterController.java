package user.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import user.domain.UserVO;
import user.service.UserService;

@Controller
public class UserRegisterController {
	
	@Autowired
	private UserService userService;
	
	//회원가입 페이지
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGET() throws Exception{
		return "user/register";
	}

	//페이지에서 받아온 회원가입 정보 DB에 입력 
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(UserVO userVO, RedirectAttributes redirectAttributes) throws Exception {
		
		String hashedPw = BCrypt.hashpw(userVO.getUserpw(),BCrypt.gensalt());
		userVO.setUserpw(hashedPw);
		userService.register(userVO);//db에 등록
		redirectAttributes.addFlashAttribute("msg", "REGISTERED");
		
		return"redirect:user/login";
	}
	
	
}
