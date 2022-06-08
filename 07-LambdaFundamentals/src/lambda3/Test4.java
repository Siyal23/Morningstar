package lambda3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
	/*
	 * Stream contains two operations 
	 * 1.intermediate operation
	 * 2.terminal operation*/
	public static void main(String[] args) {
		String companies [] = {"Infosys", "TCS", "LTI", "Capgemini", "JPM", "ITC Infotech", "HDFC", "YesBank"};
		List<String> list = Arrays.asList(companies);
		
		List<Integer> list2=list.stream().filter(s->s.length()>=4).map(e->e.length()).collect(Collectors.toList());
		list2.forEach(e -> System.out.println(e));
	}

}
