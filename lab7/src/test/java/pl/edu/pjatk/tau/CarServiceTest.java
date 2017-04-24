package pl.edu.pjatk.tau;

import static org.junit.Assert.*;

import java.sql.SQLException;

import pl.edu.pjatk.tau.domain.Car;
import pl.edu.pjatk.tau.service.CarService;


import org.junit.Test;

public class CarServiceTest {
	
	 public CarServiceTest() throws  SQLException{
		 
	  }
	
	CarService carService = new CarService();
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
    @Test
    public void AddingNewCarTest() throws SQLException{
        Car car = new Car(55, "Opel", 12000, "Opel Meriva 2006r.");
        carService.delete();
        assertEquals(1, carService.addCar(car));
    }

}