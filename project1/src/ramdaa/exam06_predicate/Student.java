//2022.03.28

package ramdaa.exam06_predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Student {
	private String name;
	@Getter private String sex;
	@Getter private int score;
	
//	public Student(String name, String sex, int score) {
//		this.name = name;
//		this.sex = sex;
//		this.score = score;
//	}

//	public String getSex() { return sex; }
//	public int getScore() { return score; }
	
} // end class
