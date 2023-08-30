package org.Itpl.Diatoz;

import java.util.Properties;
import java.util.TreeMap;

public class Demo04 {
public static void main(String[] args) {
	TreeMap<String, String> tree = new TreeMap<>();
	tree.put("tool", "screwdriver");
	tree.put("problem", "knife");
	Properties pro = new Properties();
	tree.forEach((k,v) -> pro.put(k,v));
     String t= pro.getProperty("tool");
     String r=pro.getProperty("knife");
     System.out.println(t+"  "+r);
     System.out.println(pro);
}
}
