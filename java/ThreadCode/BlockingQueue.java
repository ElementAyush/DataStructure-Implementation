class RunInsertElement implements Runnable{

    int element ;
    RunInsertElement(int element){
    	this.element = element ;
    }

   	public void run(){
     BlockingQueue.add(element) ;
   	}
  }

class BlockingQueue{

   private static final int queueSize = 10 ;
   private static int[] customQueue = new int[queueSize] ;

   public static boolean add(int element){
   	
    synchronized(customQueue){
    System.out.println("Element to insert "+element+" Started by " + Thread.currentThread().getName()) ;
    int customQueueLength = customQueue.length ;
   	if(customQueueLength == 10){
   		return false ;
   	}
      customQueue[customQueueLength] = element ;
    }
    return true ;
   }

   public static void printQueue(){
   	for(int i = 0 ; i < queueSize ; i++){
   		System.out.print(customQueue[i] + " ") ;
   	}
   }

   public static void main(String[] args) throws InterruptedException{

   	for(int i = 0 ; i < 10 ; i++){
     new Thread(new RunInsertElement(i), "Thread "+i).start() ;
   	}
   	Thread.sleep(2000) ;
   BlockingQueue.printQueue() ;
	}
}