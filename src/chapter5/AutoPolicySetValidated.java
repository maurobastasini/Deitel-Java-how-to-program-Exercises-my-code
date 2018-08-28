package chapter5;
//complete and functional
public class AutoPolicySetValidated {
	String state;
	
	public void setState(String state){
		if (state == "CT" || state == "MA" || state == "ME" || state == "NH" ||
			state == "NJ" || state == "NY" || state == "PA" || state == "VT")
		{
			this.state = state;
		}
		else{
			System.out.println("Error");
		}
		
	}
	
}
