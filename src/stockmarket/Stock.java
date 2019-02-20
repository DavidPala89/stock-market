package stockmarket;


/*
 * The class 'Stock' returns the dividend Yield and the P/E ratio.
 */

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
	 * In the next method, I am assuming that 'stockPrice' is always positive (as shares should always have a non-zero price). 
	 */
	
	public double dividendYield() {
		
			if(stockSymbol.getStockType()==StockType.Common){
				return (double)stockSymbol.getLastDividend()/(double)stockPrice;
			}
			else {
				return 0.01*(double)stockSymbol.getFixedDividend()*(double)stockSymbol.getParValue()/(double)stockPrice;			
			}
	}
	
	
	/*
	 * P/E ratios can be equal to infinity? (as in the case of TEA stocks?)
	 */
	
	public double peRatio() {
		
		return (double)stockPrice/dividendYield();
	}
	

} 
