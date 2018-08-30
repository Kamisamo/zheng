package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
public class ZhengPracWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhengPracWebsocketApplication.class, args);
	}
}
