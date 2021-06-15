class RemoveDuplicate{

	public static void main(String[] args){
		String str = "aayyush" ;
		StringBuilder stb = new StringBuilder() ;
		boolean[] uniqueArray = new boolean[26] ;
        
        for(int i = 0 ; i < str.length() ; i++){

        	if(uniqueArray[str.charAt(i) - 'a'] == true)
        	{
        		continue ;
        	}
        	else{
        		stb.append(str.charAt(i)) ;
        		uniqueArray[str.charAt(i) - 'a'] = true ;
        	}	
        }
        System.out.println(stb) ;
	}
}