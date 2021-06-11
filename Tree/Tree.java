class Tree{

   static class Node{
      int data ;
      Node left, right ;
   	Node(int data){
   		this.data = data ;
         left = null ;
         right = null ;
   	}
   }


   public void addNode(Node root , Node newNode){
   
      if(root.data >= newNode.data){
         addNode(root.left , newNode) ;
         root.left = newNode ;
      }
      else{
         addNode(root.right , newNode) ;
         root.right = newNode ;
      }
   }

   // public void preNode(Node root){

   //    if(root == null)
   //       return ;

   //    System.out.println(root.data) ;
   //    preNode(root.left) ;
   //    preNode(root.right) ;
   // }

	public static void main(String[] args){
      Tree tree = new Tree() ;
      Node root = new Node(10) ;
      tree.addNode(root, new Node(12)) ;
      tree.addNode(root, new Node(9)) ;
      tree.addNode(root, new Node(11)) ;
      // Tree tree = new Tree(5) ;
      // tree.addNode(root, 4);
      // tree.addNode(root, 12);
	}
}