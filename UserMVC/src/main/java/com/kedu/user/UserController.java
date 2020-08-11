package com.kedu.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {// 주소 매핑담당 (get ,post 주소값 담당) , 필요한 서비스를 호출 해서 사용 하기 위해서 사용 ,바로 mapper를 호출해서 사용은
								// 가능하다

	@Autowired
	private UserService service; // UserService 타입을 가져 와서 사용 한다.(new 할 필요없다)

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		System.out.println("ss");
		return "join";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVO param) {

		int result = service.join(param);

		return "redirect:/user/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO param, Model model) {

		int result = service.login(param);
		String msg = "알 수 없는 에러가 발생 했습니다";
		switch (result) {
		case 1:
			return "redirect:/user/home";
		case 2:
			msg = "아이디를 확인해 주세요";
			break;
		case 3:
			msg = "비밀번호를 확인 해 주세요";
			break;
			
		}
		model.addAttribute("msg", msg);
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

}
