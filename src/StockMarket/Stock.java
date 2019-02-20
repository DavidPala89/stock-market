package StockMarket;

public class Stock {
	
	private int stockPrice;
	private StockSymbol stockSymbol;

	
	public Stock(StockSymbol stockSymbol, int stockPrice) {
		
		this.stockSymbol = stockSymbol;
		this.stockPrice = stockPrice;
	}
	
	public int getStockPrice() {
	
		return stockPrice;
	}
	
	
	/* 
	 In the next method, I will assume that 'stockPrice' is always positive (as shares should always have a non-zero price). 
	 For this reason, I don't implement a try block and a catch block.
	 */
	
	public double dividendYield() {
		
			if(stockSymbol.getStockType()==StockType.Common){
				return (double)stockSymbol.getLastDividend()/(double)stockPrice;
			}
			else {
				return 0.01*(double)stockSymbol.getFixedDividend()*(double)stockSymbol.getParValue()/(double)stockPrice;			
			}
	}
	
	
	public double peRatio() {
		
		return (double)stockPrice/dividendYield();
	}
	

}
