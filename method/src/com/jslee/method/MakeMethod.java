package com.jslee.method;

public class MakeMethod {
	// 1�� �޼ҵ� (������,�Ű����� 2��, return (O))
	int method01(int x,int y) { // main �޼ҵ忡 �ִ� 33,22���� �޾Ƽ� ���� int x, y�� �����Ѵ�.
		int result = x + y; // main �޼ҵ忡�� �޾ƿ� x y ���� ���� result ������ �����.
		return result; // result ������ 32��°�� main �޼ҵ忡 return ���ش�. 
	}
	
	// 2�� �޼ҵ� (������, �Ű����� 1��, return (O))
	String method02(String text) { // main �޼ҵ忡 �ִ� "java"��� ���ڸ� text��� ������ �����Ѵ�.
		System.out.println("����� ���ڴ� [" + text + "]�Դϴ�."); // "java"��� ���ڰ� �� text��� ������ �ܼ�â�� ����Ѵ�.
		return text; // "java��� ���ڰ� �� text��� ������ 35��° �ٿ� �ִ� method�� return ���ش�.
	}
	
	// 3�� �޼ҵ� (������, �Ű����� 2��, return (O))	
	int methodExam03(int x, String y) { // main �޼ҵ忡 �ִ�  ���� 2023 �� ���ڿ� "green"�� ���� x�� y�� �������ش�.
		System.out.println("���� �⵵�� " + x + "�� �Դϴ�."); // 2023�� ���Ե� x�� ����Ѵ�.
		System.out.println("My favorite color is [" + y + "]"); // "green"�� ���Ե� y�� ����Ѵ�.
		return x; // x���� 38��° �ٿ� return ���ش�.
	}
	
	
	// 4�� �޼ҵ� (�Ǽ���, �Ű����� 2��, return (O))
	double method04(double x, int y) { // main �޼ҵ忡 �ִ� �Ǽ� 5.5�� ���� 8�� �Ű������� �������ش�.
		double result = x * y; // x�� y �� ���� result��� ������ �����Ѵ�.
		System.out.println("x * y = " + result); // x * y = result ������ ������ش�.
		return result; // 41��° �ٿ��� �޾ƿ� 5.5 * 8 = 44.0�� ����� �Ű����� �ٽ� return���ش�.
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeMethod mme = new MakeMethod(); // Class�� ������ ��밡���ϰ� ����� �ش�.
		int k = mme.method01(33,22); // 1�� �޼ҵ��� �Ű������� ���� 33,22�� �Ҵ����ش�.
		System.out.println(k); // 1�� �޼ҵ忡�� return ���� result��(33+22=55)�� ����Ѵ�.
		String s = mme.method02("java"); // 2�� �޼ҵ��� �Ű������� "java"��� ���ڿ��� �������ش�.
		System.out.println(s); // 2�� �޼ҵ忡�� return ���� java�� ������ش�.
		mme.methodExam03(2023,"green"); // 3�� �޼ҵ��� �Ű������� ���� 2023, ���ڿ� "green"�� ���� �������ش�.
		double d = mme.method04(5.5,8); // 4�� �޼ҵ��� �Ű������� �Ǽ� 5.5�� ����8�� �������ص� return ��(44.0)�� �޾Ƽ� ���� d�� �������ش�. 
		System.out.println(d); // 4�� �޼ҵ忡�� return ���� �Ǽ� 5.5 * 8 = 44.0�� ����Ѵ�.
				
	}

}
