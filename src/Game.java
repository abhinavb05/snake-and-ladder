import java.util.*;

public class Game {
	private Board board;
	private ArrayList<Player> players;
	int playerTurn = 0;
	boolean gameEnd = false;
	
	public Game(Board board,ArrayList<Player> players){
		this.board = board;
		this.players = players;
	}
	
	public void executeGame() {
		while(!gameEnd) {
			players.get(playerTurn).makeMove();
			
			if(players.get(playerTurn).getPawn().getPosition() == board.getSize()) {
				gameEnd = true;
			}
			
			playerTurn++;
			if(playerTurn >= players.size()) {
				playerTurn = 0;
			}
		}
	}
}
