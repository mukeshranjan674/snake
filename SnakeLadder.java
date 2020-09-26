public class SnakeLadder{
	
	public static int position_a = 0 , position_b = 0 , position = 0;
	public static int die_count = 0;
	
	public static void main(String[] args) {
		twoPlayer();
	}
	
	public static int rollDie() {
		int die = 0;
		while(die == 0) {
			die = (int)(Math.floor(Math.random() * 10) % 7);
		}
		die_count++;
		System.out.print("Die Value is : "+die);
		return die;
	}
	public static int checkOption() {
		int check = (int)(Math.floor(Math.random() * 10) % 3);
		int value = rollDie();
		switch(check) {
			case 1:
				position = position + value;
				if (position > 100)
					position = position - value;
				System.out.println(" [Option : Ladder]\n" + " Player moves to position " + position + "\n");
				break;
				
			case 2:
				position = position - value;
				if (position < 0)
					position = 0;
				System.out.println(" [Option : Snake]\n" + " Player moves to position " + position + "\n");
				break;
			default:
				System.out.println(" [Option : No Play]\n" + " Player remains at position " + position + "\n");	
		}
		
		return check;
	}
	
	public static void twoPlayer() {
		int term = 2; int check = 0;
		System.out.println("Snake and Ladder game played with two players starting at position 0");
		while(position_a < 100 && position_b < 100) {
			int turn = term % 2;
			if (turn == 0) {
				term++;
				do {
					System.out.println("Player A at " + position_a);
					position = position_a;
					check = checkOption();
					position_a = position;
				}while(check == 1 && position_a != 100);
			}
			
			else {
				term++;
				do {
					System.out.println("Player B at " + position_b);
					position = position_b;
					check = checkOption();
					position_b = position;
				}while(check == 1 && position_b != 100);
			}
		}
		if (position_a == 100)
			System.out.println("Player A won !!!");
		else
			System.out.println("Player B won !!!");
	}
}