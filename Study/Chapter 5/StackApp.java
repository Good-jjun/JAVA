import java.util.Scanner;
interface Stack{
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱(top)에 저장된 실수 리턴
	boolean push(String val); // 스택의 톱(top)에 실수 저장 
}

class StringStack implements Stack{
	private int top;
	private int size;
	private String[] stack;
	
	StringStack(int size){
		this.size = size;
		top = this.size;
		stack = new String[this.size];
	}
	
	@Override
	public int length() {
		return size - top;
	}

	@Override
	public int capacity() {		
		return top;
	}

	@Override 
	public String pop() {
		int tmp = top;
		top++;
		return stack[tmp];
	}

	@Override
	public boolean push(String val) {
		if(top > 0) {
			stack[top -1] = val;
			top--;
			return true;
		}
		else {
			return false;			
		}
	}
}

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scanner.nextInt();
		
		StringStack s = new StringStack(size);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String val = scanner.next();
			
			if(val.equals("그만")) {
				int len = s.length();
				if(len == 0)
					System.out.println("저장된 문자열이 없습니다.");
				else {
					System.out.print("스택에 저장된 모든 문자열 팝 : ");
					for(int i = 0; i<len; i++) {
						System.out.print(s.pop() + " ");
					}
				}
				break;
			}
			else {
				if(!s.push(val))
					System.out.println("스택이 꽉 차서 푸시 불가 !");
			}
		}
		scanner.close();
	}

}