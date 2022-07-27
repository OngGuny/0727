
public class CopyDemo2 {
public static void main(String[] args) {
	Product mouse = new Product();		
	mouse.price =20_000;
	Product keyboard = mouse;  //주소복사
											// new로써 새로 판게 아님. 
											//하나의 주소를 마우스와 키보드가 가리키고 있는 것. 
	
	System.out.println("Before Change");
	System.out.println("mouse's Price = "+mouse.price);
	System.out.println("keyboard's Price = "+keyboard.price);

	System.out.println("After Change");
	mouse.price = 30_000;
	System.out.println("mouse's Price = "+mouse.price);
	System.out.println("keyboard's Price = "+keyboard.price);

	
	
	
}
}


class Product{
	int price;
}
