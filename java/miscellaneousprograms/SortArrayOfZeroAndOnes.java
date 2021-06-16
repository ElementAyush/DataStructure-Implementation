class SortArrayOfZeroAndOnes{

	public static void main(String[] args){
		int[] array = new int[]{0,1,1,0,0,1,0,1,0} ;
		int count0 = 0, count1 = 0 ;

		for(int i : array){
			if(i == 0){
				count0++ ;
			}
			if(i == 1){
				count1++ ;
			}
		}
		int arrLength = 0 ;
		while(count0 != 0){
			array[arrLength] = 0 ;
			arrLength++ ;
			count0-- ;
		} 
		while(count1 != 0){
			array[arrLength] = 1 ;
			arrLength++ ;
			count1-- ;
		}

		for(int i : array)
			System.out.println(i) ;

	}
	
}