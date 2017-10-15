import java.util.ArrayList;
import java.util.Random;

public class VectorHelper {
       private  ArrayList<Integer> vect;
       
       
       
       public VectorHelper() {
    	   
		super();
		vect= new ArrayList<Integer>();
		
	   }

       public void CreateVectRand (){
    	Random rand=new Random();
    	int tail =rand.nextInt(10);
    	
       	for (int i=0;i<tail;i++){
       		vect.add(rand.nextInt(750));
       	}
       }
       
       public int FindSmlElt (final int born){
    	   int min;
   
    	   if (born!=this.getTail()){
    	   min =born;
    	   for (int i=born+1;i<this.getTail();i++){
    		 if (vect.get(i)<vect.get(min) ) min=i;
    	   }
    	   return min;
    	   }
    	   else return -1;
    	   
       }
      
       public void CreateVect (long tail, int init,int pas){
          	for (int i=0;i<tail;i++){
          		vect.add(init+=pas);
          	}
         }
      
       public void ShowVect(){
    	   for (int i=0;i<this.getTail();i++){
    		   System.out.print("|"+vect.get(i)+"|");
    	   }
       }
	

	public long getTail() {
		int cpt=0;
		for (int a:vect) {
			cpt++;
		}
		return cpt;
	}


	public void setTail(long tail) {
	}
	
	public VectorHelper Sommer( VectorHelper vectr )
	{ 
		VectorHelper vectSomme =new VectorHelper();
	
        try {
    	     if (vectr.getTail() != this.getTail() ) 
                {
    	            throw new TailleException () ;
    	 
                 } else  {
                	  
                	 for (int i=0;i<this.getTail();i++) {
                		 vectSomme.vect.add(vectr.vect.get(i)+vect.get(i)) ;
             		                 } 
                         }
    	 
        }
     catch (TailleException e) 
        { System.out.print("Impossible de sommer des vecteurs de différentes tailles");}
     return vectSomme ;
       
    }
	public void Inverse ()
	{ 
	  int x ,i =0,j=(int) (this.getTail()-1);
		while ( i<j )
		{  x= vect.get(i);
		 vect.set(i, vect.get(j)) ;
		 vect.set(j, x) ;
		 j--;
		 i++ ;
		}
	}
	
		
	

    	
	
	
}