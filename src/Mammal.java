
public abstract class Mammal {
	private String name;
	private int age;

	public Mammal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Mammal [name=%s, age=%s]", name, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void saySomething(); 
	//메소드를 선언만 한다 
	//추상적 메소드 : 추후 자식에서 의무적으로 재정의하게 하기 위해
		
	

}
