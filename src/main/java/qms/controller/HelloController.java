package qms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController extends AbstractController {
	
	@RequestMapping("/")
	public ModelAndView hello(Model model, WebRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		log.debug("{}","안녕하신가요?");
		return mv;
	}

}
