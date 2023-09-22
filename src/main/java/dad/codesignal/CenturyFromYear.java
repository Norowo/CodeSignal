package dad.codesignal;

public class CenturyFromYear {
	
	int solution(int year) {
		int century;

		century= (year/100)+1;
		    if (year%100==0){
		      century=century-1;  
		    }
		return century;

		}

}
