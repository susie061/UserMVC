package com.kedu.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {// 로직 담당(실행과 가공이 필요 할때)

	@Autowired
	private UserMapper mapper;

	public int join(UserVO param) {
		int result = 0;
		result = mapper.join(param);
		return result;
	}

	public int login(UserVO param) {
		int result = 0;
		UserVO vo = mapper.login(param);
		if (vo != null) {
			if (vo.getUpw().equals(param.getUpw())) {
				result = 1;
			} else {
				result = 3;
			}
		} else {
			result = 2;
		}
		return result;
	}
}
