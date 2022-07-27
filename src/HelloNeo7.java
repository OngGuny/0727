
public class HelloNeo7 {
	public static void main(String[] args) {
		Busan bu = new Busan();
		bu.display(); // 얘 혼자있으면 클래스 내에서 찾기때문에 못찾음. 주소 알려줘야함 
	}
}

class Busan{
	void display() { //member method > 주소로 접근
		System.out.println("Hello, Neo7");
	}
	
}