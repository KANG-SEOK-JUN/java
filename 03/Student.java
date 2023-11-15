package com.multi;

import java.lang.System;

public class Student {	//class = public
	int num =1;
	public String name ="홍길동";
	int ban =5;
	public Student () {	//Student 생성자 메소드 = public
			
	}
	
	public void StudentPrint()	{
		System.out.println("번호 ==>"+num);
		System.out.println("이름==>"+name);
		System.out.println("반==>"+ban);
	}
}
