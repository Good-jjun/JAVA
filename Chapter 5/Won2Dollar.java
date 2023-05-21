import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; // 비율
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " +getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString()+ "을 입력하세요>>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("반환 결과: " + res + getDestString() + "입니다");
		sc.close();
	}
}


public class Won2Dollar extends Converter {
	public Won2Dollar(double ratio)
	{
		this.ratio = ratio;
	}
	public double convert(double src)
	{
		return src/ratio;
	}
	protected String getSrcString()
	{
		return "원";
	}
	protected String getDestString()
	{
		return "달러";
	}
	
	

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();

	}



}
