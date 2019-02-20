package stockmarket;

import java.util.Date;
import java.util.Scanner;


/*
 * In the class 'Main' I ask for some input values from the user. These input values can be employed to compute all the required quantities of the assignment.
 */

public class Main {
	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		String str;

		Boolean running = true;
		Stock stock;
		Trade trade; 
		
		
		// I now run part a. of the assignment.
			
		System.out.println("Please select a stock symbol amongst TEA, POP, ALE, GIN, JOE.");
		str = input.next();	
		
		System.out.println("Please insert the stock price in pennies.");
		int price = input.nextInt();

		stock = new Stock(StockSymbol.valueOf(str), price);
		trade = new Trade(StockSymbol.valueOf(str));
			
		System.out.println("The dividend yield for the selected stock is " + stock.dividendYield() + ".");
		System.out.println("The P/E ratio for the selected stock is " + stock.peRatio() + ".");
		
		
		while(running) {
				
			System.out.println("Please type 't' if you want to record a trade, type 'v' to compute the volume weighted stock price, or type 'q' to quit.");
			str = input.next();	
				
			switch(str) {
			case "t":
				System.out.println("Please enter the following informations for your trade: quantity of shares, 'Buy' or 'Sell' indicator and traded price in pennies.");
				int shareQuantity = input.nextInt();
				str = input.next();
				int tradedPrice = input.nextInt();
				Date date = new Date();
				trade.addTradeRecord(new TradeRecord(date.getTime(),shareQuantity,Indicator.valueOf(str),tradedPrice));
				break;
			case "v":
				System.out.println("The volume weighted stock price is " + trade.volumeWeightedStockPrice() + ".");
				break;
			case "q":
				running = false;
				break;		
			default:
				System.out.println("Invalid letter, please try again.");		
			}
			
				
		}
			
	
		// I now run part b. of the assignment.
		
		StockPile stockpile = new StockPile();
		int[] prices = new int[5];
			
		System.out.println("Please provide prices for all stock types, in pennies.");
		for(int i=0;i<5;i++) {
			prices[i] = input.nextInt();
			stockpile.addStock(new Stock(StockSymbol.values()[i],prices[i]));	
		}
			
		System.out.println("The GBCE All Share Index is given by " + stockpile.GBCE() + ".");
		
		
		input.close();
	}

}
