
public class ParkgarageLevel1 {

	public static void main(String[] args) {

		int parkplaetze = 10;
		int autos = 4;
		String parken = "6 2 -6 3 4 -3 -4 -2";
		String[] parkvorgaenge = parken.split(" ");
		int maxAutosInGarage = 0;
		int auto = Integer.parseInt(parkvorgaenge[2]);
		int momentan = 0;

		for (int p = 0; p < parkvorgaenge.length; p++) 
		{
			if (Integer.parseInt(parkvorgaenge[p]) < 0) 
			{
				momentan -= 1;
			} else 
			{
				momentan += 1;
			}
			if (momentan > maxAutosInGarage) 
			{
				maxAutosInGarage = momentan;
			}
		}
		System.out.println(maxAutosInGarage);
	}

}
