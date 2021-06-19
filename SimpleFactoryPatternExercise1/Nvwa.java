package SimpleFactoryPatternExercise1;

public class Nvwa {
	public static Person getPerson(String sex) {
		if(sex=="M") {
			return new Man();
		}
		else if(sex=="W") {
			return new Woman();
		}
		else if(sex=="R") {
			return new Robot();
		}
		else {
			return null;
		}
	}

}
