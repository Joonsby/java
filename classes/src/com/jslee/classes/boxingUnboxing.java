package com.jslee.classes;

public class boxingUnboxing {
	void boxingUnboxing1(){
		int i = 10; // �Ϲ� ���� Ÿ��
		// Integer ii = new Integer(); // Integer�� �����ڰ� int�� String���� ���� �ΰ� �����ϱ� ������ int Ȥ�� String ���� ���� �־�� �Ѵ�. �̸� boxing�̶�� ǥ���Ѵ�.
		String s = new String("aaa"); // �� ����� ���� �������� ����̴�.
		// if(i == 10) {} (O)
		// if(in == 10) {} (X)
		// if(in <= 10) {} (X)
		// if(s.equals("aaa")) {} (O)
		// in�� ���� �ƴϰ� ��ü�̱� ������ �̷������� ����� �� ����. �׷��� if(s.equals("aaa")) {}�� ����ؾ� �Ѵ�.
		Integer in = new Integer(i); // Integer�� �������� �����͸� �����ϴ� Ŭ�����̴�. Integer�� Ŭ�����̱� ������ in�� ��ü�̴�.
		// ��ü Ÿ���� ������ �� �� ����.
		
		Boolean b = new Boolean(false);
		Long l = new Long("10");
		
		// ��ü Ÿ���� �Ϲ� Ÿ������ �ٲٴ� ���� unboxing�̴�.
		int j = in.intValue(); // j���� 10�� ����.
		boolean bl = b.booleanValue();
		long lg = l.longValue();
		System.out.println(in + "-" + j);
	}
	
	void autoBoxingunboxing() {
		String s = "java"; // �̷������� ������ �����ϴ� ���� autoBoxing�̴�.(��ü ������)
		
		Integer in = 10;
//		Integer in = new Integer(10); ���� �Ȱ��� ���̴�.
		
		Boolean bl = true;
		int i = in; // int j = in.intValue();
		boolean b = bl;
	}
	
	void StringToWrapper() {
		// String -> primitive(�Ϲ� {����} Ÿ��)���� �ٲٴ°�
		int r = Integer.parseInt("2030"); // ����ó�� ���� ���ڿ��� �ٲܼ� �ִ�. ���ڿ��� ���� �� �ٲ۴� ex) "hello world"
		double d = Double.parseDouble("2030.12");
		boolean b = Boolean.parseBoolean("false");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	}

}
