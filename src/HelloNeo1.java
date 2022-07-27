
public class HelloNeo1 {
	String str = "Hello Neo";  //얘는 특정 메소드에 포함되어있지않음;  클래스안에있긴함 -> 로컬 변수가 아님. Member Variable or Instance Variable. 이라고함
										//이 변수는 클래스가 만들어 질 때 정의됨. 
	public static void main(String[] args) {
		//local variable : 자기가 선언된 지역에서만 사용하기 위함. 자동으로 만들어지고 소멸됨. 
	//	String str = "Hello World";
		//이 변수는 여기서만 사용가능. 
		HelloNeo1 hn = new HelloNeo1();
		System.out.println("str = "+ hn.str);  // static 밖의 변수를 가져와서 나타내라고하면 오류뜸. non-static 필드의 변수라서 못가져옴.  static 안이 집(membership)이고 class안이 아파트단지(공유장소).  그럼 집을 어케만들어줌? -> new 
		//String str; 단 이렇게 쓰면 오류뜸. 사용하기전에 초기화를 하지 않아서.  변수 안에 뭐가들어있는지 모르기때문에 오류생김 
	}// 이 블록 안에서만 지역변수(str)가 사용됨. main블록{} 끝나기 직전에  자동 삭제. 이게 자동소멸된다는거. 
}
		// hn이라고만 하면 주소가 나타난다.그 안에있는 변수를 가져오려면 hn(주소).(의)변수 str 이라고 쳐줘야한다. 
// 여기는 패키지 클래스 자체에 있는 변수. 