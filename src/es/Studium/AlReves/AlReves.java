package es.Studium.AlReves;

import java.util.Scanner;

public class AlReves {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		// TODO Auto-generated method stub
	      
		String palabra;
	      
	    String palabrainvertida="";
	    
	    
	    System.out.println("Ingresa una palabra y se mostrara a la inversa:\n");
	    palabra=teclado.nextLine();
	 
	        for (int i = palabra.length()-1; i>=0; i--){
	            palabrainvertida += palabra.charAt(i);
	        }
	 
	        System.out.println("La palabra invertida es:\n"+ palabrainvertida);
	   
	        teclado.close();
	}
	 
		
		
	}


