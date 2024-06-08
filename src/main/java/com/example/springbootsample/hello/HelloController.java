package com.example.springbootsample.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
    
    @GetMapping("/hello")
    public String getHello() {
        // hello.html に画面遷移
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@RequestParam("text1") String str, Model model) {
        
        // 画面から受け取った文字列を Model に登録
        model.addAttribute("sample", str);
        
        // response.html に画面遷移
        return "hello/response";
    }
    
}
