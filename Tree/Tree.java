class Tree{

   private int treeSize;
   class Node{

   	int data;
   	Node left;
   	Node right;
   	Node(int data){
   		this.data = data ;
   	}
   }

   Tree(int n){
    treeSize = n ;
   }
   public void addNode(){
    
   }

	public static void main(String[] args){
      Tree tree = new Tree(5) ;
	}
}