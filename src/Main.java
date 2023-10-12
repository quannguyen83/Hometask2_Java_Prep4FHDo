import java.util.*;
import java.io.*;
import java.time.Year;

public class Main {
	public static void main (String[] args) throws IOException {
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car("Mercedes", "GLA SUV", 2020, "white", 37500, "51F-997.85"));
		carList.add(new Car("Vinfast", "VF7", 2023, "red", 30000, "67A-867.05"));
		carList.add(new Car("Mercedes", "A-Class Sedan", 2022, "black", 33950, "15A-101.01"));
		carList.add(new Car("Tesla", "Model 3", 2018, "white", 28490, "51F-333.33"));
		carList.add(new Car("Tesla", "Model X", 2020, "black", 68590, "30H-433.67"));
		carList.add(new Car("Nio", "ET5", 2022, "gray", 59500, "72A-787.11"));
		carList.add(new Car("Mercedes", "GLA SUV", 2018, "black", 38000, "43A-117.88"));
		carList.add(new Car("Vinfast", "VF6", 2022, "yello", 40000, "43A-668.86"));
		carList.add(new Car("Mazda", "CX5", 2023, "black", 33000, "94A-557.21"));
		carList.add(new Car("Volkswagen", "Taigo", 2020, "white", 25000, "86A-812.21"));
		carList.add(new Car("Toyota", "Aygo", 2020, "red", 19000, "30H-479.85"));
		carList.add(new Car("Mercedes", "GLA SUV", 2023, "black", 40000, "67A-932.17"));
		
		/**
		 * a) a list of cars of a given brand
		 * 
		 * List of Mercedes cars
		 */
		File listTaskA = new File("results\\TaskA_Car_List.txt");
		if (listTaskA.createNewFile())
			System.out.println("File created: " + listTaskA.getName()); 
		else 
			System.out.println("File already exists.");
      
		FileWriter frTaskA = new FileWriter(listTaskA, true);
		new FileWriter(listTaskA, false).close();
		
		frTaskA.write("List of Mercedes cars:\n");
		for (Car car : carList) {
			if (car.getMake().endsWith("Mercedes")) {
				printCarInfo(frTaskA, car);
			}
		}
		frTaskA.close();
		
		/**
		 * b) a list of cars of a given model that have been in use for more than n years
		 * 
		 * List of cars which their model are GLA SUV and have been use for more than 3 year
		 */
		String givenModel = "GLA SUV";
		int usedYearsFilter = 3;
		File listTaskB = new File("results\\TaskB_Car_List.txt");
		if (listTaskB.createNewFile())
			System.out.println("File created: " + listTaskB.getName()); 
		else 
			System.out.println("File already exists.");
      
		FileWriter frTaskB = new FileWriter(listTaskB, true);
		new FileWriter(listTaskB, false).close();
	    
		frTaskB.write("List of cars which their model are GLA SUV and have been use for more than 3 year\n");
		for (Car car : carList) {
			int currentYear = Year.now().getValue();
			int usedYears = currentYear - car.getYearOfManufacture();
			if (car.getModel().endsWith(givenModel) && usedYears >= usedYearsFilter) {
				printCarInfo(frTaskB, car);
			}
	    }
		frTaskB.close();
		
		/**
		 * c) a list of cars of a given year of manufacture, 
		 * the price of which is higher than the specified one.
		 * 
		 * List of cars made in 2020 have price which is higher than 35000 dollars
		 */
		int givenBudget = 35000;
		int givenYear = 2020;
		File listTaskC = new File("results\\TaskC_Car_List.txt");
		if (listTaskC.createNewFile())
			System.out.println("File created: " + listTaskC.getName()); 
		else 
			System.out.println("File already exists.");
      
		FileWriter frTaskC = new FileWriter(listTaskC, true);
		new FileWriter(listTaskC, false).close();
	    
		frTaskC.write("List of cars made in 2020 have price which is higher than 35000 dollars\n");
		for (Car car : carList) {
			if (car.getPrice() > givenBudget && car.getYearOfManufacture() == givenYear) {
				printCarInfo(frTaskC, car);
			}
	    }
		frTaskC.close();
		
	}
	
	public static void printCarInfo(FileWriter fr, Car car) throws IOException {
		fr.write("\tCar information:\n");
		fr.write("\t\tBrand: " + car.getMake() + "\n");
		fr.write("\t\tModel: " + car.getModel() + "\n");
		fr.write("\t\tYear of Manufacture: " + car.getYearOfManufacture() + "\n");
		fr.write("\t\tColor: " + car.getColor() + "\n");
		fr.write("\t\tPrice: " + car.getPrice() + " dollars\n");
		fr.write("\t\tRegistration number: " + car.getRegistrationNumber() + "\n");
	}
}
