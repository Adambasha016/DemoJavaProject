package org.basic.prg.code.repet.code;

public class NestedLoop {
public static void main(String[] args) {
	int i=1;
	while(i<=10) {
		if(i%3==0) {
			++i;
			continue;
		}
		System.out.println(i);
		++i;
	}
}
}
