package Oops2;

public class Bike extends Cycle {  //childclass
	int speed;
	boolean isPetrol;
	public String speed() {
		if(speed>180) {
			return "high speed";
		}
		else {
			return "low speed";
		}
	}
		public String check(String brand) {
			if(brand.equals("honda")) {
				return "belongs to honda company";
			}
			else {
				return "belongs to other company";
			}
	}
	}


