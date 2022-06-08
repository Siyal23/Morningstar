package lambdaLab;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExp {

	public static void main(String[] args) {
		int numbers[]= {10,15,9,66,78,54,60};
		List<Integer> numArr=Arrays.stream(numbers).boxed().toList();
		
		
		//To find max value
		Stream<Integer> stream1=numArr.stream();
	
		Integer var=numArr.stream().max((i1,i2)->{
			if(i1>i2) {
				return 1;
			}
			else {
				return -1;
			}
		}).get();
		System.out.println("Max "+var);
		
		//To find min value
		Stream<Integer> stream2=numArr.stream();
		Integer var2=stream2.min((i1,i2)->{
			if(i1>i2) {
				return 1;
			}
			else {
				return -1;
			}
		}).get();
		
		System.out.println("Min "+var2);
		
		//To find count
		Stream<Integer> stream3=numArr.stream();
		Long var3=stream3.count();
		System.out.println(var3);
		
		//To find average
		OptionalDouble stream4=IntStream.of(numbers).average();
		System.out.println(stream4.getAsDouble());
		
		//To find sum
		Stream<Integer> stream=numArr.stream();
		Integer sum=stream.reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}
}
