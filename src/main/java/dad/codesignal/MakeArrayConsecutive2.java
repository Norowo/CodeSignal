package dad.codesignal;

public class MakeArrayConsecutive2 {

	int solution(int[] statues) {

		int valorMinimo = 9999999;
		int valorMaximo = -1515151;
		int distancia;
		int nEstatuas;

		for (int i = 0; i < statues.length; i++) {
			if (statues[i] <= valorMinimo) {
				valorMinimo = statues[i];
				System.out.println("Valor mínimo = " + valorMinimo);
			}
			if (statues[i] >= valorMaximo) {
				valorMaximo = statues[i];
				System.out.println("Valor máximo = " + valorMaximo);
			}
		}
		distancia = valorMaximo - valorMinimo;
		System.out.println("Distancia: " + distancia);
		nEstatuas = distancia - statues.length;
		System.out.println("Número de estatuas: " + nEstatuas);
		return nEstatuas + 1;
	}

}
