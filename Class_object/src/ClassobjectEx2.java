
public class ClassobjectEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		Student d = new Student();
		Student e = new Student();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		System.out.println(a.name+" "+a.fatherName+" "+a.School+" "+a.fee+" "+a.age);
		System.out.println(b.name+" "+b.fatherName+" "+b.School+" "+b.fee+" "+b.age);
		System.out.println(c.name+" "+c.fatherName+" "+c.School+" "+c.fee+" "+c.age);
		System.out.println(d.name+" "+d.fatherName+" "+d.School+" "+d.fee+" "+d.age);
		System.out.println(e.name+" "+e.fatherName+" "+e.School+" "+e.fee+" "+e.age);
	
		a.name ="Anurag";
		a.School = "BKKG";
		a.fee = 106000;
		a.age = 21;
		a.fatherName = "Anjani kumar";
		b.name ="Anurag";
		b.School = "BKKG";
		b.fee = 106000;
		b.age = 21;
		b.fatherName = "Anjani kumar";
		c.name ="Anurag";
		c.School = "BKKG";
		c.fee = 106000;
		c.age = 21;
		c.fatherName = "Anjani kumar";
		d.name ="Anurag";
		d.School = "BKKG";
		d.fee = 106000;
		d.age = 21;
		d.fatherName = "Anjani kumar";
		e.name ="Anurag";
		e.School = "BKKG";
		e.fee = 106000;
		e.age = 21;
		e.fatherName = "Anjani kumar";
		
		
		
		System.out.println(a.name+" "+a.fatherName+" "+a.School+" "+a.fee+" "+a.age);
		System.out.println(b.name+" "+b.fatherName+" "+b.School+" "+b.fee+" "+b.age);
		System.out.println(c.name+" "+c.fatherName+" "+c.School+" "+c.fee+" "+c.age);
		System.out.println(d.name+" "+d.fatherName+" "+d.School+" "+d.fee+" "+d.age);
		System.out.println(e.name+" "+e.fatherName+" "+e.School+" "+e.fee+" "+e.age);
	
		
		int total = a.fee+b.fee;
		System.out.println(total);
	}

}
class Student{
	String name;
	int fee;
	int age;
	String fatherName;
	String School;
	
}