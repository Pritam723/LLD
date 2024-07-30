package _7.SnakeLadder;

import java.util.Random;

public class Board {
	int boardSize;
	Cell cells[][];
	
	Board(int boardSize, int noSnakes, int noLadders){
		this.boardSize = boardSize;
		initializeCells(boardSize);
		addSnakeLadders(boardSize, noSnakes, noLadders);
	}
	
	void initializeCells(int boardSize){
		
		cells = new Cell[boardSize][boardSize];
		
		for(int row = 0; row < boardSize; row++) {
			for(int col = 0; col < boardSize; col++) {
				Cell cellObj = new Cell();
				cells[row][col] = cellObj;
				// By default a new Cell() has null Jump.
			}
		}
	}
	
	void addSnakeLadders(int boardSize, int noSnakes, int noLadders) {
		while(noSnakes > 0) {
			int[] start_end = getStartEnd(boardSize);
			int start = start_end[0];
			int end = start_end[1];
			
			if(start <= end) continue; // It can't be a Snake.
			
			// So, start > end. So, it is a Snake. Add it in start cell.
			Jump snake = new Jump(JumpType.SNAKE, start, end);
			
			Cell cellObj = getCell(start);
			
			cellObj.setJump(snake);
			
			System.out.println("Snake added from " + start + " to " + end);
			noSnakes--;
		}
		
		// Using similar logic we can add ladders.
		while(noLadders > 0) {
			int[] start_end = getStartEnd(boardSize);
			int start = start_end[0];
			int end = start_end[1];
			
			if(start >= end) continue; // It can't be a Snake.
			
			// So, start > end. So, it is a Snake. Add it in start cell.
			Jump ladder = new Jump(JumpType.LADDER, start, end);
			
			Cell cellObj = getCell(start);
			
			cellObj.setJump(ladder);

			System.out.println("Ladder added from " + start + " to " + end);
			noLadders--;
		}
	}
	
	public Cell getCell(int pos) {
		int row = pos/boardSize;
		int col = pos%boardSize;
		
		return cells[row][col];
	}
	
	// Supporting Function.
	int[] getStartEnd(int boardSize) {
		int [] start_end = new int[2];
		// For a board from 0 to 99,
		// We need random from 1 to 98.
		// We do not want any ladder/snake at 0 or 99.
		
		Random random = new Random();
		int start = random.nextInt(boardSize*boardSize - 2) + 1;
		int end = random.nextInt(boardSize*boardSize - 2) + 1;
		// Will give 0 to 97. So we did a +1.
		start_end[0] = start;
		start_end[1] = end;
		
		return start_end;
	}
}
