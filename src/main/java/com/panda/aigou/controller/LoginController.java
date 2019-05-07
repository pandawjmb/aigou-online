package com.panda.aigou.controller;
import com.alibaba.fastjson.JSONObject;
import com.panda.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value ="/login")
@RestController
public class LoginController {
    @RequestMapping("")
    public AjaxResult login() {
        JSONObject user = JSONObject.parseObject("{\"id\":1,\"username\":\"admin\",\"avatar\":\"https://raw.githubusercontent.com/taylorchen709/markdown-images/master/vueadmin/user.png\",\"name\":\"张某某\"}");
        return AjaxResult.me().setData(user);
    }
}
