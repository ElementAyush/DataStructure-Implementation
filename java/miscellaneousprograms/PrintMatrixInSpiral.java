class PrintMatrixInSpiral{

	public static void main(String[] args){

		int[][] matrix = new int[][]{{1,2,3,4},
			                         {5,6,7,8},
			                         {9,10,11,12},
			                         {13,14,15,16}} ;
	    int k = 0 , m = 0 ;

	    while(k < 4 && m < 4){
	    	for(int i = 0 ; i < 4 ; i++){
	    		System.out.print(matrix[0][i] + " ");
	    	}
	    	
	    }
	}

}