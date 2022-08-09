
public class Dog extends Mammal {

	public Dog(String name, int age) {
		super(name,age); //기본 생성자가 아닌 경우 super 사용
	}
	
	@Override
	public void saySomething() {
		System.out.println("멍멍멍멍");

	}

}
