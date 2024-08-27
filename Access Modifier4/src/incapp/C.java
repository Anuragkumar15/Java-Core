package incapp;
import p1.A;

public class C extends A{
 public void m() {
	 A a = new A(); //allowed
	 //System.out.println(a.x); error
	 
	 System.out.println(x); 
	 
	 C c = new C();
	 System.out.println(c.x); //allowed
 }
}
 class K{
	 void m() {
		 C c = new C();
		 //System.out.println(c.x); error
	 }
	 
 }
