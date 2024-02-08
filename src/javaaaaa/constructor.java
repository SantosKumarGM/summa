package javaaaaa;

public class constructor {
	public constructor() {
		this(123);
		System.out.println("default ");	
	}
	
	public constructor(int id) {
		this("sandy");
		System.out.println("default "+id);	
	}
	
	public constructor(String name) {
		this(11.5f);
		System.out.println("string "+name);	
	}
	
	public constructor(float value) {
		//this("123.32f");
		System.out.println("float "+value);	
	}
	
	public static void main(String[] args) {
		constructor a = new constructor();
	}
}
