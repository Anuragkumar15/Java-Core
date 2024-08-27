import java.util.Scanner;
public class ArrayEx11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int m = sc.nextInt();
		int a[][] = new int[m][];
		
		for(int x=0;x<a.length;x++) {
			System.out.println("Enter the size of each array");
			int n = sc.nextInt();
			a[x] = new int[n];
		}
		
		for(int x = 0;x<a.length;x++) {
			System.out.println("Enter the values");
			for(int y = 0;y<a[x].length;y++) {
				a[x][y] = sc.nextInt();
			}
		}
		
		System.out.println("Entered values are: ");
		for(int y[]:a) {
			for(int z:y) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
		
		
	}

}