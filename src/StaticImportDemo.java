import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.random; 
import static java.lang.Math.PI; 
//import는 클래스에서 끝난다
//System이나 Math 같은 경우는 한 단계 더 내려간다
//호칭하기를 static import 쓸 때는 import static

public class StaticImportDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int rand = (int)(Math.random() * 6 + 1);
	out.println("rand = " +rand);
	out.println("PI = " +PI);
}
}
