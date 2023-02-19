package abstrction;

public class smartphone extends mobile { 
	public void brand () { 
		System.out.println("redmi"); 
		
} 
	public void price() { 
		System.out.println(34000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		smartphone s = new smartphone ();
		s.features(); 
		s.brand(); 
		s.price(); 
	} 
	
		

	}


