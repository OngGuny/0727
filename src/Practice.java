import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ jm = new Employ();

		System.out.print("사원번호 : ");
		jm.empno = sc.nextInt();
		
		System.out.print("사원 이름 : ");
		jm.ename = sc.nextLine();
		sc.nextLine();
		// nextLine 하니까 엔터까지 다먹었따. 그래서 그냥 next로 처리함 
		// nextline 한번더쳐도 이름이 씹힘; 
		
		System.out.print("사원출생년도 : ");
		jm.birthYear = sc.nextInt();
		
		System.out.print("사원월급 : ");
		jm.salary = sc.nextInt();
		
		System.out.print("사원이메일 : ");
		jm.email = sc.nextLine();
		
		System.out.print("사원전화번호 : ");
		jm.tel = sc.nextLine();
		
		System.out.print("정규직여부 : ");
		jm.flag = sc.nextBoolean();
						// nextBoolean 있따. 
		
		System.out.printf("<<사원 정보>>\n");
		System.out.printf("사원번호 : %d\n",jm.empno);
		System.out.printf("사원이름 : %s\n",jm.ename);
		System.out.printf("사원나이 : %d\n",jm.birthYear); // 2022 -em.birthYear+1 로 나이 표현해준다.
		System.out.printf("사원월급 : %d만원\n",jm.salary);
		System.out.printf("사원이메일 : %s\n",jm.email);
		System.out.printf("사원전화번호 : %s\n",jm.tel);
		System.out.printf("정규직 : %b\n",jm.flag);

	}
}