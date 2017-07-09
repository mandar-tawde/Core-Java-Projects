package com.techlabs.player.test;

import com.techlabs.player.GenderType;
import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player player1 = new Player(10, "Sachin", 25, GenderType.Male);
		Player player2 = new Player(11, "Virat", GenderType.Male);
		System.out.println("Player 1");
		printInfo(player1);
		System.out.println("Player 2");
		printInfo(player2);
		System.out.println("Elder Player : "
				+ String.valueOf(player2.whoIsElder(player1).hashCode()));
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}
	
	public static void printInfo(Player p){
		System.out.println("Hash   :" + String.valueOf(p.hashCode()));
		System.out.println("Id     :" + p.getID());
		System.out.println("Name   :" + p.getName());
		System.out.println("Age    :" + p.getAge());
		System.out.println("Gender :" + p.getGender());
	}

}
