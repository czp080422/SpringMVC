package com.czp.springmvc;
 
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
/**
 * 处理首页请求
 * 
 * @author SongYF
 * 
 */
@Controller
public class HomeController {
 
	/**
	 * 处理首页请求
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

 
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);
 
		String formattedDate = dateFormat.format(date);
 
		model.addAttribute("serverTime", formattedDate);
               
		return "/home";
	}
 
}