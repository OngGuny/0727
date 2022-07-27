
public class HelloNeo8 {
	public static void main(String[] args) {
		Seoul.display(); // static으로 밑에서 디스플레이를 지정해줬기 때문에 바로 서울.의 디스플레이 해준것.
		Deagu.display();
		Kwangju.display();
	}
}

class Seoul {
	static void display() {// static method
		System.out.println("Hello, Neo8");
	}
}

class Deagu {
	static void display() {// static method
		System.out.println("Hello, 대구");
	}
}

class Kwangju {
	static void display() { // static method
		System.out.println("Hello, 광주");
	}
}
