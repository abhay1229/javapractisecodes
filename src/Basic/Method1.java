package Basic;

public class Method1 {               //class name method we have taken
	static int sum (int  n ) {
		int s =0;                   //initilize s value zero 
		for (int i= 0; i<=n ; i++)  //taken for loop to increase value by one
			s+= i;                  //it will simply use as s=s+1 means each loop addd curent value i to s
		return s;
		
	}
	
	public static void main(String[] args) {
		int result = sum (10);     //calling sum method by giving parameter 10 
				System.out.println(result);   
	}

}
