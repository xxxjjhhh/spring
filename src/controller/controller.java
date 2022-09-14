import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


@Controller
public class controller implements Controller {

  @RequestMapping(value = "/");
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throw Exception {
    
    ModelAndView mv = new ModelAndView();
    mv.addObject("data", "value1");
    mv.setViewName("post1.jsp");
    
    return mv;
  
  }
}
