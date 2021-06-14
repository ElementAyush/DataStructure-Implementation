import java.util.* ;

class Node{
	int data;
	Node left, right ;
	Node(int data){
		this.data = data ;
		left = right = null ;
	}
}

class DepthFirstSearch{

	Node addNode(Node root, int value){
      
      if(root == null){
      	return new Node(value) ;
      }
      if(root.data <= value){
      	root.right = addNode(root.right, value) ;
      }
      else{
      	root.left = addNode(root.left, value) ;
      }
      return root ;
	}

	void dfs(Node root){
     Stack<Node> visitedStack = new Stack<>() ;
     //Map<Node,Integer> isVisited = new HashMap<>() ;
     visitedStack.push(root) ;
     
     while(!visitedStack.empty()){
     	Node element = visitedStack.pop() ;
     	System.out.println(element.data) ;
     	if(element.left != null){
     		visitedStack.push(element.left) ;
     	}
     	if(element.right != null){
     		visitedStack.push(element.right) ;
     	}
     }

	}
	
	public static void main(String[] args){
      DepthFirstSearch depthFirstSearch = new DepthFirstSearch() ;
      Node root = new Node(10) ;
      depthFirstSearch.addNode(root, 12) ;
      depthFirstSearch.addNode(root, 11) ;
      depthFirstSearch.addNode(root, 6) ;
      depthFirstSearch.addNode(root, 8) ;
      depthFirstSearch.dfs(root) ;
	}
}