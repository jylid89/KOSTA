package basic;
//Ŭ���� = ���� �ٸ� Ÿ���� ������ + �Լ���
//class = fields + methods
public class Student {
		
	// Ŭ���� ��� ���� (heap�� ������ �͵��� �ڵ� �ʱ�ȭ�� ����(null, 0))
	
	private String name;
	private String hakbun;

	public int 		studentCount;
	private int 	kor, eng, math;
	private int 	total;
	private double 	avg;
	
	//������ �Լ� - Ŭ������� ����, �������� ����
	//		   [����]Ŭ���� ������� �ʱ�ȭ
	public /* void */ Student(String hakbun, String name, int kor, int eng, int math){
		this.hakbun = hakbun;
		this.name 	= name;
		this.kor 	= kor;
		this.eng 	= eng;
		this.math	= math;
//		System.out.println("�����ִ� ������ ȣ��");
	}
	
	//���ڰ� �ִ� ������ ������ ���� ���� ������ �Լ��� �����ؾ� ��(�����Ϸ��� �ڵ����� �־��ֱ� ������), �����ε���(�Լ����� ���Ƶ�������) ���������� ���ڰ� �޶����
	
	public Student(){
//		this("0000", "�̸�����",50,50,70);				//this�Լ��� �ڵ� ù �ٿ� �־�� �Ѵ�
//		System.out.println("�⺻������ ȣ�� ");
	}
	
	//ĸ��ȭ
	
	void makeTotal(){
		total = kor+eng+math;
	}
	
	void makeAvg(){
		avg = total / (double)3;
	}
	//setter=������ getter �޼ҵ�
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

	public void setKor(int kor) {			//int kor�� ���� �޾Ƽ� this.kor�� ����
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
		System.out.println(hakbun + ">" + name + "���� ����: "+ total + "��,  ���: " + avg + "�� �Դϴ�");
	}
	public void outputKor(){
		System.out.println("������� ����: " + total + "��,  ���: " + avg + "�� �Դϴ�");
	}
}