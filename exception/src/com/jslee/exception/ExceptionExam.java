package com.jslee.exception;

public class ExceptionExam {

	public static void main(String[] args) {
		try { // ���� �߻� -> try�� �ȿ� �ִ� ������ �����Ѵ�. / catch�� ���ܰ� �������� �����Ѵ�.
			int[] arr = new int[5];
			arr[0] = 789;
			arr[4] = 123; // �迭 �ε����� 4�� ����
			String str = "������";
			int i = Integer.parseInt(str);
			System.out.println(arr[0] + "," + arr[4]); // �迭 �ε����� 4�� ����
		} catch (Exception e) { // ���ܸ� �νĸ� �ϴ� �κ� -> ���ܸ� �����ϴ� �ڵ尡 ���� ���̴� �ƴ϶� try�κ��� ���ľ� �ȴ�.
			System.out.println(e);
		} finally {
			System.out.println("���α׷� ����");
		}
	}
}
