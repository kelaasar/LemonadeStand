
public class Materials {
	Package p1;
	Package p2;
	Package p3;
	
	public Materials(int quantity1, int quantity2, int quantity3) {
		p1 = new Package(quantity1, 1);
		p2 = new Package(quantity2, 1);
		p3 = new Package(quantity3, 1);
	}
	public Package getPackage1() {
		return p1;
	}
	public Package getPackage2() {
		return p2;
	}
	public Package getPackage3() {
		return p3;
	}
}
