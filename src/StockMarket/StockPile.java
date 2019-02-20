package StockMarket;

import java.util.LinkedList;
import java.lang.Math;

public class StockPile {
	
	LinkedList<Stock> object = new LinkedList<Stock>();
	
	
	public void addStock(Stock stock) {
		
		this.object.add(stock);
	}
	
		
	public double GBCE() {
		
		int product = 1;
		Stock tempStock;
		
		for(int i=0; i<object.size();i++) {
			tempStock = object.get(i);
			product *= tempStock.getStockPrice();
		}
		
		return Math.pow(product,(double)1/(double)object.size());
	}
	
	
}
