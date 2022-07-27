import java.util.Scanner;
public class Piw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Haksang Neo = new Haksang();
		Neo.name =sc.nextLine();
		System.out.println("이름 : "+Neo.name);
	}
}




class Haksang {
	String name;
	String hakbun;
	int age;
	double height; 
}
	