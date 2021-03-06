package pl.edu.pjwstk.lab2.lab2;

import java.util.ArrayList;
import java.util.List;


public class VectorImpl implements Vector {
	
	public int vectorSize;
	public ArrayList<Integer> vector;

	public VectorImpl(int vectorSize,  ArrayList<Integer> vector ){
		this.vectorSize = vectorSize;
		this.vector = vector;
	}
	
	public VectorImpl(){
		
	}

	public void add(Vector a) {
		
		if(this.vectorSize != a.getVector().size()){
			 throw new RuntimeException("Vectors have different sizes");
		}else{
			for(int i=0; i<this.vectorSize; i++){
				int value1 = this.vector.get(i);
				int value2 = a.getVector().get(i);
				int result = value1 + value2;
				this.vector.set(i, result);
			}	
		}
	}

	public Vector addVectors(Vector a, Vector b) {
		
		Vector c = new VectorImpl();
		List<Integer> vectorC = new ArrayList<Integer>();
		
		if(a.getVector().size() != b.getVector().size()){
			 throw new RuntimeException("Vectors have different sizes");
		}else{	
			for(int i=0; i<a.getVector().size(); i++){
				int first = a.getVector().get(i); 
				int second = b.getVector().get(i);
				int value = first + second ;
				vectorC.add(i, value);
			}	
			c.setVector(vectorC);
		}
		return c;
	}

	public void setVector(List<Integer> a) {

		ArrayList<Integer> result = new ArrayList<Integer>(a);
		if(a.isEmpty()){
			throw new RuntimeException("Empty list");
		}else{
			this.vectorSize = result.size();
			this.vector = result;							
		}				
	}

	public List<Integer> getVector() {
		ArrayList<Integer> result = new ArrayList<Integer>(vector);
		return result;
	}

	public List<Integer> getVectorBy(VectorImpl a) {
		System.out.println(a.vector.size());
		ArrayList<Integer> result = new ArrayList<Integer>(a.vector);
		return result;
	}

	public void sub(Vector a) {
		
		if(this.vectorSize != a.getVector().size()){
			 throw new RuntimeException("Vectors have different sizes");
		}else{
			for(int i=0; i<this.vectorSize; i++){
				int value1 = this.vector.get(i);
				int value2 = a.getVector().get(i);
				int result = value1 - value2;
				this.vector.set(i, result);
			}	
		}
		
	}

	public Vector subVectors(Vector a, Vector b) {
		
		Vector c = new VectorImpl();
		List<Integer> vectorC = new ArrayList<Integer>();
		
		if(a.getVector().size() != b.getVector().size()){
			 throw new RuntimeException("Vectors have different sizes");
		}else{	
			for(int i=0; i<a.getVector().size(); i++){
				int first = a.getVector().get(i); 
				int second = b.getVector().get(i);
				int value = first - second ;
				vectorC.add(i, value);
			}	
			c.setVector(vectorC);
		}
		return c;
	}

}
