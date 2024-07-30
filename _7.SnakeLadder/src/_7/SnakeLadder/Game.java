package _7.SnakeLadder;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
	Board board;
	Dice dice;
	Deque<Player> players = new ArrayDeque<>();
	Player winner; // Initially it is null.
	
	Game(){
		initializeGame();
	}
	
	void initializeGame() {
		this.board = new Board(10, 3, 4);
		this.dice = new Dice(2);
		addPlayers();
		this.winner = null;
	}
	
	void addPlayers() {
		Player p1 = new Player(10020, "Player1");
		Player p2 = new Player(10030, "Player2");
		
		players.addLast(p1);
		players.addLast(p2);
	}
	
	public void startGame() {
		Scanner scanner = new Scanner(System.in);

			
		while(winner == null) {
			// The game will go on till we get a winner.
			
			Player p = findNextPlayer();
			// Now, we will roll the dice.
			int offset = dice.rollDice();
			
			System.out.println("Player " + p.name + " is playing. He is at " + p.currentPos);

			System.out.println("Got Dice value:" + offset);

			// Based on p's current pos and offset,
			// we decide next position.
			int newPosition = positionAfterJump(p.currentPos, offset);
			p.currentPos = newPosition;
			
			System.out.println("New position is " + newPosition);

			
			if(newPosition >= board.boardSize * board.boardSize - 1) {
				winner = p;
				break;
			}
						
			System.out.println("Take next turn? Y or N?");

			String input = scanner.nextLine();
			
			if(input.equals("N")) {
				System.out.println("Exiting the game.");
				return;
			}
			System.out.println("Taking next turn.");

		}
		
		System.out.println("We got a Winner. Winner is: " + winner.name);
	}
	
	Player findNextPlayer() {
		Player p = players.removeFirst();
		players.addLast(p);	
		return p;
	}
	
	int positionAfterJump(int pos, int offset) {
		int newPos = pos + offset;
		
		if(newPos >= board.boardSize * board.boardSize - 1) return newPos;
		
		// Otherwise check, if the newPos cell has a Snake or Ladder.
		Cell cellObj = board.getCell(newPos);
		if(cellObj.jump == null) return newPos;
		
		// Otherwise, surely there is a Snake or Ladder in the Cell.
		System.out.println("We got a " + cellObj.jump.jumpType + " at " + newPos);
		

		return cellObj.jump.end;
	}
}
