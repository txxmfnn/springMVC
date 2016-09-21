package com.paincupid.springmvc.application.poolv2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(new Integer(1));
		GenPool gp = new GenPool(deque);
		
		Thread getIdThread = new Thread(new GetID(gp));
		Thread setIdThread = new Thread(new SetID(gp));
		//��������Id��Ϊ�ػ��̣߳���GetID��1000���ػ��߳̽�����
		setIdThread.setDaemon(true);
		setIdThread.start();
		getIdThread.start();
		
		

	}

}
