import java.util.* ;

class Node{
	String dir_name;
	List<Node> dir_nodes ;
	Node(String dir){
		dir_name = dir ;
		dir_nodes = new ArrayList<>();
	}
}


class NotBinarayTreeImp{

  public static void addNode(Node root, String parent, String dir_name){ 
    if(parent.equals(root.dir_name)){
    	  for(Node i :  root.dir_nodes){
    	  	if(dir_name.equals(i.dir_name))
    	  		return ;
    	  }
          root.dir_nodes.add(new Node(dir_name)) ;
        return;
    }

    List<Node> nodes = root.dir_nodes ;
    for(Node no : nodes){
    	addNode(no,parent,dir_name);
    }
   }

   public static void printTree(Node root, int space){

    if(root.dir_nodes.size() == 0){
    	for(int i = 0 ; i <= space ; i++)
    	 System.out.print("  ");
    	System.out.println("-- "+root.dir_name) ;
    	return ;
    }
    for(int i = 0 ; i <= space ; i++)
    	System.out.print("  ");
     System.out.println("-- "+root.dir_name) ;
    for(Node o : root.dir_nodes){
    	printTree(o, space + 1) ;
    }

   
   }

  public static void main(String[] args){
  	List<String> file_path = new ArrayList<>() ;
  	file_path.add("/custom/path/a.js") ;
  	file_path.add("/custom/path/b.js") ;
  	file_path.add("/custom/assets/image.jpg") ;
  	file_path.add("/custom/assets/image.png") ;
  	file_path.add("/custom/index.html") ;
    
    Node root = new Node("/") ;
    

  	for(String dir : file_path){
  		String parent = "/" ;
  		String[] names = dir.split("/") ;
  		for(String child : names){
  			if(child == "") continue ;
  			addNode(root, parent, child) ;
  			parent = child ;
  		}
  	}
  	printTree(root,0) ;
  }
}