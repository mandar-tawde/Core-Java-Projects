package com.techlabs.player.test;

import com.techlabs.player.GenderType;
import com.techlabs.player.Player;

public class PlayerCountTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Player p1 = new Player(1, "Mandar", 20, GenderType.Male);
		System.out.println(Player.getCounter());
		Player p2 = new Player(2, "Pankaj", 20, GenderType.Male);
		System.out.println(Player.getCounter());
		Player p3 = new Player(3, "Naaved", 20, GenderType.Male);
		System.out.println(Player.getCounter());
		System.out.println(Player.getCounter());
	}
}
