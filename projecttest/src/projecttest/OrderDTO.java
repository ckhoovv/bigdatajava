package projecttest;

public class OrderDTO {
	String number;
	String menu;
	String amount;
	String price;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderDTO [number=" + number + ", menu=" + menu + ", amount=" + amount + ", price=" + price + "]";
	}
	
	

}
