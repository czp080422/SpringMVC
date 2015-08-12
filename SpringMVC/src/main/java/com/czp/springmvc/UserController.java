package com.czp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
//��ע�������ǰ��Ϊ������
@Controller
// ��ע����� �˿���������������/user������
@RequestMapping("/user")
public class UserController {
 
	/**
	 * ��ת��ע��ҳ��
	 * 
	 * @return
	 */
	// ��ע���ʾ����/user/toRegister ����
	@RequestMapping("/toRegister")
	public String toRegister() {
		// ��ͼ����������/userĿ¼�� �ҵ�register.jspҳ�淵��
		return "/user/register";
	}
 
	/**
	 * ע��
	 * 
	 * @param user
	 * @return
	 */
	// ��ע���ʾ����/user/register ����
	@RequestMapping("/register")
	public ModelAndView register(@RequestParam("username") String username,@RequestParam("password") String psw) {
		 //User����SpringMVC�Զ�ע�������
		ModelAndView mv = new ModelAndView();
		if ("".equals(username)||null == username) {
			mv.setViewName("/user/register_ok");
			mv.addObject("errorMsg", "�û��������벻��Ϊ��");
		} else {
 
			mv.setViewName("/user/register_ok");
			mv.addObject("username", username);
			mv.addObject("password", psw);
		}
		return mv;
	}
}