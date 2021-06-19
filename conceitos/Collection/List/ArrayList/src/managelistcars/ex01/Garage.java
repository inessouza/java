package managelistcars.ex01;

import java.util.ArrayList;

public class Garage {
	ArrayList<Car> listcars = new ArrayList<Car>();
	
	public void addCar(Car car) {
		listcars.add(car);
	}	
	
	public void showList() {
		// System.out.println(listcars);
		
		int i = 1;
		System.out.println("\n\t\tList of Car(s)\n");
		for (Car car : listcars) {
			System.out.print(i + "º " + car.getModel() + ", " + car.getBrand() + ", " + car.getYear() + ", " + car.getCode());
			i++;
		}
	}
}