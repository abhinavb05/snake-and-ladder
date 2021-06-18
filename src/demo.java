import java.util.*;

public class demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Size of board: ");
		int size = scanner.nextInt();
		
		System.out.println("Number of snakes: ");
		int numberOfSnakes = scanner.nextInt();
		
		ArrayList<ArrayList<Integer> > snakes = new ArrayList<ArrayList<Integer> >();
		for(int i = 0;i < numberOfSnakes; i++) {
			System.out.println("Head of snake "+i+":");
			int head = scanner.nextInt();
			
			System.out.println("Tail of snake "+i+":");
			int tail = scanner.nextInt();
			
			snakes.add(i,new ArrayList<Integer>(Arrays.asList(head,tail)));
		}
		
		System.out.println("Number of ladders: ");
		int numberOfLadders = scanner.nextInt();
		
		ArrayList<ArrayList<Integer> > ladders = new ArrayList<ArrayList<Integer> >();
		for(int i = 0;i < numberOfLadders; i++) {
			System.out.println("Start of ladder "+i+":");
			int start = scanner.nextInt();
			
			System.out.println("End of ladder "+i+":");
			int end = scanner.nextInt();
			
			ladders.add(i,new ArrayList<Integer>(Arrays.asList(start,end)));
		}
		
		Board board = new Board(size,snakes,ladders);
		
		System.out.println("Enter number of players: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Player> players = new ArrayList<Player>();
		for(int i = 0;i < n; i++) {
			System.out.println("Enter player name: ");
			String s = scanner.nextLine();
			players.add(new Player(s));
		}
		
		Game game = new Game(board,players);
		game.executeGame();
	}
}
