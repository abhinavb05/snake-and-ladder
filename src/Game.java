import java.util.*;

public class Game {
	private Board board;
	private ArrayList<Player> players;
	static int playerTurn = 0;
	static boolean gameEnd = false;
	
	public Game(Board board,ArrayList<Player> players){
		this.board = board;
		this.players = players;
	}
	
	public int rollDice() {
		return new Random().nextInt((6 - 1) + 1) + 1;
	}
	
	public void makeAMove() {
		Player p = players.get(playerTurn);
		int diceValue = rollDice();
		int newPosition = p.getPosition() + diceValue;
		newPosition = board.getPosition(newPosition);
		
		if(newPosition > 100) {
			return;
		}
		
		System.out.println(p.getName()+" rolled a "+diceValue+" and moved from "+p.getPosition()+" to "+newPosition);
		p.setPosition(newPosition);
		
		if(newPosition == 100) {
			System.out.println(p.getName()+" wins the game!");
			gameEnd = true;
			return;
		}
		
		playerTurn++;
		if(playerTurn >= players.size()) {
			playerTurn = 0;
		}
	}
	
	public void executeGame() {
		while(!gameEnd) {
			makeAMove();
		}
	}
}
