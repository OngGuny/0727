
public class HelloNeo5 {
	public static void main(String[] args) {
		//괄호가 있으면 메소드라고 한다. 괄호 안에 넣으면 나에게 산출물을 리턴한다.  
		//이름이 main 왼쪽에 있는게 반환하는타입. 오른쪽에 있는게 입력방식.  
		//이번에는 메인안쓰고 표현해보려고함
			display();
	}	
		
	 //이름 리턴타입 괄호 
	static void display() { /* static method or class method 
		관례로 중괄호를 위에서부터 염;  디스플레이를 호출, 호출하면 일함  메소드는 이름을 불러야만 일함.  보이드는 디스플레이가 끝나고 메인으로 복귀할때 빈손으로 돌아감 */
		System.out.println("Hello, Neo");
	} // 메인에서 디스플레이를 부름. 디스플레이가 일함. 헬로 네오를 출력하고 중괄호 끝나는 지점에서 다시 메인으로 , 호출한 시점으로 돌아감 그뒤에 메인인 중괄호가 끝남. 
		// 이런 흐름에서 디스플레이 끝나고 돌아갈때 보이드가 빈손으로 돌아가라고 하는거임.  
	// 공유 지역은 주소를 카피하지않는다. 
	
}
