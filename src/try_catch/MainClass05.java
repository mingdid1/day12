package try_catch;

class TestClass05{
	public void test1() throws InterruptedException{
		System.out.println("test111");
		test2();
	}
	
	public void test2() throws InterruptedException{	// 메소드 호출한 곳으로 예외 전가
														// 이럴 경우에는 try/catch 사용이 더 좋은
		System.out.println("test222");
		Thread.sleep(0);
//		try {
//			Thread.sleep(0);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}

public class MainClass05 {
	public static void main(String[] args) throws InterruptedException{
	
		TestClass05 t = new TestClass05();
		t.test1();
	}
}
