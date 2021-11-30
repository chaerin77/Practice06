package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//모든 회원을 관리하는 배열을 만든다.
		User[] cArray = new User[3];//여기 Customer로 써서 안됐었음 밑에꺼 쓰는거랑 헷갈린듯
		
		User s1 = new Customer("jws","j1234","정우성",1000);//부모 자식일때 이렇게 쓰는거 가능
		//Customer c1 = new Customer("jws","j1234","정우성",1000);
		
		User s2 = new Customer("yjs","y2345","이효리",2000);
		//시선을 User에게 둔것 오늘 한 rectangle,circle,triangle,을 shape에게 상속해서 배열에 담고 메소드명 같을때 오버라이드 개념나왔던 그거

	    User s3 = new Employee("master","7788","운영자",5000000);
	
	    cArray[0]=s1;
	    cArray[1]=s2;
	    cArray[2]=s3;
	    
	    for(int i=0; i<cArray.length; i++) {
	    	cArray[i].showInfo();
	    }
	}
	

}
