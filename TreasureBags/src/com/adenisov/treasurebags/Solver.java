package com.adenisov.treasurebags;

public class Solver {

	public static void main(String[] args) {
		
		Cave cave = new Cave();
		
		int[] worth = { 3, 2 };
		int[] ropes = { 1, 2 };
		
		int totalWorth = cave.getTreasures(worth, ropes);
		System.out.println(totalWorth);
	}

}
