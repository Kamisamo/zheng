package com.zheng.config;

import com.zheng.websocket.WebSocketService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * 方式2：实现WebSocketConfigurer接口，使dispatchServlet拦截/chat
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/30.
 * @modifier
 * @modifier-data
 */
@Configuration
@EnableWebSocket
public class WebsocketConfig2 implements WebSocketConfigurer {

    @Autowired
    private WebSocketService2 webSocketService2;
    @Autowired
    private WebSocketHandshakeInterceptor webSocketHandshakeInterceptor;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketService2,"/chat").addInterceptors(webSocketHandshakeInterceptor);
    }
}
