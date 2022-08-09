
public interface InterfaceDemo {
//	public abstract void print();
//	public abstract void display();
	//모든 메소드가 추상 메소드이기 때문에
	//인터페이스가 가지고 있는 public abstract를 생략할 수 있다
	
//	void print();
//	void display();
	//이 경우 public이 생략되어있음
	
	
//	final int age = 20;
//	final String address ="해운대구";
	//private X protected X 일반변수 X
	
	public static void main(String[] args) {
//		Datable d = new Datable(); //new 사용 불가
		Datable d = new Dated();
		d.set(Datable.TUE);
		System.out.println(d.get());
	}
}
