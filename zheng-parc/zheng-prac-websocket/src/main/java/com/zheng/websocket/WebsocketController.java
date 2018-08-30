package com.zheng.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/30.
 * @modifier
 * @modifier-data
 */
@Controller
public class WebsocketController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }



}
