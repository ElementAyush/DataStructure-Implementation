class Tree{

   private int treeSize;
   static Node data, left, right ;

   static class Node{

   	Node(int data){
   		this.data = data ;
         left = null ;
         right = null ;
   	}
   }

   Tree(int n){
    treeSize = n ;
   }

   public Node addNode(Node root , int value){
    if(root.data < value){
       root.right = addNode(root, value) ;
    }else{
     root.left = addNode(root, value) ;
    }

    return root ;
   }

   public void preNode(Node root){

      if(root == null)
         return ;

      System.out.println(root.data) ;
      preNode(root.left) ;
      preNode(root.right) ;
   }

	public static void main(String[] args){
      Node root = new Node(10) ;
      Tree tree = new Tree(5) ;
      tree.addNode(root, 4);
      tree.addNode(root, 12);
	}
}