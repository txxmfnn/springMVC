package com.paincupid.springmvc.application.poolv2;


public class SetID implements Runnable {
	private GenPool pool;
	public SetID(GenPool pool){
		this.pool = pool;
	}
	
	@Override
	public void run() {
		//for (int i=0; i<100; i++){   //ֻset����100��Id
		while(true){ 
			pool.set();
		}
	}

}
