package lambda3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		String companies [] = {"Infosys", "TCS", "LTI", "Capgemini", "JPM", "ITC Infotech", "HDFC", "YesBank"};
		List<String> list = Arrays.asList(companies);
		
		List<String> list2=list.stream().filter((String s)-> s.length()>4 ).collect(Collectors.toList());
		list2.forEach(s-> System.out.println(s));
		
		
	}

}
