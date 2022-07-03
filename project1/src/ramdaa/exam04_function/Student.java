//2022.03.25

package ramdaa.exam04_function;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {
	
	private String name;
	private int englishScore;
	private int mathScore;
	
	
// 롬복으로 구현
//	public Student(String name, int englishScore, int mathScore) {
//		this.name = name;
//		this.englishScore = englishScore;
//		this.mathScore = mathScore;
//	}
//
//	public String getName() { return name; }
//	public int getEnglishScore() { return englishScore; }
//	public int getMathScore() { return mathScore; }
	
} // end class
