package neu.edu.csye6200;

public class Item {
	public static final int REVISION = 2;
	private int price;
	private String label;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int price, String label) {
		super();
		this.price = price;
		this.label = label;
	}

	@Override
	public String toString() {
		return "Item [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
