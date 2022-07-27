
public class HelloNeo2 {
public static void main(String[] args) {
	//변수가 아래의 테스트클래스에 있으니 테스트클래스 집을 만들어서 변수를 가져오는거
	Test t = new Test();
	System.out.println("str="+t.str);  // 변수를 못찾았어 
}
}

class Test {
	String str ="Hello Neo2";
}
// 1과 다른점  다른 클래스의 변수를 가져오는것. 