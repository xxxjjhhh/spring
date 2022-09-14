//web.xml
<servlet>
  <servlet-name>dispatcherController</servlet-name>
  <servlet-class>org.springframework.servlet.DispatcherServlet</servlet-class>
</servlet>
<servlet-mapping>
  <servlet-name>dispatcherController</servlet-name>
  <url-pattern>/</url-pattern>
</servlet-mapping>


import org.springframework.stereotype.Controller;


@Controller
public class controller {

  @RequestMapping(value = "/");
  public String main(String[] args){
  
  }
}
