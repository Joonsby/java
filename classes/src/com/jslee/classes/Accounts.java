package com.jslee.classes;

public class Accounts {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		String chulName = "Ã¶¼ö";
		String chulNo = "123456";
		long chulBalance = 1000;
		
		String youngName = "¿µÈñ";
		String youngNo = "654321";
		long youngBalance = 200;
		
		chulBalance -= 200;
		youngBalance += 100;
		
		System.out.println("Ã¶¼öÀÇ °èÁÂ");
		System.out.println(" °èÁÂ¸íÀÇ : " + chulName);
		System.out.println(" °èÁÂ¹øÈ£ : " + chulNo);
		System.out.println(" ¿¹±İÀÜ°í : " + chulBalance);
		
		System.out.println("¿µÈñÀÇ °èÁÂ");
		System.out.println(" °èÁÂ¸íÀÇ : " + youngName);
		System.out.println(" °èÁÂ¹øÈ£ : " + youngNo);
		System.out.println(" ¿¹±İÀÜ°í : " + youngBalance);
	}

}
