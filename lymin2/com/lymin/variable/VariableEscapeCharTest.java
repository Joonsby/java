package com.lymin.variable;

public class VariableEscapeCharTest {
	public static void main(String[] args) {
		System.out.println("VariableEscapeCharTest");
		
		String tab="\t";
		System.out.println("escapeChar Test tab-----"+tab+"--------------");
		
		String newLine ="\n";
		System.out.println("escapeChar Test newLine-----"+newLine+"--------------");
		
		String backSlash ="\\";
		System.out.println("escapeChar Test backSlash-----"+backSlash+"--------------");
	}
}
