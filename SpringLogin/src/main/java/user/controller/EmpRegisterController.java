package user.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import user.domain.EmpDto;
import user.service.EmpService;

@Controller
public class EmpRegisterController {
	
	@Autowired
	private EmpService service;
	
	@RequestMapping(value="/emp", method = RequestMethod.GET)
	public String registerForm() throws Exception{
		return "emp/registerForm";
	}
	
	@RequestMapping(value="/emp", method = RequestMethod.POST)
	public String  register(EmpDto dto) throws Exception{
		System.out.println(dto);
		String hashedPw = BCrypt.hashpw(dto.getPasswd(), BCrypt.gensalt());
		dto.setPasswd(hashedPw);
		service.register(dto);
		return "emp/login";
		
	}

}
