class PowerOfTwo{

	public static boolean isPowerOfTwo(int x){

	  return x && (x & (x - 1));
	}
	public static void main(String[] args){
      System.out.println(PowerOfTwo.isPowerOfTwo(8)) ;
	}
}