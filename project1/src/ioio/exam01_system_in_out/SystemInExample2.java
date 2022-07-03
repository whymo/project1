//2022.04.01

package ioio.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample2 {
	
	
	public static void main(String[] args) throws Exception {	
		
		InputStream is = System.in;
		
		// 영문/ 숫자를 입력받기 위한 배열이라면, 100문자를 입력받을 수 있지만,
		// 한글은 자바언어에서 2바이트로 표현되기 때문에, 배열크기의 절반인 최대 50문자의 한글을 입력받을 수 있음
		
		byte[] datas = new byte[100]; 	// 바가지를 이전과는 틀리게 크게 만듦
		
		System.out.print("이름: ");		// Prompt 메세지 출력
		int nameBytes = is.read(datas); // 바가지로 읽어요
		
		// 최종 사용자가 키보다에서 여러문자를 입력한 이후, 마지막으로 엔터키를 치면
		// read() 메소드가 읽음. 읽은 바이트 배열에 있는 키코드값을 가지고
		// String 클래스의 생성자를 이용해서, 문자열로 다시 디코딩 수행
		// datas와  nameBytes 이걸 이용해 문자열로 디코딩
		
		String name = new String(datas, 0, nameBytes-2);	// 왜 -2를 할까? 비어있는 행이 나옴. 왜? 입력할때 엔터키까지 포함되어서!
															// 그래서 -2만큼 길이를 빼 버리면 : 엔터키는 제외하고 라는 뜻이 됨!
		
		System.out.print("하고 싶은말: "); // Prompt 메세지 출력
		int commentBytes = is.read(datas); // 바가지로 읽어요
		String comment = new String(datas, 0, commentBytes-2); // 디코딩
		
		// 한글 잘 나오게 디코딩 됨
		System.out.println("입력한 이름: " + name);		
		System.out.println("입력한 하고 싶은말: " + comment);	
		
	} // main
	
} //end class

