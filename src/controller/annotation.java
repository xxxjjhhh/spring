//dispachter-servlet.xml에 beans 주석처리

//servlet.-context.xml에 mapping 설정
<mvc:annotation-driven />

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class controller {

  @RequestMapping("/post")
  public void post (HttpServletRequest request, HttpServletResponse response) throw Exception {
    
    ModelAndView mv = new ModelAndView();
    mv.addObject("data", "value1");
    mv.setViewName("post1.jsp"); //절대 경로 추천
    
    return mv;
  
  }
}
