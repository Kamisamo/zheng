//package com.zheng.websocket;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.websocket.*;
//import javax.websocket.server.PathParam;
//import javax.websocket.server.ServerEndpoint;
//import java.io.IOException;
//
///**
// * @author Hxtech
// * @version V1.0
// * @description
// * @create-date 2018/8/30.
// * @modifier
// * @modifier-data
// */
//@Component
//@ServerEndpoint(value = "/webSocketTest/{userId}")
//public class WebsocketService { //
//
//    private Logger log = LoggerFactory.getLogger(WebsocketService.class);
//    private String userId;
////
////    @Override
////    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
////        System.out.println("Received message: " + message.getPayload());
////        Thread.sleep(2000);
////        session.sendMessage(new TextMessage("Polo!"));
////    }
////
////    @Override
////    public void afterConnectionEstablished(WebSocketSession session) {
////        System.out.println("Connection established!");
////    }
////
////    @Override
////    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
////        System.out.println("Connection closed. Status: " + status);
////    }
//
//    @OnOpen
//    public void onOpen(@PathParam("userId")String userId,Session session){
//        this.userId = userId;
//        log.info("新连接：{}",userId);
//    }
//
//    @OnClose
//    public void onClose(){
//        log.info("连接：{}",this.userId);
//    }
//
//    @OnMessage
//    public void onMessage(String message,Session session){
//        log.info("收到用户{}的消息:{} ",this.userId,message);
//        try {
//            session.getBasicRemote().sendText("收到"+this.userId+"的消息"+message);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    //连接错误时执行
//    @OnError
//    public void onError(Session session, Throwable error){
//        log.debug("用户id为：{}的连接发送错误",this.userId);
//        error.printStackTrace();
//    }
//
//}
