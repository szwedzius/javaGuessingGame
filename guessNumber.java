import java.util.Scanner;
import java.util.Random;

public class guessNumber{
	public static void main(String[] args){
		System.out.println("I will pick a random number between 1 and your number");
		System.out.println("What is your number?");
		Scanner sc = new Scanner(System.in);
		int upper = sc.nextInt();
		System.out.format("Your number is %d",upper);

		int randomNumber = random(upper);
		System.out.format("The randomly selected number is %d", randomNumber);
	}
	//Random number generator
	//in the range of <1, upper>
	public static int random(int upper){
		Random rand = new Random();
		return rand.nextInt(upper) + 1;
	}

}
