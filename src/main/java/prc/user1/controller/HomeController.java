package prc.user1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //기본 페이지 요청 메소드
    @GetMapping("/") //기본 주소가 요청되면 아래 메소드 호출
    public String index(){
        return "index"; //=> templates의 index.html 파일을 찾아서 브라우저에 띄움
    }
}
