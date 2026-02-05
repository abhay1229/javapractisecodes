package Basic;



public class Constructor2 {
	
		private int id;
		private String name;
		
		public Constructor2 () {
			id=1229;
			name="abhay";
		}
		
		public int getid() {
			return id;
		}
		
		public String getname() {
			return name;
		}
		
		public static void main(String[] args) {
			Employe2 chu = new Employe2();  //ye he bsdka constructor
			System.out.println(chu.getid());
			System.out.println(chu.name);
		}


}
