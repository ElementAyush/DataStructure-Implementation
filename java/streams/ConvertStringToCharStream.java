import java.util.* ;
import java.util.stream.IntStream ;

class ConvertStringToCharStream{

	public static void main(String[] args){
     String str = "this_is_legal" ;
     str.chars()
        .mapToObj(c -> (char)c)
        .forEach(System.out :: println) ;

/* ---  store stream of char as their int values
		
        IntStream intstream = str.chars() ;
        intstream.forEach(System.out :: println) ;
*/


	}
	
}