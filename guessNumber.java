import java.util.Scanner;
import java.util.Random;

public class guessNumber{
	public static void main(String[] args){
		System.out.println("I will pick a random number between 1 and your number");
		System.out.println("If u pick 0 then I end the game \n");
		System.out.println("What is your number?");
		Scanner sc = new Scanner(System.in);
		int upper = sc.nextInt();
		if(upper == 0) return;

		int randomNumber = random(upper);
		guess(randomNumber, sc);
	}
	//Random number generator
	//in the range of <1, upper>
	public static int random(int upper){
		Random rand = new Random();
		return rand.nextInt(upper) + 1;
	}

	public static void guess(int value, Scanner sc){
		int attempt = 0;
		int attemptCount = 0;
		do {
			System.out.println("Try to guess my number");
			attempt = sc.nextInt();
			attemptCount++;
		} while(attempt != value);

		System.out.println("Congratulations!!!");
		System.out.format("It only took you %d tries", attemptCount);
	}

}
