import java.util.Scanner;

public class number {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); // 스캐너 생성
	System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지):");
	int a = scanner.nextInt();
	int c=0;
	System.out.println();
	for(int i=0;i<10;i++) {  // 10번 반복
		int b = (int)(Math.random()*50+1); // 1부터50까지 랜덤한 숫자 생성
		System.out.print(b+" ");
		if(a==b) {  // if문으로 입력한 숫자와 동일하면 정답 그렇지 않으면 꽝
			c=1;
		}
	}
	if(c==1) {
		System.out.println("\n정답");
	}else System.out.println("\n꽝");
	
	}

}
