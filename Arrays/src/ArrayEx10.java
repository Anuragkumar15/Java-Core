import java.util.Scanner;
public class ArrayEx10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][4];
		//System.out.println(a.length);
		//System.out.println(a[0].length);
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