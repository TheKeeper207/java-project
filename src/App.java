import java.util.Scanner;

public class App{
	static Scanner sc = new Scanner(System.in);
	static String name = "";

	public App(){}

	public static void main(String[] args){
		System.out.print("Type your name!");
		name = sc.next();
		System.out.println("hello: " + name);
	}

}
