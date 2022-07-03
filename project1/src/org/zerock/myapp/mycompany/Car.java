//2022.03.14

package org.zerock.myapp.mycompany;

import org.zerock.myapp.hankook.SnowTire;
import org.zerock.myapp.hankook.Tire;
//import org.zerock.myapp.kumho.Tire;	// 이렇게 같은 이름을 동시에 임포트해주면 컴파일 오류가 난다! 
										//타이어3이 타이어4가 어디꺼인지 모름 / 되도록 class 이름을 유니크하게!
import org.zerock.myapp.hyundai.Engine;	// fqcn형태
import org.zerock.myapp.kumho.BigWidthTire;


public class Car {
	// 부품(집합) 관계의 필드 선언
	Engine engine = new Engine(); 		// 객체 생성해서 넣어줌, Engine 컴파일 오류 => import
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	Tire tire3 = new Tire();
	org.zerock.myapp.kumho.Tire tire4 = 				// 심플네임 앞에 직접 fqcn으로 넣어줘야한다
			new org.zerock.myapp.kumho.Tire();			// 우리는 금호타이어를 쓰고싶으니까
	
	

} // end class
