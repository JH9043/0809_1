import java.util.Calendar;
import java.util.GregorianCalendar;

public class AbstractClassDemo1 {
	public static void main(String[] args) {
//		String str = Human.getInstance();
		// static 지역에서는 this, super 사용 불가(우리 집 안에 있지 않기 때문에)
//		Human jimin = new Human(
//"010-1234-5678", "부산시 해운대구 센텀아파트");
//		Calendar cal = new GregorianCalendar(); //자식 클래스 이용하는 방법
		Calendar cal = Calendar.getInstance(); //static을 이용하는 방법
		//getInstance()는 최초에 할당된 하나의 메모리를 계속 쓰는 방식이다.
		
		System.out.println("오늘은 " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DATE) + "일입니다.");
	}
}

abstract class Human {
	private String tel;
	private String address;
	private static String str = "Hello, World";

	public Human(String tel, String address) {
		this.tel = tel;
		this.address = address;
	}

	public static String getInstance() {
		return str;
	}

	@Override
	public String toString() {
		return String.format("Human [tel=%s, address=%s]", tel, address);
	}

}