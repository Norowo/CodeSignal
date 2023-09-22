package dad.codesignal;

public class CheckPalindrome {

	boolean solution(String inputString) {
	    String cadenaReves = "";
	    for(int i=inputString.length(); i>0; i--){
	    
	    	char c = inputString.charAt(i-1);
	    	cadenaReves = cadenaReves+c;
	    }
	    if (cadenaReves.equalsIgnoreCase(inputString)){
	    	return true;
	    } else {
	    	return false;
	    }
	}	
}
