import java.util.*;

public class Player {
	private String name;
	private Pawn pawn;
	private Board board;
	
	public Player(String name,Pawn pawn,Board board) {
		this.name = name;
		this.pawn = pawn;
		this.board = board;
	}
	
	public String getName() {
		return name;
	}
	
	private int rollDice() {
		return new Random().nextInt((6 - 1) + 1) + 1;
	}
	
	private void setPawnAtCell(int position) {
		board.setCell(position, pawn);
	}
	
	private void removePawn() {
		board.setCell(pawn.getPosition(), null);
	}
	
	public void makeMove() {
		int newPosition = rollDice() + pawn.getPosition();
		if(newPosition > board.getSize()) {
			return;
		}
		
		Cell c = board.getCell(newPosition);
		if(c.getSnake() != null) {
			newPosition = c.getSnake().getTail();
		}
		else if(c.getLadder() != null) {
			newPosition = c.getLadder().getend();
		}
		
		removePawn();
		setPawnAtCell(newPosition);
	}
	
	public Pawn getPawn() {
		return pawn;
	}
}