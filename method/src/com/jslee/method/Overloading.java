package com.jslee.method;

public class Overloading {
	
	// ù��° �޼ҵ�
	void setOverload(int x) { // int �Ű����� 1��, return (X) -> void ���
		System.out.println(x);
	}

	// �ι�° �޼ҵ�
	String setOverload() { // �Ű����� (X) return (O)
		System.out.println("String re = om.setOverload();");
		return null; // �Ű������� ������ return ���� ��� �ϱ� ������ null�� return
	}
	
	// ����° �޼ҵ�	
	void setOverload(boolean x) { // boolean �Ű����� 1�� return(X)
		System.out.println(x);		
	}
	
	// �׹�° �޼ҵ�
	String setOverload(String x, String y) { // �Ű����� 2�� return (O)
		System.out.println(x + "," + y);
		return x;
	}
	
	// �ټ���° �޼ҵ�
	void getOverload() { // �Ű����� X return X -> void ���
		System.out.println("om.getOverload();");
	}
	
	// ������° �޼ҵ�
	String getOverload(String x, String y) { // ������ �Ű����� 2�� return (O) 
		String result = x + y;
		System.out.println(result);
		return result;
	}
	
	// �ϰ���° �޼ҵ�
	char getOverload(String x) { // String �Ű����� 1�� return(O)
		System.out.println("char");
		return ' ';
		// return 0;�� ����� �����ϴ� 0~127���� �ƽ�Ű�ڵ�� char�� ǥ���� �� �ֱ� �����̴�
	}
	
	// ������° �޼ҵ�
	float getOverload(float x) { // float �Ű����� 1�� return(O)
		System.out.println("float");
		return x;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading om = new Overloading(); // Ŭ������ ��밡���ϰ� �����
		om.setOverload(5); // int �Ű����� 1�� return(X)
		String re = om.setOverload(); // String �Ű����� (X) return(O)
		om.setOverload(false); // boolean �Ű����� 1�� return(X)
		om.setOverload("A","Java"); // String �Ű����� 2�� return(X)
//		
		om.getOverload(); // �Ű����� X return X
		char ch = om.getOverload("hello"); // String �Ű����� 1�� return(O) 
		om.getOverload("aa","BB"); // String �Ű����� 2�� return(X)
		om.getOverload(5.2f); // float �Ű����� 1�� return(X)
	}

}
