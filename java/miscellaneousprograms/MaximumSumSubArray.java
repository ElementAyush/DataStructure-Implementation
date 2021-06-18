class MaximumSumSubArray{
	public static void main(String[] args){

		int[] arr = new int[]{-5, 4, 6, -3, 4, -1} ;
		int arrLength = arr.length ;
        int maxSum = -1 ; 
		for(int l = 1 ; l <= arrLength ; l++){
			System.out.println("Sub arrays for length : " + l) ;
			for(int j = 0 ; j + l <= arrLength ; j++){
				int sum = 0 ;
				for(int k = j ; k <= j + l -1 ; k++){
					sum += arr[k] ;
					System.out.print(arr[k]+" ");
				}
				if(sum > maxSum){
					maxSum = sum ;
				}
				System.out.println() ;
			}
		}
		System.out.println("And max sum is : " + maxSum) ;

	}
}