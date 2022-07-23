import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		HashMap<String, String> carMap = new HashMap<>();
		
		carMap.put("A-Class", "Mercedes-Benz");
		carMap.put("Bentayga", "Bentley");
		carMap.put("C-HR", "Toyota");
		carMap.put("Dawn", "Rolls-Royce");
		carMap.put("E-PACE", "Jaguar");
		carMap.put("F150 Lightning", "Ford");
		carMap.put("G70", "Genesis");
		carMap.put("Huracan", "Lamborghini");
		carMap.put("Impreza", "Subaru");
		carMap.put("Jetta", "Volkswagen");
		carMap.put("K5", "Kia");
		
		System.out.println("What model you looking for?");
		String carSelection = input.nextLine();
		
		for(Map.Entry<String, String> entry: carMap.entrySet())
		{
			if(entry.getValue().equals(carMap.get(carSelection)))
			{
				System.out.println("Oh, you're looking for a " + carSelection + "? Our " + carMap.get(carSelection) + " selection is right over here...");
			}
		}
	}
}
