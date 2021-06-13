import java.util.Arrays ;
class Anagrams{

    static boolean checkIfAnagramMethod1(char[] str1 , char[] str2){

    	int str1Length = str1.length ;
    	int str2Length = str2.length ;

    	if(str2Length != str1Length){
    		return false ;
        }
	    Arrays.sort(str1) ;
	    Arrays.sort(str2) ;

	   for(int i = 0 ; i < str1Length ; i++){
	   	if(str1[i] != str2[i]){
	   		return false ;
	   	}
	   }

        return true ;
	}

	static boolean checkIfAnagramMethod2(char[] str1, char[] str2){

    	int str1Length = str1.length ;
    	int str2Length = str2.length ;

    	if(str1Length != str2Length){
    		return false ;
    	}

		int[] charArray = new int[26] ;

		for(int i = 0 ; i < str1Length ; i++){
			charArray[str1[i] - 'a']++ ;
			charArray[str2[i] - 'a']-- ;
		}
 
       for(int i = 0 ; i < 26 ; i++){
       	if(charArray[i] != 0)
       		return false ;
       }
       return true ;
	}
	public static void main(String[] args){
		String s1 = "cat" ;
		String s2 = "tac" ;
		System.out.println(checkIfAnagramMethod1(s1.toCharArray(), s2.toCharArray())) ;
		System.out.println(checkIfAnagramMethod2(s1.toCharArray(), s2.toCharArray())) ;
	}
}