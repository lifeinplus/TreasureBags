package com.adenisov.treasurebags;

public class Cave {

	public int getTreasures(int[] worth, int[] ropes) {
		
		int totalWorth = 0;
		
		if ((ropes[0] & 1) == 0) {
			for (int i = 0; i < ropes.length; i++) {
				if ((ropes[i] & 1) == 0) {
					continue;
				} else {
					totalWorth += worth[i];
				}
			}
		} else {
			for (int i = 0; i < ropes.length; i++) {
				if (i == 0) {
					totalWorth += worth[i];
				} else {
					if (((ropes[i] - 1) & 1) != 0) {
						totalWorth += worth[i];
					}
				}
			}
		}
		
		return totalWorth;
	}

}
