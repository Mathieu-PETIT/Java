package truc;
import java.util.Scanner;
import java.util.ArrayList;


public class MyClass {
	
	    public static void main(String args[]) {
	        // tableau de 10 entrées
	        // faire afficher
	        // créer une valeur cherche = 8,
	        // Ecrire du code permetta,t de déterminer si cherche existe dans le tableau
	    	// Ecrire un code qui cherche le minimum 
	     
	    int[] tab={0,6,8,1,5,7,2,3};
	    min(tab);
	    }
	    
	    
	    public static void min(int[] tableau){
	    int min = tableau[0];
	    System.out.println("Le minimum est : "+min);
	    for(int i=1; i <= 7; i++){
	    	System.out.println("Position : " + tableau[i]);
	    	if (tableau[i]< min) {
	    		min=tableau[i];
	    	}
	    
	    	if (test(tableau[i])==true) {
	    		System.out.println("Elément trouvé dans l'index");
	    	}
	    }
	    System.out.println("Le minimum est : " + min);
	    }
	    
	    
	    public static boolean test(int valeur) {
	    	boolean result;
	    	if (valeur==8) {
	    		result=true;
	    	}
	    	else {
	    		result=false;
	    	}
	    	return result;
	    }	
}

