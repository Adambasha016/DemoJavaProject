package org.Itpl.Diatoz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Demo02 {
public static void main(String[] args) {
	 List<Object> list = Collections.synchronizedList(new ArrayList<>());
	 System.out.println(list +"before");
	IntStream.range(1, 6).parallel().map(i -> {list.add(i);return i;}).forEachOrdered(System.out::print);
	
	System.out.println();
	list.forEach(System.out::print);
	System.out.println(list+"dd");
}
}
