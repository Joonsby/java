package com.jslee.array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/*
		변수 < 배열 < 컬렉션		
		배열 : 변수들의 집합
		이름,아이디,비밀번호,연락처,주소....
		int a;
		int b;
		int c;
		int d;
		int e;

		int [] f = new int[5]; -> f[0]~f[4] 이해가 안된다면 반드시 주석으로 표시할 것
		System.out.println(f) -> []표시가 없기 때문에 배열을 이런식으로 표기하는 것은 출력할 수 없다. 정확한 지칭이 필요하다.
		System.out.println(f[2]) -> 이런식으로 배열을 표현하는 것이 올바른 식이다.
		f[0] = 123;
		다섯개의 배열을 다 출력하기 위해서는
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);		
		System.out.println(f[3]);
		System.out.println(f[4]);
		이런식으로 전부 입력해야 한다.
		
		이를 해결하기 위해서는 for문을 이용하여 모두 출력할 수 있다.
		for(int i = 0; i <= 4; i++){
			System.out.println(f[i]);
		}
		이런식으로 출력할 수 있다.
		
		위의 다섯개의 변수와 아래의 배열은 같다.
		[]를 앞에 붙이면 선언하는 뜻이다.
		배열의 공간은 늘릴수도 없고 줄일수도 없다.
		만약 배열이 몇개 필요할지 모르는 상황이면 미리 여유롭게 크게 만들어 놔야 한다.
		배열은 이름으로 구분이 불가능하기 때문에 번호로 구분한다.
		배열의 순서는 무조건 0번부터 순차적으로 늘어나는 번호로 시작한다.
		배열은 만들때만 전체라는 개념이 있고 출력할 때는 전체라는 개념이 없다.
		*/
		
		int [] data = {67,54,11,34,99,87,21,44,73,2};
		/*
		data[0] = 67;
		data[1] = 54;
		data[2] = 11;
		data[3] = 34;
		data[4] = 99;
		data[5] = 87;
		data[6] = 21;
		data[7] = 44;
		data[8] = 73;
		data[9] = 2;
		 */
		int i,max,min,hap = 0;
		
		System.out.println("*** result *** \n");
		max=data[0];
		min=data[0];
		for (i = 0; i < data.length; i++) {
			if(max < data[i]) max = data[i];
			/*
			67 < 67 == false  // data[0](67)이 data[0](67)보다 작지 않기 때문에 max는 67이다.
			67 < 54 == false  // data[0](67)이 data[1](54)보다 작지 않기 때문에 max는 67이다.
			67 < 11 == false  // data[0](67)이 data[2](11)보다 작지 않기 때문에 max는 67이다.
			67 < 34 == false  // data[0](67)이 data[3](34)보다 작지 않기 때문에 max는 67이다.
			67 < 99 == true   // data[0](67)이 data[4](99)보다 작기 때문에 max는 data[4]인 99로 바뀐다.
			99 < 87 == false  // data[4](99)가 data[5](87)보다 작지 않기 때문에 max는 99이다.
			99 < 21 == false  // data[4](99)가 data[6](21)보다 작지 않기 때문에 max는 99이다.
			99 < 44 == false  // data[4](99)가 data[7](44)보다 작지 않기 때문에 max는 99이다.
			99 < 73 == false  // data[4](99)가 data[8](73)보다 작지 않기 때문에 max는 99이다.
			99 < 2  == false  // data[4](99)가 data[9](2) 보다 작지 않기 때문에 max는 99이다.
			*/
			
			if(min > data[i]) min = data[i];
			/*
			 * 67 > 67 == false // data[0](67)이 data[0](67)보다 크지 않기 때문에 min은 67이다. 67 > 54
			 * == true // data[0](67)이 data[1](54)보다 크기 때문에 min은 data[1]인 54로 바뀐다. 54 > 11
			 * == true // data[1](54)이 data[2](11)보다 크기 때문에 min은 data[2]인 11로 바뀐다. 11 > 34
			 * == false // data[2](11)이 data[3](34)보다 크지 않기 때문에 min은 11이다. 11 > 99 == false
			 * // data[2](11)이 data[4](99)보다 크지 않기 때문에 min은 11이다. 11 > 87 == false //
			 * data[2](11)이 data[5](87)보다 크지 않기 때문에 min은 11이다. 11 > 21 == false //
			 * data[2](11)이 data[6](21)보다 크지 않기 때문에 min은 11이다. 11 > 44 == false //
			 * data[2](11)이 data[7](44)보다 크지 않기 때문에 min은 11이다. 11 > 73 == false //
			 * data[2](11)이 data[8](73)보다 크지 않기 때문에 min은 11이다. 11 > 2 == true //
			 * data[2](11)이 data[9](34)보다 크기 때문에 min은 data[9]인 2로 바뀐다.
			 */
			hap += data[i];
		}
		System.out.println("minimum == " + min); // data[9]인 2가 출력된다.
		System.out.println("maximum == " + max); // data[4] 인 99가 출력된다.
		System.out.println("total == " + hap); // 모든 배열의 합인 492가 나온다.
	}
	// int num = 10; 
	// int [] arr = new int[num]; (X)
	// 선언할때 바로 가변 변수를 넣는 것은 안된다.
	
	// int num = 10;
	// int [] arr;
	// arr = new int[num]; (O)
	
	// Scanner sc = new Scanner(System.in);
	// int num = sc.nextInt();
	// int[] arr;
	// arr = new int[num];
	// 사용자가 입력할 값을 배열로 만드는 것도 Java로 가능하다.
	
	// 뒤에 있는 대괄호에 정확한 수치를 기입해야 된다
	// 다른 프로그래밍 언어에서는 가변 변수를 넣는 것이 안된다.
	// 그러나 자바에서는 가변 변수를 기입 하는 것이 가능하다.

}
