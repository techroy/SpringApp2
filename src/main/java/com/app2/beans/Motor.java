package com.app2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("motor1")
public class Motor {

	// @Autowired(required=false)
	// private Engine engine;

	/*
	 * @Autowired public void setEngine(Engine engine) { this.engine = engine; }
	 */

	/*
	 * @Autowired public Motor(Engine engine) { super(); this.engine = engine; }
	 */

	/*
	 * @Autowired public void setEngineMethod(Engine engine){
	 * 
	 * this.engine = engine; }
	 */

	@Autowired
	@Qualifier("enginev2")
	private IEngine iengine;
	
	@Autowired
	@Qualifier("engine")
	private IEngine iengine1;


	

	public void run() {

		System.out.println(iengine);
		System.out.println(iengine1);

		if (iengine != null) {
			iengine.start();
		}

	}

}
