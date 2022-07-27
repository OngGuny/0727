
public class StringDemo {
	public static void main(String[] args) {
		//		String name ; 								// 선언, declaration / string 으로 선언했으니 name 이란 변수에는 주소밖에못들어감 값은 못들어감 
		//			name = "한지민";						// = , 할당 , Assignment  한지민이란 이름을 네임이란 주소에 넣어.  선언한 주소에 값을 할당 
		//			System.out.printf("이름=%s\n",name);

		//		String name = new String("한지민"); // 괄호() 가 메소드 함수.?      constructor 생성자 api 가보면 string을 15가지 방법으로 만들 수 있다. 괄호로 새 집을 짓는것. 
		//		System.out.printf("이름=%s\n",name);
		//			String name = "한지민"; 		// 초기화, initialization ,  선언+할당. 한번에 하든 따로하든. 
		// 결론: new로 정의해서 한지민을 하나  위에 선언할당 한거나 결과는 같다.  
		// 원칙은 new를 쓰는건데 많이쓰기에 편하게 하려고 선언할당 만든 것. 컴퓨터는 new로 인식. 
		//출력하는 포멧은 %s 사용 
//--------------------------------------------------------------------------------------------
		String name = new String("한지민");
		
		Student jimin; 	//선언한다. 값 말고 주소만 넣을 게 .  할당 해야지 
		jimin = new Student(); // 할당 
		// stack 에 jimin, name 들어감 
		// 주소 변수(age, name, jimin는 메모리 시작지점 주소만 지정한다.  그 왼쪽에 자료의 타입 쓰는건 시작지점으로부터 몇칸을 가는지 설정하는거. 
		// student만큼만 가세요, scanner 만큼만 가세요. 이렇게. 
		//메모리 스택에 jimin 만듦.  4바이트라고 가정 
		//나는 여기에 스튜던트만큼만 바라보겠다. 스튜던트는 4바이트 짜리로 이루어진 5개의 방을가짐. -> 20바이트짜리. 
		//이러면 처음 주소에서 20바이트까지 찾아간다는 것. 
		
		jimin.name = "한지민";  //학번과 이름의 데이터는 다르지만 주소를 저장하기에 같은 저장값을가진다. 참조형은 전부 4바이트로으로 동일.
										// 이 주소에서 몇칸이나 갈지는 지민 앞에 오는 타입에 따라 달라진다. 
										//한지민 번지. 
	
		jimin.age = 26;
		System.out.printf("%s,%d\n", jimin.name , jimin.age) ;

		Student chulsu = new Student();  // 철수도 같은 스튜던트(설계도) 썻기 때문에 이름과 나이. 똑같이 갖고있다. 
		chulsu.name="김철수"; // 김철수 번지 김철수가저장된게아니라. 
		chulsu.age=36;
		
		Student younghee = new Student();
		younghee.name="이영희";
		younghee.age=46;
		
		System.out.println("한지민 학생 정보");
		System.out.printf("이름 = %s, 나이=%d\n",jimin.name,jimin.age);
		
		System.out.println("김철수 학생 정보");
		System.out.printf("이름 = %s, 나이=%d\n",chulsu.name,chulsu.age);
		
		System.out.println("이영희 학생 정보");
		System.out.printf("이름 = %s, 나이=%d\n",younghee.name,younghee.age);
		
		
		
	}
}
