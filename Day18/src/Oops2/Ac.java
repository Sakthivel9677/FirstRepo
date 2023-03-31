package Oops2;

public class Ac extends Fan {  //ChildClass inheritance
	int price;
	String brand;
	int temp;
	public String temp(int temp) {
		if(temp>=20) {
			return  "very cool";
		}
		else {
			return "hot";
		}
	}

}
