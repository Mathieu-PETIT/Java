package truc;

public class MyClass {
	
	    public static void main(String args[]) {
	        // tableau de 10 entrées
	        // faire afficher
	        // créer une valeur cherche = 8,
	        // Ecrire du code permetta,t de déterminer si cherche existe dans le tableau
	    	// Ecrire un code qui cherche le minimum 
	     
	    	int[] tab={0,6,8,1,5,7,2,3};
	    	int longueur = tab.length;
	    	min(tab);
	    	int [] trier = triCroissant(tab);
	    	System.out.println("Voici la version triée : ");
	    	
	    	for (int i=0; i<=longueur-1;i++) {
	    		System.out.println(trier[i]);
	    	}
	    }
	    
	    
	    public static void min(int[] tableau){
	    	int min = tableau[0];
	    	int longueur = tableau.length;
	    	for(int i=1; i <= longueur-1; i++){
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
	    

		public static int[] triCroissant(int[] tab) 
		{
		    int longueur = tab.length;
		    int temp = 0;
		    boolean change;
		
		    do {
		        change = false;
		
		        for (int i = 0; i < longueur-1; i++) 
		        {
		            if (tab[i] > tab[i + 1]) 
		            {
		                temp = tab[i];
		                tab[i] = tab[i + 1];
		                tab[i + 1] = temp;
		                change = true;
		            }
		        }
		    } 
		    while (change);
		    {
		    	return tab;
		    }	
		}
}		    
