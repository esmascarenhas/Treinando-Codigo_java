package usandothreads;

public class Teste {

	public static void main(String[] args)  {
/*		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//thread.start();
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);*/

		//runnable não é uma thread, precisa da classe thread
		MinhaThreadRunnalbe runnable1 = new MinhaThreadRunnalbe("Runnable #1", 500);
		MinhaThreadRunnalbe runnable2 = new MinhaThreadRunnalbe("Runnable #2", 500);
		MinhaThreadRunnalbe runnable3 = new MinhaThreadRunnalbe("Runnable #3", 500);
		Thread r1 = new Thread(runnable1);
		Thread r2 = new Thread(runnable2);
		Thread r3 = new Thread(runnable3);

/*		r1.setPriority(6);
		r2.setPriority(3);
		r3.setPriority(1);*/

		r1.setPriority(Thread.MIN_PRIORITY);
		r2.setPriority(Thread.NORM_PRIORITY);
		r3.setPriority(Thread.MAX_PRIORITY);

		r1.start();
		r2.start();
		r3.start();

		try {
			r1.join();
			r2.join();
			r3.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println("Programa finalizado. ");


	}

}
