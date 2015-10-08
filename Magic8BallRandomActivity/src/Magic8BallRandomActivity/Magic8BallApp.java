package Magic8BallRandomActivity;
import java.util.Scanner;

public class Magic8BallApp {
	public static void main(String[] args) {
		Magic8Ball game = new Magic8Ball();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Do you want to play the Magic 8 Ball game? yes or no: ");
		String input = scan.nextLine();
		
		while (input.equalsIgnoreCase("yes")){
			System.out.println("Please ask a question");
			input = scan.nextLine();
			System.out.println(game.shakeIt());
			System.out.print("\nWould you like to play agian? yes or no: ");
			input = scan.nextLine();
		}
	}

}
