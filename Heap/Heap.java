class Heap {
  int[] nodes ;
  Heap(int n){
    nodes = new int[n] ;
}
public static int getParentNode(int n){
  return nodes[(n-1)/2] ;
}
public static int getLeftNode(int n){
  return nodes[2*n + 1] ;
}
public static int getRightNode(int n){
  return nodes[2*n + 2] ;
}
  public static void main(String args[]){
  /*
          10
         /  \
        6    12
       / \  / \
      5   7 11 15
  */

  Heap heap = new Heap(7) ;
  }
}
