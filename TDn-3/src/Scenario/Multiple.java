package Scenario;

public class Multiple {

	public int multiplication(int x, int y) {
		
		int result = 0;
		
		//result = x * y;
		
		if(x==0) {
			result = 0;
		}
		else if (x<0 ) {
			result = -x * y;
		}
		else if (y<0 ) {
			result = x * (-y);
		}
		else {
			result = x*y;
		}
		return result;
	}

}
