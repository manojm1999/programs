package corejava;

public class VtuResults {
	public static void viewResult(String username,String result)
	String usn = "1ap17is001";
	String res = "70percent";
	if(username==usn && result==res) {
		System.out.println("valid");
	}
	else {
		System.out.println("invalid");
	}

	public static void main(String[] args) {
		System.out.println("welcome to vtu results");
		VtuResults.viewResult("1ap17is001","70percent");
	}

}
