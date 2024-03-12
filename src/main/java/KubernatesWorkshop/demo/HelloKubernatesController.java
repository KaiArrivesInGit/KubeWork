package KubernatesWorkshop.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloKubernatesController {

  @GetMapping("/hello")
  public String sayHello(String name) {
    return "Hello from Kubernates!" + name;
  }

}