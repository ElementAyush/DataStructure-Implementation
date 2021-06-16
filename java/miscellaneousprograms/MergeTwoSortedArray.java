class MergeTwoSortedArray{

	public static void main(String[] args){
		int[] arr1 = new int[]{1,7,9} ;
		int[] arr2 = new int[]{3,5,8} ;

		int arr1Length = arr1.length ;
		int arr2Length = arr2.length ;
		int[] mergedArray = new int[arr1Length + arr2Length] ;

		int i = 0 , j= 0 , k = 0 ;

		while(i < arr1Length && j < arr2Length){
			if(arr1[i] <= arr2[j]){
				mergedArray[k] = arr1[i] ;
			    i++ ;
			}
			else{
				mergedArray[k] = arr2[j] ;
				j++ ;
			}
			k++ ;
		}
		while(i < arr1Length){
			mergedArray[k] = arr1[i] ;
			i++ ; k++ ;
		}
		while(j < arr2Length){
			mergedArray[k]= arr2[j] ;
			j++ ; k++ ;
		}
		
		for(int m : mergedArray){
			System.out.print(m +" ");
		}

	}
	
}