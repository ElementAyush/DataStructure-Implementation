import java.util.* ;

class Hashmaptest{
  public static void main(String args[]){
    Map<String,Integer> map1 = new HashMap<>() ;
    map1.put("Ayush",1) ;
    map1.put("Dixit",2) ;

    Map<String,Integer> map2 = new HashMap<>() ;
    map2 = map1 ;

    map2.forEach((k,v) -> System.out.println(k + " : " + v)) ;

    map1.put("Ayush", 4) ;

    map2.forEach((k,v) -> System.out.println(k + " : " + v)) ;
  }

}
