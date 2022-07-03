//2022.03.25

package ramdaa.exam02_consumer;


import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;


public class ConsumerExample {
	
	// 데이터를 매개변수로 받고, 돌려주는 것은 없는, 데이터 소비로직을 만들때 사용(규격화)
	public static void main(String[] args) {
		
		//void accept(T t) => t
		Consumer<String> consumer = t -> System.out.println(t + "8");	// 다형성-1
		
		consumer.accept("java");	// 다형성-2
		
//		--------
		// T U 타입 파라미터
//	    void accept(T t, U u)
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("Java", "8");
		
//		-------------
//		 void accept(double value);
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
//		------------
//		 void accept(T t, int value);
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);
		
	} // main
	
} // end class
