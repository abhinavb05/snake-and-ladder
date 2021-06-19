import java.util.*;

public class demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Size of board: ");
		int size = scanner.nextInt();
		
		System.out.println("Number of snakes: ");
		int numberOfSnakes = scanner.nextInt();
		
		List<Snake> snakes = new ArrayList<Snake>();
		for(int i = 0;i < numberOfSnakes; i++) {
			System.out.println("Head of snake "+i+":");
			int head = scanner.nextInt();
			
			System.out.println("Tail of snake "+i+":");
			int tail = scanner.nextInt();
			
			Snake s = new Snake(head,tail);
			snakes.add(s);
		}
		
		System.out.println("Number of ladders: ");
		int numberOfLadders = scanner.nextInt();
		
		List<Ladder> ladders = new ArrayList<Ladder>();
		for(int i = 0;i < numberOfLadders; i++) {
			System.out.println("Start of ladder "+i+":");
			int start = scanner.nextInt();
			
			System.out.println("End of ladder "+i+":");
			int end = scanner.nextInt();
			
			Ladder l = new Ladder(start,end);
			ladders.add(l);
		}
		
//		Board board = new Board(size,snakes,ladders);
		
		System.out.println("Enter number of players: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Player> players = new ArrayList<Player>();
		for(int i = 0;i < n; i++) {
			System.out.println("Enter player name: ");
			String s = scanner.nextLine();
//			players.add(new Player(s));
		}
		
//		Game game = new Game(board,players);
//		game.executeGame();
	}
}
