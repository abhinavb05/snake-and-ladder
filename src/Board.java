import java.util.*;

public class Board {
	private int size;
	private Map<Integer,Integer> snakes = new HashMap<Integer,Integer>();
	private Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();
	
	public Board(int size,ArrayList<ArrayList<Integer> > snakes,ArrayList<ArrayList<Integer> > ladders) {
		this.size = size;
		
		for(int i = 0;i < snakes.size(); i++) {
			this.snakes.put(snakes.get(i).get(0),snakes.get(i).get(1));
		}
		
		for(int i = 0;i < ladders.size(); i++) {
			this.ladder.put(ladders.get(i).get(0),ladders.get(i).get(1));
		}
	}
	
	public int getPosition(int position) {
		if(this.snakes.containsKey(position)) {
			return this.snakes.get(position);
		}
		
		else if(this.ladder.containsKey(position)) {
			return this.ladder.get(position);
		}
		
		else {
			return position;
		}
	}
}
