package Oops2;

public class UseBike {
	public static void main (String[] args) {  //Useclass inheritance
		Bike b=new Bike();
		b.price=12345;
        b.brand="Honda";
		b.isGear=false;
		b.speed=220;
		b.isPetrol=true;
		System.out.println(b.discount(12));
		System.out.println(b.speed());
		System.out.println(b.check("honda"));
		
	}

}
