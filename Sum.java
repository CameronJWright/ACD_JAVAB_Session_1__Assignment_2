package hello.world;
import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, y, z;
		
		x = scan.nextInt();
		y = scan.nextInt();

		System.out.println(x-(-y));
	
	}

}
