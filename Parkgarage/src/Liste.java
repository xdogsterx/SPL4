import java.util.ArrayList;

public class Liste {

	public static void main(String[] args) {
		ArrayList<String> warteliste = new ArrayList<String>();
		warteliste.add("4");
		warteliste.add("2");
		warteliste.add("6");
		warteliste.add("1");

		warteliste.remove(0);
		System.out.println(warteliste);
		System.out.println(warteliste.size());

		if (warteliste.contains("1")) 
		{
			warteliste.remove("1");
		}
		System.out.println(warteliste);
	}

}
