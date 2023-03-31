package Oops2;

public class Student {    //polymorphism (method overloading)---1type
	public String subject(int science,int english) {
		return science+english+" total";
	}
	public String subject(float science,float english) {
		return science+english+" total";
	}
	public String subject(String subject) {
		if(subject.equals("maths")) {
			return subject+"is this sem subject";
		}
		else {
			return subject+"is not this sem subject";
		}}
		public static void main(String args[]) {
			Student s=new Student();
			System.out.println(s.subject(23,45));
			System.out.println(s.subject(23.4f,66.7f));
			System.out.println(s.subject("english"));
		}
}
