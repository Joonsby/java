package com.jslee.method;

public class Method {
	
	// �޼ҵ带 �����ϴ� ���
	// void �޼ҵ��()
	// {
	// }	
	
	void method01() {
		System.out.println("method 1");
	}
	
	void method02(int x, double y) {
		// �������� ������ �޾ƿԱ� ������ int �������� ������� �Ѵ�.
		//	��ȣ���� ���� �Ű�����, ����, �μ���� �θ���.
		//	�Ű������� ������ ���¸� �����ϰ� ������� �Ѵ�.
		//	�Ű������� �Ѳ����� �����ϴ°͵� �ȵȴ�. ex) int x,y (X)
		System.out.println("method 2");
		System.out.println("main num = " + x);
	}
	
	int method03() {
		// void�� return�� ���ٴ� ���̴�.
		// �׷��� return�� ���� ���� void�� ����Ѵ�.
		// �������� return �ϱ� ������ method�տ� int�� �����ش�.
		// return�� �����ϰ� �Ǹ� ���α׷��� ���̻� �������� �ʱ� method�� ���� �Ʒ��� �;��Ѵ�.
		// return�� �Ѱ��� �����ؼ� ������ �� �ִ�.
		// �Ű������� return�� �ƹ��� ������谡 ���� ������ ���� ����Ҽ� �ִ�.
		int su = 789;
		System.out.println("method 3");
		System.out.println("su = " + su);
		// main�� �ڵ�ȣ���̱� ������ �ٸ� method�� ȣ���� �� ����.
		return su;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		method�� �߿��� ������ �ٸ� ����� �ڵ带 �����ϴµ� �־ ������ �߿��� ����̱� �����̴�.		
		���� ����� ���� �ڵ带 �� ���� ���ؼ��� ���ε� �� ������ �Ѵ�.
		public static void main(String[] args) {}�� �ϳ��� method�̰� method���� {}�� ����.
		main�� ���α׷��� ������ �ϴ� ����̱� ������ main method�� �翬�� ����. main method�� ������ method�� ����� �� ����.
		method�� ������� �ʴ´ٰ� ������ ���� ������ �ʴ´�. ���α׷��� �پ������� �������� method�� ����ϴ� ���� �Ұ����ϴ�.
		method�� ���α׷��� �����ϴ� �ϳ��� ��ǰ�̴�. method ���� main�� �� ���α׷����� �ϸ� ���������� ������ �����.
		���� ���������� �����ϰ� �ϱ� ���ؼ��� method�� Ȱ���ϴ� ���� ����. ��� ���α׷��� ���� �� method�� �����Ǿ� �ֱ� ������ method�� �� �ƴ� ���� �߿��ϴ�.
		method�� ����� ����� ���̴�. method�� �ּ������� ª�� �����ϴ� ���� ����. method ������ ���� method���� �ּ��� �޾ƾ� �Ѵ�.
		main method�� ���� ���� ȣ��ǰ� ȣ������ �ʾƵ� �ڵ����� ȣ��Ǵ� ������ method�̴�.
		main�� ���� �Ʒ��� ��ġ�ϴ� ���� �Ϲ����� ���̴�.
		*/
		
		Method ob = new Method(); // �޼ҵ带 ����ϱ� ���ؼ� Ŭ������ �޾ƿ� ���̴�. Ŭ�����̸� �޼ҵ��̸� = new Ŭ�����̸�();
		Method ob2 = new Method();
		Method ob3 = new Method();
		int num = 111; // 111�̶�� int ���� ����
		
		System.out.println("main method"); // main method ���
		System.out.println(num); // 111 ���
		ob.method01(); // �޼ҵ带 ȣ���ϴ� ��� : �޼ҵ��();
		ob2.method02(num, 456); // method02 ȣ�� parameter�� ������ �Է��ϸ� ������ ������ method02�� ������ �� �ִ�.
		int z = ob3.method03();
		System.out.println("method03 su = " + z);
	}

}
