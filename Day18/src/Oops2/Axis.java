package Oops2;

public class Axis extends RBI { //polymorpohism-method overriding
	public int getInterest(int amount,int interest) {
		return amount+interest;
	}

	public void show() {  //superkeyword
		System.out.println(super.getInterest(2300,500));
	}
}
