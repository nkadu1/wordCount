package wordCount.treesForStrings;
import wordCount.util.MyLogger;
import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.PopulateTreeVisitorInterface;
import wordCount.visitors.WordCountVisitor;
import wordCount.visitors.wordCountVisitorInterface;

/**
 * A binary search tree on Strings.
 */
public class TreeInfo {
	
	TreeCell<String> root; // The root of the BST
   /**
    * Constructor.
    */
   public TreeInfo () {
      root = null;
   }

   //Accept Method of TreeInfo
   public void accept(PopulateTreeVisitorInterface visitor)  {
	   MyLogger.printToStdout(1,"Accept Method is called");
	   ((PopulateTreeVisitor) visitor).visit(this);
   }
   
   //Accept Method of TreeInfo
   public void accept(wordCountVisitorInterface visitor)  {
	   MyLogger.printToStdout(1,"Accept Method is called");
	   ((WordCountVisitor) visitor).visit(this);
   }
   
   /**
    * Insert. Nothing happens if the string is already in the BST.
    */
   public final void insert(String string) {
      root = insert(string, root);
   }

   public final  TreeCell<String> insert(String string, TreeCell<String> node) {
      if (node == null) 
    	  return new TreeCell<String>(string);
      int compare = string.compareTo(node.datum);
      
     if (compare < 0) {
        	  node.left = insert(string, node.left);
	 }
      
    else if (compare > 0) 
    	  node.right = insert(string, node.right);
    else if (compare == 0){
    	  node.wordcount++;}
    return node;
   }

   /*
    * To count total number of words
    */
	public final  int countNodes() {
	    return countNodes(root);
	}
	
	public final  int countNodes(TreeCell<String> node )	{
	    if (node == null)
	        return 0;
	    else   {
	    	return   node.wordcount + countNodes(node.left) + countNodes(node.right);
	    }
	}

	/*
	 * To count total number of Chars
	 */
	public int countNumberOfChar(){
	    return countNumberOfChar(root);
	}
	
	private int countNumberOfChar(TreeCell<String> node ){
	    if (node == null)
	        return 0;
	    else {
	    	return  (node.datum.length() * node.wordcount)  + countNumberOfChar(node.left) + countNumberOfChar(node.right);
	    }
	}
	

	/*
	 * To count total number of CountUniqueNodes
	 */
	public final int countUniqueNodes(){
	    return countUniqueNodes(root);
	}
	
	public  final int countUniqueNodes(TreeCell<String> node ){
		if (node == null)
	        return 0;
	    else{
	    	return   1 + countUniqueNodes(node.left) + countUniqueNodes(node.right);
	    }
	}
}


/**
 * TreeCell
 */
class TreeCell<T> {
	T datum;
	int wordcount=0;
	TreeCell<T> left, right;
   /**
    * Constructor
    */
   public TreeCell(T datum) {
	  wordcount  = 1;
      this.datum = datum;
      left = null;
      right = null;
   	}
}
