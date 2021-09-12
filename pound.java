package designpattern.usdollar;
import java.util.*;
import java.text.DecimalFormat;
public class pound {
	public static void main(String[] args) {
		 
		double amount, dollar,  code;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("hi, Welcome to Drink coster !");
 
		System.out.println("which currency You want to Convert to US dollars ? ");
		
		System.out.println("1:Ruppe \t2:Pound \t3:Euro \t4:Yen \t5:Ringgit ");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (code == 1) {
 
			dollar = amount / 70;
			System.out.println("Your " + amount + " Rupee is: " + f.format(dollar) + " US Dollar");
		} else if (code == 2) {
			// For Pound Conversion
 
			dollar = amount * 1.26;
			System.out.println("Your " + amount + " pound is: " + f.format(dollar) + " US Dollar");
			
		} else if (code == 3) {
			// For Euro Conversion
 
			dollar = amount * 1.14;
			System.out.println("Your " + amount + " euro is: " + f.format(dollar) + " US Dollar");
 
		} else if (code == 4) {
			// For Yen Conversion

			dollar = amount * 0.008;
			System.out.println("Your " + amount + " yen is: " + f.format(dollar) + " US Dollar");

		} else if (code == 5) {
			// For Ringgit Conversion
 
			dollar = amount * 0.239;
			System.out.println("Your " + amount + " ringgit is: " + f.format(dollar) + " US Dollar");
 
		} else {
			System.out.println("Invalid input");
		}
		
		System.out.println("Thank you for choosing our  Programs");
	}
 
}
