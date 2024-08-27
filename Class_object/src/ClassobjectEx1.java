
public class ClassobjectEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new Employee();
		Employee b = new Employee();
		Employee c = new Employee();
		Employee d = new Employee();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		System.out.println(a.name+" "+a.id+" "+a.Salary);
		System.out.println(b.name+" "+a.id+" "+b.Salary);
		System.out.println(c.name+" "+a.id+" "+c.Salary);
		System.out.println(d.name+" "+a.id+" "+d.Salary);
		
		a.name = "Anurag";
		a.id = 2100259;
		a.Salary = 100000;
		b.name = "Ankuraa";
		b.id = 2100257;
		b.Salary = 100000;
		c.name = "Anshu";
		c.id = 2100258;
		c.Salary = 100000;
		d.name = "Ankur";
		d.id = 2100250;
		d.Salary = 100000;
		
		System.out.println(a.name+" "+a.id+" "+a.Salary);
		System.out.println(b.name+" "+b.id+" "+b.Salary);
		System.out.println(c.name+" "+c.id+" "+c.Salary);
		System.out.println(d.name+" "+d.id+" "+d.Salary);
	
		int total = a.Salary+b.Salary;
		System.out.println(total);
	}

}
class Employee{
	String name;
	int id;
	int Salary;
}