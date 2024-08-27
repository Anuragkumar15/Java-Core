class Emp{
	String name;
	String cname;
	int Salary;
	
	void show() {
		System.out.println(name+" "+cname+" "+Salary);
	}
	void input(String n,String c,int s) {
		name = n;
		cname = c;
		Salary = s;
	}
	void changename() {
		cname = "Incapp";
	}
}
public class ClassobjectEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp a = new Emp();
		Emp b = new Emp();
		Emp c = new Emp();
		Emp d = new Emp();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		
		
		a.input("Anurag","XYZ",200000);
		b.input("Ankur","XYZ",200000);
		c.input("Anshu","XYZ",200000);
		d.input("Rohit","XYZ",200000);
		
		
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		a.changename();
		b.changename();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		
		int total = a.Salary+b.Salary+c.Salary+d.Salary;
		System.out.println(total);
	}

}

	