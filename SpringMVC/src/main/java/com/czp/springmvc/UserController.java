package com.czp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
//此注解表明当前类为控制器
@Controller
// 此注解表明 此控制器负责处理来自/user的请求
@RequestMapping("/user")
public class UserController {
 
	/**
	 * 跳转到注册页面
	 * 
	 * @return
	 */
	// 此注解表示处理/user/toRegister 请求
	@RequestMapping("/toRegister")
	public String toRegister() {
		// 视图解析器会在/user目录下 找到register.jsp页面返回
		return "/user/register";
	}
 
	/**
	 * 注册
	 * 
	 * @param user
	 * @return
	 */
	// 此注解表示处理/user/register 请求
	@RequestMapping("/register")
	public ModelAndView register(@RequestParam("username") String username,@RequestParam("password") String psw) {
		 //User对象SpringMVC自动注入进来的
		ModelAndView mv = new ModelAndView();
		if ("".equals(username)||null == username) {
			mv.setViewName("/user/register_ok");
			mv.addObject("errorMsg", "用户名或密码不能为空");
		} else {
 
			mv.setViewName("/user/register_ok");
			mv.addObject("username", username);
			mv.addObject("password", psw);
		}
		return mv;
	}
}