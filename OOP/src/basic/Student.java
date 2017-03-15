package basic;
//클래스 = 서로 다른 타입의 변수들 + 함수들
//class = fields + methods
public class Student {
		
	// 클래스 멤버 변수 (heap에 잡히는 것들은 자동 초기화가 잡힘(null, 0))
	
	private String name;
	private String hakbun;

	public int 		studentCount;
	private int 	kor, eng, math;
	private int 	total;
	private double 	avg;
	
	//생성자 함수 - 클래스명과 동일, 리턴형이 없음
	//		   [역할]클래스 멤버들을 초기화
	public /* void */ Student(String hakbun, String name, int kor, int eng, int math){
		this.hakbun = hakbun;
		this.name 	= name;
		this.kor 	= kor;
		this.eng 	= eng;
		this.math	= math;
//		System.out.println("인자있는 생성자 호출");
	}
	
	//인자가 있는 생성자 생성시 인자 없는 생성자 함수도 생성해야 함(컴파일러가 자동으로 넣어주기 때문에), 오버로딩이(함수명이 같아도되지만) 가능하지만 인자가 달라야함
	
	public Student(){
//		this("0000", "이름없음",50,50,70);				//this함수는 코딩 첫 줄에 있어야 한다
//		System.out.println("기본생성자 호출 ");
	}
	
	//캡슐화
	
	void makeTotal(){
		total = kor+eng+math;
	}
	
	void makeAvg(){
		avg = total / (double)3;
	}
	//setter=값지정 getter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {			//int kor로 값을 받아서 this.kor로 보냄
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}
	
	public void output(){
		System.out.println(hakbun + ">" + name + "님은 총점: "+ total + "점,  평균: " + avg + "점 입니다");
	}
	public void outputKor(){
		System.out.println("국어과목 총점: " + total + "점,  평균: " + avg + "점 입니다");
	}
}