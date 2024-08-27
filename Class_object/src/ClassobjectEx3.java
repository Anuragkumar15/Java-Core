class Stu{
	String name;
	int fee;
	int age;
	String fatherName;
	String School;
	
	void show() {
		System.out.println(name+" "+fatherName+" "+School+" "+fee+" "+age);
	}
	void input(String n,String f,String s,int fe,int a) {
		name = n;
		fatherName = f;
		School = s;
		fee = fe;
		age = a;
		
	}
}
public class ClassobjectEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu a = new Stu();
		Stu b = new Stu();
		Stu c = new Stu();
		Stu d = new Stu();
		Stu e = new Stu();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		a.show();
		b.show();
		c.show();
		d.show();
		e.show();
		
		
		a.input("Anurag", "Anjani kumar", "BKKG", 106000, 21);
		b.input("Ankur", "Anjani kumar", "BKKG", 106000, 21);
		c.input("Anshu", "Anjani kumar", "BKKG", 106000, 21);
		d.input("Rohit", "Anjani kumar", "BKKG", 106000, 21);
		e.input("Pranava", "Anjani kumar", "BKKG", 106000, 21);
		
		
		a.show();
		b.show();
		c.show();
		d.show();
		e.show();
		
		int total = a.fee+b.fee;
		System.out.println(total);
	}

}

	