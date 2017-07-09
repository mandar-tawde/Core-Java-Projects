package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.Infant;
import com.techlabs.man.Kid;
import com.techlabs.man.Man;

public class PolymorphismTest {
	public static void main(String[] args) {
		atThePlayGround(new Man());
		atThePlayGround(new Boy());
		atThePlayGround(new Kid());
		atThePlayGround(new Infant());
	}

	public static void atThePlayGround(Man x) {
		System.out.print("At the playground ");
		x.play();
	}
}
