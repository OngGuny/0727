
public class HelloNeo4 {
public static void main(String[] args) {
	System.out.println("msg= "+Demo.msg); // 다른 class에 있는 msg를 어떻게 가져올건가.  static은 주소로 가져오는 변수가 아니다.  공유장소에 있다는 거. 
													  // 현재 msg는 Demo라는 클래스에 있는 변수 member변수가 아니고 class변수.  그렇기에 msg앞에 변수가 있는 클래스의 주소를 붙여준다. 
													// 이건 system.out 도 마찬가지다 

}															
}

class Demo{
	static String msg = "Hello, Neo";
}
	