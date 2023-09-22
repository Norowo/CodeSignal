package dad.codesignal;

public class AdjacentElementsProduct {
	
	int solution(int[] inputArray) {
	    
	    int producto=-2147483648;
	    int maxValor=-2147483648;
	    
	    for (int i = 0; i<inputArray.length-1; i++){
	        producto = inputArray[i]*(inputArray[i+1]);
	        System.out.println(producto);
	        if(producto>maxValor){
	            maxValor=producto;
	        }
	    }
	    return maxValor;
	}

}
