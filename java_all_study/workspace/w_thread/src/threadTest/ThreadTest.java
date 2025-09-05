package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		각 쓰레드는 각자의 자원에 접근한다.
//		즉, 자원을 공유하지 않는다.

//		Thread1 thread1 = new Thread1("♥");
//		Thread1 thread2 = new Thread1("★");

//		thread1.run();
//		thread2.run();

//		thread1.start();
//		thread2.start();

//		Runnable resource1 = new Thread2();
//		Runnable resource2 = new Thread2();
//		
//		Thread thread1 = new Thread(resource1, "?");
//		Thread thread2 = new Thread(resource2, "!");
//		
//		thread1.start();
//		thread2.start();

//		자원 공유
//		Thread2 resource = new Thread2();
//		
//		Thread thread1 = new Thread(resource, "&");
//		Thread thread2 = new Thread(resource, "|");
//		Thread thread3 = new Thread(resource, "~");
//		
//		thread1.start();
//		try {thread1.join();;} catch (InterruptedException e) {;}
//		join: 너부터 해, 그러나 start()로 시작된건 멈출 수 없다.
//		따라서 밑에 thread2, thread3은 멈춘다.
//		
//		thread2.start();
//		thread3.start();
//		
//		System.out.println("main 쓰레드");

//		쓰레드 종료
//		쓰레드를 정상 종료하기 위해서는 해당 쓰레드가 멈춰 있어야 한다.
//		쓰레드를 멈추는 sleep()과 같은 메소드는 항상 try ~ catch를 감싸주고
//		InterruptedException을 발생시켜 catch에 있는 종류 코드를 실행한다.
		Thread3 resource = new Thread3();

		Thread thread1 = new Thread(resource, "&");
		Thread thread2 = new Thread(resource, "|");
		Thread thread3 = new Thread(resource, "~");

		thread1.start();
		thread2.start();
		thread3.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			;
		}
		thread1.interrupt();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			;
		}
		thread2.interrupt();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			;
		}
		thread3.interrupt();

	}
}
