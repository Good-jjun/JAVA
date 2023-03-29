import java.util.Scanner;
public class Chapter2_2 {

	public static void main(String[] args) {
	 
             
		System.out.println("2자리수 정수 입력(10~99)>>");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%11 ==0)
		{
			System.out.println("Yes! 10의 자리와 1의자리가 같습니다.");
		}
		else
		{
			System.out.println("No! 10의 자리와 1의자리가 다릅니다.");
			 
		}
		if (n <10)
		{
			System.out.println("10이상 수를 입력하세요");
		}
	}

}
