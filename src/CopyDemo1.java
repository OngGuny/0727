
public class CopyDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.price=25_000_000;
		
		Car matiz = new Car();
		matiz.price=sonata.price;		// 자동차 클래스. 새로운 자동차 2개. 
												//복사한것은 주소가 아닌. 25이라는 값을 복사한 것. 그래서 같이 안바뀜.
		
		System.out.println("Before Change");
		System.out.println("Sonata's Price = "+sonata.price);
		System.out.println("Matiz's Price = "+matiz.price);
	
		System.out.println("After Change");
		sonata.price=100000000;
		System.out.println("Sonata's Price = "+sonata.price);
		System.out.println("Matiz's Price = "+matiz.price);
	
	}
}


// 새로운 클래스는 패키지 안에서 새로운 퍼블릭클래스가 될 수는 없다 
class Car {
	int price;
	
}