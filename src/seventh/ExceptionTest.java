package seventh;

public class ExceptionTest {

	
	public static void main(String[] args) {
		
		
		System.out.println(new ExceptionTest().test());
		
	}
	
	
	public int test() {
		
		try {
			System.out.println(1);
			int i = 1/0;
		} catch (Exception e) {
			System.out.println(2);
			return 22;
		}finally {
			System.out.println(3);
			
		}
		return 33;
		
		
	}
}
