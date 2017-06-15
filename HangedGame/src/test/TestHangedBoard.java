package test;

import org.junit.Assert;
import org.junit.Test;

import main.HangedBoard;

public class TestHangedBoard {
	
	
	
	
	
	@Test
	public void testAddLetterToWordPlayer(){
		
		HangedBoard board = new HangedBoard(); 
		
		board.startGame("PERRO",2);   
		int[] results = board.addLetterToWordPlayer('R'); 
		int[] expected= new int[]{2,3}; 
		
		Assert.assertEquals(expected,results); 
		
	}

}
