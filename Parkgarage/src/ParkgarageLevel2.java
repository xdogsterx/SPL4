import java.util.ArrayList;

public class ParkgarageLevel2 {

	public static void main(String[] args) {
		int parkplaetze = 2;
		int autos = 4;
		String parken ="1 2 -1 3 4 -3 -4 -2";
		int maxAutosInGarage = 0;
		int momentan = 0;
		int maxWarten = 0;
		
		String[] parkChar = parken.split(" ");
		ArrayList<String> parkenWarteschlange = new ArrayList<String>();
		ArrayList<String> parking = new ArrayList<String>();
		
		
		
		for(int i = 0; i< parkChar.length;i++) 
		{
			if(parkChar[i].indexOf("-") > 0) 
			{
				momentan --;
				parking.remove((String) parkChar[i]);
				
				// warteliste??
				
				if(parkenWarteschlange.size() > 0)
				{
					parking.add(parkenWarteschlange.get(0));
					parkenWarteschlange.remove(0);
					
				}
				
			}
			else if(parking.size() < parkplaetze)
			{
				momentan ++;
				parking.add((String) parkChar[i]);

			if (parking.size() == parkplaetze) 
			{
				parkenWarteschlange.add(parkChar[i]);
			}
				
			}
			
			
			if(momentan > maxAutosInGarage) 
			{
				maxAutosInGarage = momentan;
			}
			
			
			if(maxWarten < parkenWarteschlange.size()) 
			{
				maxWarten = parkenWarteschlange.size();
			
			}
		
		}
		System.out.println(maxAutosInGarage);
		System.out.println(maxWarten);
	}

}
