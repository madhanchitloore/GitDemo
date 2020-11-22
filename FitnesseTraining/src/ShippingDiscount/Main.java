package ShippingDiscount;

public class Main {
	private int weight;
	private int distance;
	
	public static void main (String[] args) {}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public String computeDiscount() {
		if (weight < 100 || distance < 500) {
			return "Datex Shipping offers discount";
		} else {
			return "Datex Shipping offers no discount";
		}
	}
}
