/*This piece of code returns the sum of multiples of 3 and 5 
between 0 and an user defined limit*/

import java.util.Scanner;

public class threeAndFive {

	public threeAndFive() {
		Scanner input = new Scanner(System.in);
		System.out.println("Type the superior limit");
		int limit = input.nextInt();
		int sumatron = 0;
		for (int i=0;i<limit;i++){
			if(i%3==0 || i%5==0){
				sumatron += i;	
			}
		}
		System.out.println("The result is: " + sumatron);
	}
}
