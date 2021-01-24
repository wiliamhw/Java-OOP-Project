import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static array
		
		int[] intArrays = { 1, 2, 3, 4, 5 };
		
		//dynamic array
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add(new String("Hello"));
		
		for (Object i : list) {
			System.out.println(i);
		}
		
		
	}

}
