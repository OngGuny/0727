// 앞의 헬로네오 연습한걸 메소드로 접근해보자 
public class MethodAccessDemo {
	public static void main(String[] args) {
//		int su = 345678;
//		Integer.toBinaryString(su); // 2진수로 변경하는 메소드는. 인티저 클래스의 to바이너리. api에서 찾아보니 static 변수였고 주소가 필요 없다. 
//											//api에서 보면  public static void 가 아닌 String 이다. 갔다 올때 스트링을 가져온다는거. 2진화된. 
//		String result = Integer.toBinaryString(su);
//		System.out.println(result);
//		
//		result = Integer.toHexString(su);
//		System.out.println(result);
//	}
		String msg = "Hello";
		char ch =msg.charAt(4); 						//member는 주소로접근한다.만 기억
		System.out.println("ch="+ch);
	}
}
//public static String toBinaryString​(int i)  괄호안의 숫자를 string으로 표현하는데 static 형식의 변수로 한다. 이게 tobinarystring 기능 
//16진수도 마찬가지.
// 일단 static인지 본다. 
	