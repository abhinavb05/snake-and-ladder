import java.util.*;

public class Cell {
	private Pawn pawn;
	private Snake snake;
	private Ladder ladder;
	
	public Cell() {
		
	}
	
	public Cell(Snake snake) {
		this.snake = snake;
	}
	
	public Cell(Ladder ladder) {
		this.ladder = ladder;
	}
	
	public Pawn getPawn() {
		return pawn;
	}
	
	public void setPawn(Pawn pawn) {
		this.pawn = pawn;
	}
	
	public Ladder getLadder() {
		return ladder;
	}
	
	public Snake getSnake() {
		return snake;
	}
}
