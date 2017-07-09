package com.techlabs.manboy.test;

import com.techlabs.manboy.Boy;
import com.techlabs.manboy.IEmotionable;
import com.techlabs.manboy.IMannerable;
import com.techlabs.manboy.Man;

public class ManBoyTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();

		// atMovieHall(man);
		atMovieHall(boy);
		atPartyHall(man);
		atPartyHall(boy);

	}

	public static void atPartyHall(IMannerable obj) {
		System.out.println("At the party hall");
		obj.wish();
		obj.depart();
	}

	public static void atMovieHall(IEmotionable obj) {
		System.out.println("At the Movie Hall");
		obj.cry();
		obj.laugh();
	}
}
