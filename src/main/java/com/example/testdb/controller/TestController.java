package com.example.testdb.controller;

import com.example.testdb.model.dto.MemberInfo;
import com.example.testdb.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private MemberService ms;

    @RequestMapping("/test")
    @ResponseBody
    public List<String> test(){
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hi2");
        list.add("hi3");

        return list;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<MemberInfo> allmember(){
        List<MemberInfo> msTemp = ms.getAll();
        return msTemp;
    }


//    @RequestMapping("/home")
//    public String home(){
//        return "home";
//    }
}
