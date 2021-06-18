class BinarySearch{

	static boolean checkElementExists(int[] array, int element){
		int arrayLength = array.length ;

		int start = 0 ;
		int end = arrayLength - 1;
		int mid = (start + end) / 2 ;

		while(mid < end && mid >= start){
		
			if(array[mid] == element){
				System.out.println(mid) ;
				return true ;
			}
			else if(array[mid] > element){
				mid = (start + mid) / 2 ;
			}
			else{
				mid = (mid + end) / 2 ;
			}
		} 
		return false ;
	}

	public static void main(String[] args){

		int[] array = new int[]{10,11,12,13,14,15,16,17} ;
		System.out.println(BinarySearch.checkElementExists(array, 10)) ;
		
	}
}