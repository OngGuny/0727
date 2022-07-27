
public class CopyDemo {
public static void main(String[] args) {
	int original = 25;
	int target = original; // 값 복사 
	System.out.println("Before Change");
	System.out.println("original's value ="+original);
	System.out.println("target's value ="+target);

	original=36;
	System.out.println("After Change");
	System.out.println("original's value ="+original);
	System.out.println("target's value ="+target); // 오리지널 값을 바꾸면 타겟은 안바뀜. 링크가 안되어깄어서
		//이게 값복사. 복사시점에 자료만 가져오고 링크안됨. 
}	
}
