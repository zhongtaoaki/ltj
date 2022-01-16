package fifth;


/**
 * 使用try catch对可能发生问题的代码块进行报错处理
 * 
 * @author zhong
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {

		Player player = new Player();
		player.age = 10;
		try {
			player.dailyRoutine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

class Player {

	int age;

	public void play() throws RuntimeException{

		if (age < 18) {
			throw new RuntimeException("对不起你未满18岁");
		}
		System.out.println("开始打游戏了。");
	}
	
	public void dailyRoutine() {
		System.out.println("吃饭");
		this.play();
		System.out.println("睡觉");
	}

}
