class Node{

      int data ;
      Node left, right ;
      Node(){
         left=right= null ;
      }
      Node(int data){
         this.data = data ;
         left = right = null ;
      }
}

class Tree{

/** Method 1 to Implement a tree */
   public void addNode(Node root , int value){

       if(root.data >= value && root.left == null){
          root.left = new Node(value);
         }
       else if(root.data >= value && root.left != null){
         addNode(root.left, value) ;
        }
       else if(root.data < value && root.right == null){
         root.right = new Node(value) ;
        }
       else if(root.data < value && root.left != null){
         addNode(root.right, value) ;
        }
   }

/** Method 2 to Implement a tree with less if else  */
   public Node addNodeMethod2(Node root , int value){
      if(root == null)
         return new Node(value) ;

      if(root.data >= value){
        root.left = addNodeMethod2(root.left, value) ;
      }else{
         root.right = addNodeMethod2(root.right, value) ;
      }
      return root ;
   }

   public void preOrder(Node root){

      if(root == null)
         return ;

      System.out.println(root.data) ;
      preOrder(root.left) ;
      preOrder(root.right) ;
   }

	public static void main(String[] args){
      Tree tree = new Tree() ;
      Node root = new Node(10) ;
      // tree.addNode(root, 12) ;
      // tree.addNode(root, 9) ;
      // tree.addNode(root, 11) ;
      // tree.addNode(root, 4);
      // tree.addNode(root, 12);
      tree.addNodeMethod2(root, 12) ;
      tree.addNodeMethod2(root, 9) ;
      tree.addNodeMethod2(root, 11) ;
      tree.addNodeMethod2(root, 4) ;
      tree.addNodeMethod2(root, 12) ;

      tree.preOrder(root) ;
      
	}
}