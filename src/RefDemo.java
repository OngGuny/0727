import java.util.Scanner; // 스캐너도 클래스. 대문자로시작하니까. 
public class RefDemo {
	public static void main(String[] args) {
		
	
	//Scanner sc = new Scanner(); // 빈칸으로 만들어 놓은 api는 없기때문에 오류뜨는거, 사용하려면 api 가서 찾아보면됨 
	Scanner sc = new Scanner(System.in); // 이건 inputstream 
	
	System.out.print("이름 : ");
	String name = sc.nextLine();
	
	System.out.print("나이 : ");
	int age = sc.nextInt();
										// stack 에 이름, 에이지
	Student hojun = new Student();
	hojun.age=age;
	hojun.name=name;
	System.out.println("이름 : "+hojun.name);
	System.out.println("나이 : "+hojun.age);
	
//	Student jimin = new Student();  // 또 학생하나 만들어짐 방이 2개 name과 age. 
//	jimin.name = hojun.name;  // 주소복사 손호준이란 이름을 복사하는게 아니라 손호준이란 스트링이 있는 주소를 복사하는 것. 
//	jimin.age = hojun.age; // 값 복사 
//	
	//근데 이런 방식은 방을 하나씩 복사하는거. 방이 많으면 힘듬
	Student jimin = hojun; // 호준의 방들 주소 전부 가져옴 .
	
	System.out.println("이름 : "+jimin.name);
	System.out.println("나이 : "+jimin.age);
	
	
	}
}