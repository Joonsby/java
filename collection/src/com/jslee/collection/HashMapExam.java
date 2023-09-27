package com.jslee.collection;

import java.util.HashMap;
// map�� ������� ������ �ƿ� ���� ������ �����͸� ã������ ������ ������� �������� �����ϰ� �ȴ�.
// ���� �ڷḦ �˻��� �� �ξ� �� ���� ã�� �� �ִ�.
import java.util.Set;

class HashMapExam extends HashMap<String, Integer>{ // HashMap�� ��� ������ <> Generic type�� ���¿� �°� �Է������ �Ѵ�.
	public HashMapExam() { // ������ ���� return (X) parameter (X)
//		super(); ������ ���� ���������� api������ ���ϴ� ȣ�� ���·� ������� �Ѵ�.
//		HashMap<String, Integer> hash = new HashMap<String, Integer>();	// ��õ� �ʱ��� �뷮���� ��� �ִ� HaspMap�� �Ǽ��ϰ� ��ҵ��� �����´�.
		// �ڽ��� �����ڸ� ȣ��� �ݵ�� �θ� �ݵ�� �ҷ��� �Ѵ�.
		// HashMap(Map<? extends K,? extends V> m) K�� Key, V�� Value
		// key�� ��ҵ��� �̸��̶�� �����ϸ� �ȴ�.(naming)
		// key�� �ڷ��� �̸��̱� ������ Value���� ��� ���� ������ String �����̾�� �Ѵ�.
		// key���� ������ �� �ֱ� ���ؼ� �ߺ��� �Ǹ� �ȵȴ�.
		/*super.*/put("a", 10); // �� �ʾȿ� �ִ� ��õ� value�� key�� ���ս�Ų��. // �θ��� ���� ������ �ؾߵǱ� ������ super�� ����Ѵ�.
		// ������ �θ�κ��� ��ӹ��� ���� ���� ���̱� ������ super�� default�� �� �ֱ� ������ super�� �����ϴ� �͵� �����ϴ�.
		/*super.*/put("b", 20); // put�� �����͸� ������� ���� �ִ� ���� �ƴ϶� �������� �����͸� ��ġ�Ѵ�.
		/*super.*/put("c", 30); // hash.put�� ���������� �����Ͱ� ����� ���� �ƴ϶� �������� ����� ���̴�.
		// ���������� �����͸� ������ ���̸� ArrayList������ ����ؾ� ������ �ڷᰣ�� ������ �������� �ʴ´ٸ� HashMap������ ����ϸ� �ȴ�.
		
		System.out.println("size = " + size());
		
		Set<String> s = /*HaspMap������.*/keySet(); // key������ �����ϰڴٴ� ���̴�. ������ key������ s�� �����ߴ�. <K(Key)>�̱� ������ String�� �־���� �ȴ�.
		for(String str : s) { // key�� ������ �ִ� ��ŭ �ݺ� ��Ű�ڴٴ� ������ for��
			int i = get(str); // ������ Ű�� ���ε� ���� �����ϰų�, �� �ʿ� Ű�� ���� ������ ���� ��� null�� �����Ѵ�.
			// hash.get() �ȿ��� key���� �Է��ؾ� �Ѵ�. �Է��� key���� �������� �ʴ´ٸ� null�� �����Ѵ�.
			System.out.printf("key = %s => value = %d%n", str, i); // str(key)�� i(value)�� �Բ� ����ϰڴٴ� ���̴�.
			// %s ���ڿ����
			// %d ������ ���
			// %n �ٹٲ�
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HashMapExam(); // ��ü�� ��������� ���ÿ� �����ڰ� �����ȴ�.
	}

}
