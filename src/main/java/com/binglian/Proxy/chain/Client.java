package com.binglian.Proxy.chain;

public class Client {


	static class HandlerA extends Handler{

		@Override
		protected void handlerProcess() {
			System.out.println("handlew by a");
		}
		
	}
	static class HandlerB extends Handler{

		@Override
		protected void handlerProcess() {
			System.out.println("handlew by b");
		}
		
	}
	static class HandlerC extends Handler{

		@Override
		protected void handlerProcess() {
			System.out.println("handlew by c");
		}
		
	}
	public static void main(String[] args) {

		Handler handlerA=new HandlerA();
		Handler handlerB=new HandlerB();
		Handler handlerC=new HandlerC();
		
		handlerA.setSucessor(handlerB);
		handlerB.setSucessor(handlerC);
		
		handlerA.execute();
	}

}
