package StockMarket;

public class TradeRecord {

	private long date;
	private int shareQuantity;
	private Indicator indicator;
	private int tradedPrice;
	
	
	public TradeRecord(long date, int shareQuantity, Indicator indicator, int tradedPrice) {
		
		this.date = date;
		this.shareQuantity = shareQuantity;
		this.indicator = indicator;
		this.tradedPrice = tradedPrice;
	}
	
	
	public long getDate() {
		
		return date;
	}
	
	
	public int getShareQuantity() {
		
		return shareQuantity;
	}
	
	
	public int getTradedPrice() {
		
		return tradedPrice;
	}
	
	
	
	
	
}
