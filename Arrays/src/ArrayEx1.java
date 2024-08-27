
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without array
		
		int a1 = 25;
		int a2 = 26;
		int a3 = 27;
		int a4 = 28;
		int a5 = 29;
		
		//With array
		
		int a[]; // Array Declare
//		int []a;  Allowed
		a = new int[5]; // Array creation
		a[0] = 5;
		a[1] = 6;
		a[2] = 7;
		a[3] = 8;
		a[4] = 9;
		int x;
		//With for loop
		for( x=0; x<a.length; x++) {
			System.out.println(a[x]);
		}
		//With for each loop
		for(int x1:a) {
			System.out.println(x1);
			
		}
		
		int b[]= {1,2,2,3};
		int c[] = new int[] {1,2,4,5};
		for(int z:c) {
			System.out.println(z);
		}
		for(int v:b) {
			System.out.println(v);
		}

	}
}
