package softblue.lambda;


import java.util.Arrays;
import java.util.List;


public class Ex01 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.sort((x,y) -> { return -x.compareTo(y); });
		list.forEach(System.out::println);
		

	}

}