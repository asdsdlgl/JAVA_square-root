package hw4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Babylonian {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		double num = keyboard.nextDouble();
		double guess,r,lastguess;
		guess = num/2;
		lastguess = guess;
		while(true){
			r = num/guess;
			guess = (guess+r)/2;
			if(Math.abs(lastguess/guess-1)<=0.01){
				break;
			}
			lastguess = guess;
		}
		String str = df.format(guess);
		System.out.print(str);
	}

}
