import java.util.Scanner;
public class Chapter2_2 {

	public static void main(String[] args) {
	 
             
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%11 ==0)
		{
			System.out.println("Yes! 10�� �ڸ��� 1���ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("No! 10�� �ڸ��� 1���ڸ��� �ٸ��ϴ�.");
			 
		}
		if (n <10)
		{
			System.out.println("10�̻� ���� �Է��ϼ���");
		}
	}

}
