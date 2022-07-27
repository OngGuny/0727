
public class HelloNeo3 {
	//String str = "Hello Neo";
	static String str = "Hello Neo";		// 같은 static 안에 있는걸로 취급함  Static variable 이거나 class variable 임.   static 주소 없이 접근이 가능하다. class 안에 있는게 아니다. 
													//또한 밑의 메인이 시작하기전에 메모리에 먼저 올라오는 변수다. 언제 사라지는지 모른다. 
													// 현재 helloneo 3에는 하나도 없는상태. 전부 static으로 빠져나갔기떄문 
	public static void main(String[] args) {
		System.out.println("str = "+str);
		
	}
}
// 1과 같은데 앞에 static 을 정의해줌 