package stockmarket;


/*
 * In the 'StockSymbol' enum I keep track of the informations provided in Table 1 of the exercise.
 * The members with 'Common' type have 3 values. Namely: stock type, last dividend and Par Value.
 * The members  with 'Preferred' type (only GIN in this scenario) have 4 values. Namely: stock type, last dividend, fixed dividend and par value.
 */

public enum StockSymbol {
	
	TEA(StockType.Common,0,100),											
	POP(StockType.Common,8,100),											
	ALE(StockType.Common,23,60),
	GIN(StockType.Preferred,8,2,100),
	JOE(StockType.Common,13,250);
	
	private StockType stockType;
	private int lastDividend;
	private double fixedDividend;
	private int parValue;
	
	
	private StockSymbol(StockType stockType, int lastDividend, int parValue){
		
		this.stockType = stockType;
		this.lastDividend = lastDividend;
		this.fixedDividend = 0;
		this.parValue = parValue;		
	}
	
	
	private StockSymbol(StockType stockType, int lastDividend, double fixedDividend, int parValue){
		
		this.stockType = stockType;
		this.lastDividend = lastDividend;
		this.fixedDividend = fixedDividend;
		this.parValue = parValue;
	}
	
	
	public StockType getStockType() {
		
		return this.stockType;
	}
	
	
	public int getLastDividend() {
		
		return this.lastDividend;
	}
	
	
	public double getFixedDividend() {
		
		return this.fixedDividend;
	}
	
	
	public int getParValue() {
		
		return parValue;
	}
	

}
