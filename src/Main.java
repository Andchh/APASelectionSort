import java.util.Scanner;

/**
 * 
 */

/**
 * @author Anderson Fraz�o 11221885
 * UFPB - An�lise e Projeto de Algor�tmo
 * 
 *
 */
public final class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a quantidade de elementos:\n");
		int n = s.nextInt();
		int[] entry = new int[n];
		System.out.print("Digite os numeros que serao organizados:\n");
		
		for(int i = 0; i < n; i++){  //vai lendo e salvando no array os valores
			entry[i] = s.nextInt();
		}
		selectionSort(entry);
		System.out.println("Organizado, imprimindo array:\n");
		
		for(int j = 0; j < entry.length; j++){
			System.out.print(entry[j]+"\n");
		}
		s.close();

	}
	
	public static void selectionSort(int[] list){
		
		
		for(int fixed = 0; fixed < list.length; fixed++){  //faz com o que o fixo v� andando de um por um at� o fim do array
			int smaller = fixed; //vari�vel onde o menor valor ser� salvo ao ser encontrado
			
			for(int i = smaller + 1; i < list.length; i++){ //ir� percorrer a partir do index depois do fixo, para comparar
				if(list[i] < list[smaller]){ //se o valor na posi��o i do array for menor que o da posi��o smaller
					smaller = i;  //smaller � subistituido por i. Ou seja, encontrou-se um valor menor que o fixo;
				}
			}
			if(smaller != fixed){ 
				int subs = list [fixed]; //
				list[fixed] = list[smaller];  
				list[smaller] = subs;   //troca-se o fixo atual pelo menor que foi encontrado	
			}
		}
		
		
		
	}

}
