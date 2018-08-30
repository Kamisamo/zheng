package com.zheng.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 继承AbstractWebSocketHandler
 * @author Hxtech
 * @version V1.0
 * @description
 * @create-date 2018/8/30.
 * @modifier
 * @modifier-data
 */
@Service
public class WebSocketService2 extends AbstractWebSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketService2.class);
    private final static List<WebSocketSession> sessions = Collections.synchronizedList(new ArrayList<WebSocketSession>());
    // handle text msg.
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        session.sendMessage(new TextMessage("hello world."));
    }
}
