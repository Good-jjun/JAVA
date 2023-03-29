import java.util.Scanner;
public class Chapter2_1 {

	public static void main(String[] args) {
 	 Scanner sc = new Scanner(System.in);
 	 
 	 System.out.println("원화를 입력하세요 (단위 원)>>");
 	 
 	 int n = sc.nextInt();
 	 double num = n/1100;
 	 
 	 System.out.println(n + "원은" + "$" + num + "입니다.");
 	 
	}

}
