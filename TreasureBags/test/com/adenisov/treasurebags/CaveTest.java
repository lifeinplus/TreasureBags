package com.adenisov.treasurebags;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaveTest {

	Cave cave;
	
	@Before
	public void before() {
		cave = new Cave();
	}
	
	@After
	public void after() {
		cave = null;
	}
	
	@Test
	public void testGetTreasures1() {
		
		int[] worth = { 3, 2 };
		int[] ropes = { 1, 2 };
		
		int expected = 5;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTreasures2() {
		
		int[] worth = { 3, 2 };
		int[] ropes = { 1, 3 };
		
		int expected = 3;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTreasures3() {
		
		int[] worth = { 3, 2 };
		int[] ropes = { 2, 3 };
		
		int expected = 2;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTreasures4() {
		
		int[] worth = { 1 };
		int[] ropes = { 11 };
		
		int expected = 1;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTreasures5() {
		
		int[] worth = { 1 };
		int[] ropes = { 10 };
		
		int expected = 0;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTreasures6() {
		
		int[] worth = { 3, 4, 4 };
		int[] ropes = { 1, 2, 1 };
		
		int expected = 7;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTreasures7() {
		
		int[] worth = { 3, 4, 4 };
		int[] ropes = { 5, 2, 1 };
		
		int expected = 7;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTreasures8() {
		
		int[] worth = { 3, 1, 4 };
		int[] ropes = { 4, 2, 1 };
		
		int expected = 4;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetTreasures9() {
		
		int[] worth = { 3, 2 };
		int[] ropes = { 2, 2 };
		
		int expected = 0;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTreasures10() {
		
		int[] worth = { 3, 1, 4 };
		int[] ropes = { 4, 2, 4 };
		
		int expected = 0;
		int actual = cave.getTreasures(worth, ropes);
		
		assertEquals(expected, actual);
	}
	

}
