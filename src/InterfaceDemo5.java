import java.util.Arrays;

//인터페이스를 이용한 정렬
public class InterfaceDemo5{
	public static void main(String[] args) {
		Product array[] = new Product[3];
		array[0] = new Product("Ballpen",200,"모나미");
		array[1] = new Product("Notebook", 2500000, "Apple");
		array[2] = new Product("Keyboard", 20000,"Logitech");
		Arrays.sort(array); 
		System.out.println(Arrays.toString(array));
	}
}


