package com.lymin.operator;

public class LogicOperatorNOTTest {
	public static void main(String[] args) {
		boolean isOnNotebook = true;

		if (!isOnNotebook) { // 노트북이 isOn이 아니라면.. 꺼져 있다면.. code의 리딩시 ! 많이 사용됩니다.
			System.out.println("Notebook is Off");
		} else {
			System.out.println("Notebook is ON");
		}

		// 위의 if (!isOnNotebook)는 아래와 같이 풀어 쓸 수 있습니다. 같은 의미 입니다.
		if (isOnNotebook == false) {
			System.out.println("NotebookEx is Off");
		} else {
			System.out.println("NotebookEx is ON");
		}

		///////////////////////////////////////////////////////
		if (isOnNotebook) {
			System.out.println("Notebook 03 is ON");
		} else {
			System.out.println("Notebook 03 is Off");
		}
		
		// 위의 if (isOnNotebook)은 아래와 같이 풀어 쓸 수 있습니다. 같은 의미 입니다.
		if (isOnNotebook == true) {
			System.out.println("Notebook 04 is ON");
		} else {
			System.out.println("Notebook 04 is Off");

		}
		///////////////////////////////////////////////////////

	}

}
