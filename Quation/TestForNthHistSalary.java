package org.prctice.DSA.FAANGM.Quation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestForNthHistSalary {
	public static void main(String[] args) {
		Map<String, Integer> map1 =new  HashMap<>();
		map1.put("anil", 1000);
		map1.put("bhavan",1300);
		map1.put("mical", 1500);
		map1.put("tom", 1600);
		map1.put("ankit", 1200);
		map1.put("daniel", 1700);
		//	/second highest value sal
		//	Entry<String, Integer> entry = map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(1);

			Entry<String, Integer> entry = map1.entrySet().stream().sorted(Collections.reverseOrder( Map.Entry.comparingByValue()))
		.collect(Collectors.toList()).get(1);
			System.out.println(entry);

//		Entry<String, Integer> value = getValue(2,map1);
//		System.out.println(value);

	}


//	public static Map.Entry<String, Integer> getValue(int num,Map map1){
//		return map1.entrySet().stream()
//				.sorted(Collections.reverseOrder( Map.Entry.comparingByValue()))
//				.collect(Collectors.toList()).getClass();

	}

