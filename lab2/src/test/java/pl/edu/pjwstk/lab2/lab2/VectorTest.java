package pl.edu.pjwstk.lab2.lab2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.Ignore;
import junit.framework.Assert;
import junit.framework.TestCase;


public class VectorTest {

	@Test
	public void New2ElementsVectorCreating(){
		VectorImpl testVector = new VectorImpl();
		List<Integer> vector = new ArrayList<Integer>(); 
		vector.add(1);
		vector.add(4);
		assertNotNull(vector);
		testVector.setVector(vector);
	}
	
	@Test(expected = RuntimeException.class)
	public void NewEmptyVectorCreatingExceptionThrown(){
		VectorImpl testVector = new VectorImpl();
		List<Integer> emptyList = new ArrayList<Integer>(); 
		testVector.setVector(emptyList);
	}
	
	@Test
	public void addVectorToCurrent(){
		VectorImpl testVector = new VectorImpl();
		VectorImpl testVector1 = new VectorImpl();
		
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(2);
		list.add(6);
		
		List<Integer> list1 = new ArrayList<Integer>(); 
		list1.add(5);
		list1.add(1);
		
		testVector.setVector(list);
		testVector1.setVector(list1);
		
		testVector.add(testVector1);	
		
	}
	
	@Test(expected = RuntimeException.class)
	public void addVectorToCurrentWithDifferentSizesExceptionThrown(){
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(2);
		list.add(6);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(); 
		list1.add(5);
		list1.add(1);
		list1.add(7);
		list1.add(9);
		
		VectorImpl testVector = new VectorImpl(2, list);
		VectorImpl testVector1 = new VectorImpl(4, list1);
		
		testVector1.add(testVector);		
	}
	
	@Test
	public void addTwoVectors(){
		VectorImpl testVector = new VectorImpl();
		VectorImpl testVector1 = new VectorImpl();
		VectorImpl testVectorResult = new VectorImpl();
		
		List<Integer> vector = new ArrayList<Integer>(); 
		vector.add(2);
		vector.add(6);
		
		List<Integer> vector1 = new ArrayList<Integer>(); 
		vector1.add(5);
		vector1.add(1);
		
		testVector.setVector(vector);
		testVector1.setVector(vector1);
		
		testVectorResult.addVectors(testVector, testVector1);	
	}
	
	@Test(expected = RuntimeException.class)
	public void addTwoVectorsWithDefferentSizesExceptionThrown(){
		VectorImpl testVector = new VectorImpl();
		VectorImpl testVector1 = new VectorImpl();
		VectorImpl testVectorResult = new VectorImpl();
		
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(2);
		list.add(6);
		
		List<Integer> list1 = new ArrayList<Integer>(); 
		list1.add(5);
		list1.add(1);
		list1.add(4);
		
		testVector.setVector(list);
		testVector1.setVector(list1);
		
		testVectorResult.addVectors(testVector, testVector1);	
	}
	
	@Test
	public void subVectorFromCurrent(){
		
		VectorImpl testVector = new VectorImpl();
		VectorImpl testVector1 = new VectorImpl();
		
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(2);
		list.add(6);
		
		List<Integer> list1 = new ArrayList<Integer>(); 
		list1.add(5);
		list1.add(1);
		
		testVector.setVector(list);
		testVector1.setVector(list1);
		
		testVector.sub(testVector1);		
	}
	
	@Test(expected = RuntimeException.class)
	public void subVectorFromCurrentDefferentSizesExceptionThrown(){
		
		VectorImpl testVector = new VectorImpl();
		VectorImpl testVector1 = new VectorImpl();
		
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(2);
		list.add(6);
		
		List<Integer> list1 = new ArrayList<Integer>(); 
		list1.add(5);
		list1.add(1);
		list1.add(3);
		
		testVector.setVector(list);
		testVector1.setVector(list1);
		
		testVector.sub(testVector1);		
	}

	@Test
	public void subTwoVectors(){
		VectorImpl testVector = new VectorImpl();
		VectorImpl testVector1 = new VectorImpl();
		VectorImpl testVectorResult = new VectorImpl();
	
		List<Integer> vector = new ArrayList<Integer>(); 
		vector.add(2);
		vector.add(6);
	
		List<Integer> vector1 = new ArrayList<Integer>(); 
		vector1.add(5);
		vector1.add(1);
	
		testVector.setVector(vector);
		testVector1.setVector(vector1);
	
		testVectorResult.subVectors(testVector, testVector1);	
	}

	@Test(expected = RuntimeException.class)
	public void subTwoVectorsWithDefferentSizesExceptionThrown(){
		
		VectorImpl testVector = new VectorImpl();
		VectorImpl testVector1 = new VectorImpl();
		VectorImpl testVectorResult = new VectorImpl();
	
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(2);
		list.add(6);
	
		List<Integer> list1 = new ArrayList<Integer>(); 
		list1.add(5);
		list1.add(1);
		list1.add(4);
	
		testVector.setVector(list);
		testVector1.setVector(list1);
	
		testVectorResult.subVectors(testVector, testVector1);	
	}
	
	@Test
	public void getVector(){
		VectorImpl testVector = new VectorImpl();		
		List<Integer> list = new ArrayList<Integer>(); 
		List<Integer> resultlist = new ArrayList<Integer>(); 
		
		list.add(2);
		list.add(6);
		
		testVector.setVector(list);
		resultlist = testVector.getVector();		
	}

}
