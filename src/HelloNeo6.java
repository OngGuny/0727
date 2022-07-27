
public class HelloNeo6 {
	public static void main(String[] args) {
		HelloNeo6 hn = new HelloNeo6();	// new로 집을 만들어준다. helloNeo6의 hn이라는 방. 
		hn.display();
			
	}	
		
	 void display() { /* static method or class method /  스태틱을 지우면 오류뜸.  static 이 있으면 주소가 없어도 접근이 가능한데. 그게아니면 멤버변수로써 주소가 필요함 
	 						근데 집을 안지어서 집이없음. 접근불가 */
		System.out.println("Hello, Neo");
}
}