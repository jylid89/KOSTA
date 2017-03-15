package equal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Student{
	String hakbun, name;
	public Student(){}
	public Student(String hakbun, String name){
		this.hakbun = hakbun;
		this.name = name;
	}//end of Student
	
	public boolean equals(Object obj){
		Student s = (Student)obj;
		if (this.hakbun == s.hakbun ) return true;
		else return false;
	}//end of equals
	
	public String toString(){
		return "[" + hakbun + "]" + name + "입니다";
	}//end of toString
}//end of class
public class StudentClass {

	public static void main(String[] args) {

//		Student s = new Student("1001","공유");
//		Student s2 = new Student("1001","공유");
//		if (s.equals(s2)) {
//			System.out.println("같다");
//		}else System.out.println("다르다");
//			System.out.println( s );				
//			System.out.println( s2 );
	
		ArrayList<Student> data = method();
//			for (int i = 0; i < data.size(); i++) {
//				Student temp = data.get(i);
//				System.out.println(temp);
//			}
			for(Student temp : data){									//collection에만 사용할 수 있음 배열 list set etc....
				System.out.println(temp);
			}
	}//end of main
		
	static ArrayList<Student> method(){		
		Student s = new Student("1001","공유");
		Student s2 = new Student("1002","김태희");
		Student s3 = new Student("1003","연예인");
		Student s4 = new Student("1004","개그맨");
		
		ArrayList<Student> set = new ArrayList<Student>();
		set.add(s);set.add(s2);set.add(s3);set.add(s4);
		return set;
	}
}//end of StudentClass