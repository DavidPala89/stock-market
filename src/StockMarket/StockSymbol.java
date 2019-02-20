package StockMarket;

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
