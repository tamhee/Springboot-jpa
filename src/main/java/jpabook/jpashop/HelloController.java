package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        //model에 데이터 넣어 view로 전달
        model.addAttribute("data","hello!!!!");

        //화면명 (뒤에 html이 자동으로 붙음)
        //Q. 어떻게 붙지?
        //thymeleaf 자체 설정으로 가능한 것
        // 스프링 부트 설정 내에서 변경 가능함
       return "hello";
    }
}
