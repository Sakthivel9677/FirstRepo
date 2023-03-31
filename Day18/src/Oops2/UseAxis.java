package Oops2;

public class UseAxis { //polymorphism-method overriding
	public static void main(String[]args) {
		Axis a=new Axis();
		System.out.println(a.getInterest(5000,500));
		System.out.println(a.getInterest(2300,500));
		a.show(); //for super key word
	}

}
