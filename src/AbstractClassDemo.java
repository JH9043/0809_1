
public class AbstractClassDemo {
	public static void main(String[] args) {
		Mammal m = new Dog("포유류",20); //부모의 주소로 자식에게 접근
		m.saySomething(); 
		System.out.println(m);
	}
	
	
}
