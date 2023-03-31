package Revision;


public class SBIBank extends Bank {
	private int noOfAccounts;
	private boolean isPrivateBank;
	public SBIBank (int noOfAccounts,boolean isPrivateBasic,String name,String branch,long contactNo) {
		super(name,branch,contactNo);
		this.noOfAccounts=noOfAccounts;
		this.isPrivateBank=isPrivateBank;
		
	}
	public String toString() {
		return super.toString()+" "+noOfAccounts+" "+isPrivateBank;
	}

}
