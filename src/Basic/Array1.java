package Basic;

public class Array1 {
	public static void main(String[] args) {
		int [] arr = {10,20,30,50,80};
		
		int max = arr[0];
		for (int x : arr) {
			if (x> max)
				max  = x;
		System.out.println(" largest element =" +max);
		
	}
	}
}
