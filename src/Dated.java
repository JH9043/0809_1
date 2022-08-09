
public class Dated implements Datable {
	private int date;

	@Override
	public int get() { // 추상 메소드라서 재정의해야한다
		// TODO Auto-generated method stub
		return date;
	}

	@Override
	public void set(int date) {
		this.date = date;

	}

}
