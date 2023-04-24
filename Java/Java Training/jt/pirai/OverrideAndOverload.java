package jt.pirai;

import java.util.Scanner;

class OverLoad{
	private String name;
	private String clgName;
	private int idNum;
	OverLoad(){
	System.out.println("Default Constructor called");
	}
	OverLoad(String name,int idNum){
		this.name =name;
		this.idNum =idNum;
	}
	OverLoad(String name,int idNum,String clgName){
		this(name,idNum);
		this.clgName = clgName;
		
	}
	public  String getName() {
		return name;
	}
	public String getClgName() {
		return clgName;
	}
	public int getIdNum() {
		return idNum;
	}
	public void DisplayDetails() {
		
	}
	
}

class OverRide extends OverLoad{

	OverRide(String name,int idNum,String clgName){
		super(name,idNum,clgName);
	}
	public void DisplayDetails() {
		System.out.println(getName()+" "+getIdNum()+" "+getClgName());
	}
}

public class OverrideAndOverload {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String name = s.next();
		String clgName = s.next();
		int idNum = s.nextInt();
		OverLoad ol = new OverLoad();
		OverLoad ol1 = new OverLoad(name,idNum);
		System.out.println("parameterized Constructor called");
		System.out.println("Name : "+ol1.getName());
		System.out.println("Name : "+ol1.getIdNum());
		OverLoad ol2 = new OverLoad(name,idNum,clgName);
		System.out.println("parameterized Constructor called");
		System.out.println("Name : "+ol2.getName());
		System.out.println("Name : "+ol2.getIdNum());
		System.out.println("Name : "+ol2.getClgName());
		System.out.println("Details of Students ");
		OverRide or = new OverRide(name,idNum,clgName);
		or.DisplayDetails();
	}

}
