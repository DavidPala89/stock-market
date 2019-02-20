package stockmarket;

import java.util.Date;
import java.util.LinkedList;


/*
 * The purpose of the class 'Trade' is to compute the Volume Weighted Stock Price. 
 */

public class Trade {
	
	private LinkedList<TradeRecord> object = new LinkedList<TradeRecord>();
	private StockSymbol stockSymbol;
	
	
	public Trade(StockSymbol stockSymbol){
		
		this.stockSymbol = stockSymbol;
	}
	
	
	public void addTradeRecord(TradeRecord record) {
		
		this.object.add(record);
	}
	
	
	/* 
	 * In the next method, I set the Volume Weighted Stock Price equal to 0 if 'object' is empty. 
	 * Otherwise, I am assuming that the Volume Weighted Stock Price is always positive.
	 */
	
	public double volumeWeightedStockPrice() {
		
		int position = object.size()-1;
		if(position==-1) {
			System.out.println("You have no trade records");
			return 0;
		}

		Date date = new Date();
		int totalShareQuantity = 0;
		int totalSumTradedPriceQuantity = 0;
		TradeRecord tempRecord;
		
		while(position>=0) {
			
			tempRecord = object.get(position);
			
			if(date.getTime()-tempRecord.getDate()<900000) {							// 15 minutes are 900000 milliseconds
		
				totalSumTradedPriceQuantity += tempRecord.getShareQuantity()*tempRecord.getTradedPrice();
				totalShareQuantity += tempRecord.getShareQuantity();
				position -=1;
			}
	
			else break;
		}
		
		return (double)totalSumTradedPriceQuantity/(double)totalShareQuantity;
	}

	
}
