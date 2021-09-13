package corejava;

public class Tollgate {

	public static void main(String[] args) {
		String registration = "KA";
		if(registration == "KA") {
			System.out.println("allowed to pass");	
		}
		else if(registration == "MH") {
			System.out.println("not allowed to pass");
		}
		else if(registration == "KL") {
			System.out.println("not allowed to pass");			
		}
	}

}
