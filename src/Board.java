import java.util.*;

public class Board {
	private int size;
	private List<Snake> snakes;
	private List<Ladder> ladders;
	private List<Cell> board;
	private List<Pawn> pawns;
	
	public Board(int size,List<Snake> snakes,List<Ladder> ladders,List<Pawn> pawns) {
		this.size = size;
		this.snakes = snakes;
		this.ladders = ladders;
		this.pawns = pawns;
		
		board = new ArrayList<Cell>();
		for(int i = 0;i <= size; i++) {
			board.add(new Cell());
		}
		
		for(int i = 0;i < snakes.size(); i++) {
			Snake snake = snakes.get(i);
			board.set(snake.getHead(),new Cell(snake));
		}
		
		for(int i = 0;i < ladders.size(); i++) {
			Ladder ladder = ladders.get(i);
			board.set(ladder.getstart(),new Cell(ladder));
		}
		
		for(int i = 0;i < pawns.size(); i++) {
			pawns.get(i).setPosition(0);
		}
	}
	
	public Cell getCell(int i) {
		return board.get(i);
	}
	
	public void setCell(int i,Pawn pawn) {
		board.get(i).setPawn(pawn);
	}
	
	public int getSize() {
		return size;
	}
}
