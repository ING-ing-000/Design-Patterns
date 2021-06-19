package SimpleFactoryPatternExercise1;

public class Client {
	public static void main(String args[]) {
		Person person1;
		Person person2;
		Person person3;
		person1=Nvwa.getPerson("W");
		person2=Nvwa.getPerson("M");
		person3=Nvwa.getPerson("R");
		person1.createHumanBeings();
		person2.createHumanBeings();
		person3.createHumanBeings();
	}

}

//新增Robot 需要增加一个新的Robot类，在Nvwa里面添加else if 代码
//违法了开闭原则