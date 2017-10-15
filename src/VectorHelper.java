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
    	int tail =rand.nextInt(100);
    	
       	for (int i=0;i<tail;i++){
       		vect.add(rand.nextInt(750));
       	}
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
	
	public ArrayList<Integer> Sommer( ArrayList<Integer> vectr )
	{ 
		ArrayList<Integer>  vectSomme;
	
     Try {
    	     if (vectr.getTail() != this.getTail() ) 
                {
    	            new TailleException () ;
    	 
                 } else  {
                	  
                	 for (int i=0;i<this.getTail();i++) {
                		 vectSomme[i]=	vectr[i]+vect[i] ;
             		                                    } 
                	 
                         }
    	 
        }
     catch (TailleException e) { system.out.print("Impossible de sommer des vecteurs de différentes tailles")}
     return vectSomme ;
       
    }
	public void Inverse ()
	{ 
	  int x ,i =0,j=this.getTail();
		while ( i!=j )
		{  x= this.vect[i];
		 this.vect[i]=this.vect[j] ;
		 this.vect[j]=x;
		 j--;
		 i++ ;
		}
		
	
		
	}

    	
	
	
}