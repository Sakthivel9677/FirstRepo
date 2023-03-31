package Revision;


public class Bank {
	private String name;
	private String branch;
	private long contactNo;
	
	public Bank(String name,String branch,long contactNo) {
		this.name=name;
		this.branch=branch;
		this.contactNo=contactNo;
		
	}
	public String toString () {
		return name+"  "+branch+" "+contactNo;
	}

}
