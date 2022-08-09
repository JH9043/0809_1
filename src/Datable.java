
public interface Datable {
	int get(); //앞에 public abstract가 생략되어 있기 때문에 오류가 안 남
	void set(int date);
	int SUN=0, MON =1,TUE=2,WED=3,THU=4,FRI=5,SAT=6; //인터페이스 속 상수
}
