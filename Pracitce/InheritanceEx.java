class Person{
	private int weight; // Private 접근 지정 student 클래스에서 접근 불가
	int age;             // 디폴트 접근 지정. student 클래스에서 접근 갸능.
	protected int height; //protected 접근지정. Student 클래스에서 접근 가능
	public String name; //public 접근지정 . student 클래스에서 접근 가능.
	
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public int getWeight()
	{
		return weight;
	}
}
class Student extends Person
{
	public void set()
	{
		age = 30;   //슈퍼 클래스의 디폴트 멤버 접근가능
		name = "홍길동"; // 슈퍼 클래스의 public 멤버 접근가능
		height = 175; // 슈퍼 클래스의 protecetㄷd 멤버 접근가능
		// weight = 99;   //오류 . 슈퍼클래스의 private 멤버 접근 불가
		setWeight(99);     //private 멤버 weight은 setWeight()으로 간접 접근
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}

}
