package drink.coster.factory;
import java.util.*;
import java.text.DecimalFormat;
public class DrinkCoasters {
		public static void main(String[] args) {
			 
			double code;
	 
			DecimalFormat f = new DecimalFormat("##.##");
	 
			Scanner sc = new Scanner(System.in);
	 
			System.out.println("Hi, Welcome to the Drink Costers!");
	 
			System.out.println("Price and other details may vary based on product size and color ");
			
			System.out.println("\n1. Kaizen Casa Wooden Coasters for Drinks - Natural Acacia Wood Drink Coaster Set for Drinking Glasses - $ 12.89 ");
			System.out.println("\n2. Kaizen Casa 4 Piece Set, Natural Acacia Wood Coasters, Set of 4 - $ 9.69");
			System.out.println("\n3. Wooden Coasters for Drinks - Natural Acacia Wood Drink Coaster Set for Drinking Glasses - $ 15.99");
			System.out.println("\n4. ARTISAN 6 Piece Round Acacia Wood Coaster Sets - Unique Rustic Wood Coasters for Drinks - 14.99 ");
			System.out.println("\n5. Wood Coasters for Drinks, 6 PCS Walnut Wooden Drink Coasters, Absorbent Heat Resistant Reusable - $  10.00 ");
			
			
			
			System.out.println("Which coster will you purchase ?");
			code = sc.nextInt();
	 
			if (code == 1) {
				System.out.println("\nThank you for buying Kaizen Casa Wooden Coasters for Drinks - Natural Acacia Wood Drink Coaster Set for Drinking Glasses - $ 12.89 ");
				
			} else if (code == 2) {
				System.out.println("\nThank you for buying Kaizen Casa 4 Piece Set, Natural Acacia Wood Coasters, Set of 4 - $ 9.69");
				
			} else if (code == 3) {
				System.out.println("\nThank you for buying Wooden Coasters for Drinks - Natural Acacia Wood Drink Coaster Set for Drinking Glasses - $ 15.99");
			} else if (code == 4) {
				
				System.out.println("\nThank you for buying ARTISAN 6 Piece Round Acacia Wood Coaster Sets - Unique Rustic Wood Coasters for Drinks - 14.99 ");

			} else if (code == 5) {
				System.out.println("\nThank you for buying Wood Coasters for Drinks, 6 PCS Walnut Wooden Drink Coasters, Absorbent Heat Resistant Reusable - $  10.00 ");
	 
			} else {
				System.out.println("Invalid input");
			}
			
			System.out.println("Thank you for choosing our  Programs");
		}
	 
	}

