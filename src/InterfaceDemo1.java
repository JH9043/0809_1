
public class InterfaceDemo1 extends Object implements Father, Mother {
	// Object의 자식이자 (interface)Father, Mother의 자식

	@Override
	public void grandFather() {
		System.out.println("Called by grandFather()");

	}

	@Override
	public void grandMother() {
		System.out.println("Called by grandMother()");

	}

	@Override
	public void mother() {
		System.out.println("Called by mother()");

	}

	@Override
	public void father() {
		System.out.println("Called by father()");

	}
	public static void main(String[] args) {
//		GrandFather gFather = new InterfaceDemo1(); //할아버지 주소는 할아버지의 메소드만 접근 가능
//		gFather.grandFather();
//		Father father = new InterfaceDemo1();
//		father.grandFather(); father.grandMother(); father.father(); //부모님의 메소드도 접근 가능	
		Mother array[] = new Mother[3]; //부모형 배열에는 그 부모의 자식들을 넣을 수 있다
		array[0] = new InterfaceDemo1();
		array[0].mother();
		
		System.out.println("Father's MAX = " +Father.MAX);
		System.out.println("Mother's MAX = " +Mother.MAX); 
		//Static이기 때문에 변수의 이름이 같아도 충돌하지 않는다
	}

}
