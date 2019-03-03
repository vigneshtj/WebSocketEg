package com.sample;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value="/serverendpointdemo")
public class WebSkt {
	
	@OnOpen
	public void handleOpen(Session s) {
		System.out.println("Server is now connected");
	}
	
	@OnMessage
	public String handleMessage(String message) {
		System.out.println("Message from client=> "+message);
		return message;
	}	
	
	@OnClose
	public void handleClose(Session s) throws IOException {
		System.out.println("server is now closed");
	}
	
	@OnError
	public void handleError(Throwable t) {
	t.printStackTrace();
	}
}
