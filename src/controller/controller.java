import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;



public class controller implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throw Exception {
    
    ModelAndView mv = new ModelAndView();
    mv.addObject("data", "value1");
    mv.setViewName("post1.jsp"); //절대 경로 추천
    
    return mv;
  
  }
}
