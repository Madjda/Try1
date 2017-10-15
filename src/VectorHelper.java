import java.lang.reflect.Array;

public class VectorHelper {
	  private  Array[] vect;
      private long tail;
	
      
      public VectorHelper( long tail) {
		super();
		
		this.setTail(tail);
		this.setVect(new Array[(int) tail]);
	}


	public Array[] getVect() {
		return vect;
	}


	public void setVect(Array[] vect) {
		this.vect = vect;
	}


	public long getTail() {
		return tail;
	}


	public void setTail(long tail) {
		this.tail = tail;
	}
}
