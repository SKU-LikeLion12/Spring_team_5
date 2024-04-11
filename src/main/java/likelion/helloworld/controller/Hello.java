package likelion.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/hello-data")
    public String hellodata(Model model){
        model.addAttribute("nameKey","오현");
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String helloPath(@PathVariable String name, Model model){
        model.addAttribute("nameKey",name);
        return "hello";
    }

    @GetMapping("/hello-param")
    public String helloParam(@RequestParam("name") String name,
                             @RequestParam("grade") String grade,
                             @RequestParam("major") String major,
                             Model model){
        model.addAttribute("nameKey",name);
        model.addAttribute("grade", grade);
        model.addAttribute("major",major);

        return "hello";
    }
}
