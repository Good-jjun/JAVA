import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shape {
	private Shape next;
	
	public Shape() {
		next = null;
	}
	
	public void setNext(Shape obj) {
		next = obj;
	}
	
	public Shape getNext() {
		return next;
	}
	
	public abstract void draw();
}

class Line extends Shape {

	public Line() {
		super();
	}
	
	@Override
	public void draw() {
		System.out.println("Line");
	}
	
}

class Rect extends Shape {

	public Rect() {
		super();
	}
	
	@Override
	public void draw() {
		System.out.println("Rect");
	}
	
}

class Circle extends Shape {

	public Circle() {
		super();
	}
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}

class GraphicEditor {
	Scanner scan = new Scanner(System.in);
	Shape head, tail;
	int nodeSize = 0;
	int choice;
	
	public GraphicEditor() {
		tail = null;
		run();
	}
	
	public void run() {
		System.out.println("그래픽 에디터 beauty를 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			choice = validateChoice(4); // 제대로 된 숫자를 입력받기위해
			
			switch(choice) {
			case 1 :
				System.out.print("Line(1), Rect(2), Circle(3)>> ");
				choice = validateChoice(3);
				add(choice);
				break;
			case 2 : 
				System.out.print("삭제할 도형의 위치>> ");
				choice = validateChoice(nodeSize);
				delete(choice); 
				break;
			case 3 : 
				showAll(); 
				break;
			case 4 : 
				exit(); 
				break;
			}
		}
	}
	
	public int validateChoice(int limit) { // 잘못된숫자입력, 예외처리 한방에 하는 method
		while(true) {
			try {
				
				int tmp = scan.nextInt();
				if(tmp < 1 || tmp > limit) { //  메뉴에 없는 입력값을 받으면 다시 받는다
					System.out.print("잘못 입력하셨습니다. 다시입력하세요>> ");
					continue;
				} else {
					return tmp;
				}
			} catch (InputMismatchException e) { // 숫자 말고 다른거 눌렀을때 다시 받는다
				System.out.print("잘못 입력하셨습니다. 다시입력하세요>> ");
				scan.nextLine();
				continue;
			}
		}
	}
	
	public void add(int choice) {
		switch(choice) {
		case 1: 
			addNode(new Line()); 
			break;
		case 2: 
			addNode(new Rect());
			break;
		case 3:
			addNode(new Circle());
			break;
		}
	}
	
	public void addNode(Shape obj) {
		// Linked_List개념에서 처음 시작 객체의 주소를 잃어버리면 아예 모든 객체에 접근할 방법이 없어지기때문에
		// 처음 시작 객체의 주소를 담고있는 head는 유지되어야 한다.
		
		if(head == null) { // 처음 입력받을때
			Shape node = obj; //노드(객체)생성
			head = node;		// 헤드는 객체가 된다.(첫번째 객체이므로)
			nodeSize++;
			tail = node;   // 처음 객체가 마지막 객체다. 
			
		} else {			// 처음 입력이 아닐때 
			Shape node = obj; // 노드(객체) 생성
			tail.setNext(node); // tail(마지막객체)의 next를 현재 만든 객체로 참조하고
			tail = node;        // tail은 마지막객체를 참조한다.
			nodeSize++;
		}
	}
	
	public void delete(int choice) {
		int index = choice - 1;
		Shape node = head;
		if(index == 0) { //처음 입력한 객체를 지울때
			head = node.getNext(); // head(시작)은 2번째 객체부터.
		}
		for(int i=0; i<index-1; i++) {	//삭제하고자 하는 번지의 전까지 이동한다.
			node = node.getNext();
		}
		node.setNext(node.getNext().getNext());	 // 다음다음 노드로 바로 연결하면 다음노드는 가르키는 참조변수가 없으므로 삭제(가비지)된다.
												// ex) 1-2-3-4-5에서 3을 지우려면 1-2-4-5처럼 2에서 바로 4로 연결시킨다.
	}
	
	public void showAll() {
		Shape node = head;
		while(node != null) { 
			node.draw();		//head부터 draw() 하고
			node = node.getNext(); // 그 객체가 참조하는 next(다음객체)를 node에 담고 계속 반복한다. 
		}
		
	}
	
	public void exit() {
		System.out.println("beauty를 종료합니다.");
		System.exit(0);
	}
}
public class C5_12 {

	public static void main(String[] args) {
		
		System.out.print("가나다");

	}

}
