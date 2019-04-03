package milton;

import java.util.Arrays;
import java.util.Collections;

public class Exer_01 {

	public static void main(String[] args) {
		
	Integer[] vetor = new Integer[] {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
		
	for(int i = 0; i < vetor.length; i++) {
		Arrays.sort(vetor);
		System.out.println(vetor[i]);
	}
	
	System.out.println("");
	
	for(int i = 0; i< vetor.length; i++) {
		Arrays.sort(vetor, Collections.reverseOrder());	
		System.out.println(vetor[i]);
		}
	}
}

