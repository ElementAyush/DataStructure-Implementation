import java.util.concurrent.Executors ;
import java.util.concurrent.ExecutorService ;

class ExecutorExamples{

	public static void main(String[] args) throws InterruptedException{

		ExecutorService executor = Executors.newSingleThreadExecutor() ; 
		executor.execute(()-> {
			System.out.print("Hello ") ;
			throw new RuntimeException("Planned exception after execute()");
	});
		Thread.sleep(1000);
		executor.execute(()-> System.out.println(" World!!!"));
	}
}