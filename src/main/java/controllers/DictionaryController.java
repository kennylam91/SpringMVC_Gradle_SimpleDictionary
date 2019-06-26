package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    @GetMapping("/dictionary")
    public String showform() {
        return "dictionary";
    }

    @PostMapping("/result")
    public String showresult(@RequestParam String findWord, Model model) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chao");
        dictionary.put("good morning","chao buoi sang");
        dictionary.put("good afternoon","chao buoi trua");

        model.addAttribute("findWord", findWord);
        String result= dictionary.get(findWord);
        if(result==null) result="Not found";
        model.addAttribute("result",result);
        return "result";
    }
}
