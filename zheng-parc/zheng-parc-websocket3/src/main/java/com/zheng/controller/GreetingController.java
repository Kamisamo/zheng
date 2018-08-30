package com.zheng.controller;

import com.zheng.entity.Greeting;
import com.zheng.entity.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/**
 * 支持STOMP消息处理
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/30.
 * @modifier
 * @modifier-data
 */
@Controller
public class GreetingController {

    @MessageMapping("/hello") //message
    @SendTo("/topic/greetings") //广播到/topic/greetings
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
