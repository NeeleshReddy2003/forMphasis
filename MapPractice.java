package mystartforgoogle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		Map<String,String> details = new HashMap<>();
		details.put("Name","Neelesh");
		details.put("DOB","March Sixteen");
		details.put("Birth Place","Kallurupalli,Nellore,AndhraPradesh");
		
		Set<String> comeon = details.keySet();
		
		for(String output : details.keySet())
		{
			System.out.println(output+"--->"+details.get(output));
		}
	}

}
