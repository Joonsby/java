package com.jslee.method;

public class MethodTest {
	/* Method�̸� : method_01
	 ReturnType : ����
	 Parameter : ���� 1��
	 (�����ο���)�ϴ� �� :
	 "method_01�� ȣ��Ǿ����ϴ�" ���
	  ����*2 ����
	  */
	  
  	int method_01(int x){ // �Ű������� int x ���� ����
	int result = x * 2; // ������ ���� result�� x * 2�� ����
	System.out.println("method_01�� ȣ��Ǿ����ϴ�."); // method_01�� ȣ��Ǿ��ٴ� �޽��� ���
	return result; // result = x * 2 ���� ����
  	}
	 
	  	
	 /* 	
	 Method�̸� : method_02
	 ReturnType : String
	 Parameter: String 1��, ���� 1��
	 (�����ο���)�ϴ��� :
	 "method_02�� ȣ��Ǿ����ϴ�." ���
	  �μ��� ���� String�� �ٺ��� �ٿ��� ����
	 */
	  	
	String method_02(String text,int num) {
		text = "�ٺ�";
		System.out.println("method_02�� ȣ��Ǿ����ϴ�." + text);
		return text;
	}
	 
	  /*
	  Method�̸� : method_03
	  ReturnType : ���Ͼ���
	  Parameter : ���� 1���� String 1��
	  (�����ο���)�ϴ� ��
	  "method_03�� ȣ��Ǿ����ϴ�." ���	
	   */
		
	public void method_03(int num, String text) {
		System.out.println("method_03�� ȣ��Ǿ����ϴ�.");		
	}
	
	   /*
		Method�̸� : method_04
		ReturnType : �Ǽ���
		Parameter : ù��° �μ�(����), �ι�° �μ�(�Ǽ�), ����°�μ�(����)
		(�����ο���)�ϴ� �� :
		methodExam03_04�� ȣ��Ǿ����ϴ�. ��� 
		���ϰ� ����
		*/
	
	double method_04(int x,double y, int z) {		
		System.out.println("y�� ���� " + y + "�Դϴ�");
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest ob = new MethodTest(); // �޼ҵ带 ����ϱ� ���ؼ� Ŭ������ �޾ƿ�
		
		// ù��° �޼ҵ� ȣ��
		int method01 = ob.method_01(2);
		// return���� ��ȯ ���� ���� �Ű������� �� 2 * 2 = 4�� ��µȴ�.
		System.out.println("ù��° �޼ҵ��� ���� " + method01 + "�Դϴ�.");
		// return ���� ���� ���� method01�� 4�� ���� �����Ƿ� 4�� ��µȴ�.
		
		// �ι�° �޼ҵ� ȣ��
		String method02 = ob.method_02("�ٺ�", 2);
		// �Ű������� 2�� �Է��ؼ� return�� ������ ���� ��Ҹ� �������� �ʾƼ� ���� 2�� �������� �ʾҴ�.
		
		// ����° �޼ҵ� ȣ��
		ob.method_03(3, "text");
		// return���� �Ű������� �������� ������ �޼ҵ� ���𹮰� ȣ�⹮�� �Ű������� ������ ������ ���߱� ����
		// 3�� "text"�� �����Ͽ���.
		
		// �׹�° �޼ҵ� ȣ��
		ob.method_04(1, 2, 3);
		// �Ű������� int x, double y, int z�� �� ���������� y�� ���� return�߱� ������
		// y���� 2�� ��µȴ�.
	}

}
