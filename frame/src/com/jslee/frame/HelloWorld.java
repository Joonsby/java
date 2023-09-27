package com.jslee.frame;

import javax.swing.JButton;
import javax.swing.JFrame;

// awt&swing = java를 통해서 화면을 구현 / GUI라고도 표현한다.(Graphic User InterFace)
// 화면에는 container component layout 이렇게 세가지가 있다.
// 1.container는 component들이 올려질 창이다.
// 2.component는 실질적으로 화면구성을 담당할 요소이다. ex) button, textfield, checkbox
// 3.layoutManager은 container 위에 component를 올릴때 자리를 배치하는 방법이다.
// J가 붙으면 swing이라는 frame안에 포함된다는 뜻이다.

public class HelloWorld {	
	void FrameExam() {
		JFrame jframe = new JFrame("Hello"); // Jframe class를 사용하기 위해 Jframe 객체를 생성한다. -> container를 생성한 것이다.
		// 매개변수 안에 들어간 값은 title이다.
		JButton jbutton = new JButton(); // JButton class를 사용하기 위해 JButton 객체를 생성한다. -> component를 생성한 것이다.
		jframe.add(jbutton); // jframe에 jbutton을 추가한다.
		jframe.setVisible(true); // jframe이 보이도록 한다
		jframe.setSize(1300, 800); // jframe을 1300*800 사이즈로 설정한다.
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld run = new HelloWorld();
		run.FrameExam();
	}

}
