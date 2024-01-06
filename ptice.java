package mystartforgoogle;

import java.util.Set;
import java.util.HashSet;

public class ptice {

	public static void main(String[] args) {
		Set<Integer> num = new HashSet<>();
		num.add(85);
		num.add(2);
		num.add(7);
		num.add(13);
		num.add(2);
		num.add(95);
		num.add(13);
		num.add(100);
		
		for(int i : num)
		{
			System.out.println(i);
		}

	}

}
