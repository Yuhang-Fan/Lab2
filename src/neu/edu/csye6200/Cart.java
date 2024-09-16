package neu.edu.csye6200;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cart {
	public static final int REVISION = 1;
	private StringBuilder items = new StringBuilder();
	private int change = 20;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(StringBuilder items, int change) {
		super();
		this.items = items;
		this.change = change;
	}

	@Override
	public String toString() {
		return "Cart [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	public void addItem(Item item) {
		items.append(item.toString());
		this.change = this.change - item.getPrice();
	}
	
	public static void demo() {
		Cart c = new Cart();
		Item item1 = new Item(3, "pen");
		Item item2 = new Item(4, "textbook");
		
		c.addItem(item1);
		c.addItem(item2);
		System.out.println(item1.getLabel() + "  " + item1.getPrice());
		System.out.println(item2.getLabel()+ "  " + item2.getPrice());
		System.out.println("total: " + "  " + (20-c.getChange()));
		System.out.println("change: " + "  " + c.change);
		SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");  
        Date date = new Date();
        System.out.println("time" + sdf.format(date));
	}
}
