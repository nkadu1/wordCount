package wordCount.visitors;

import wordCount.treesForStrings.TreeInfo;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;

public class PopulateTreeVisitor implements VisitorInterface,PopulateTreeVisitorInterface  {
	String word=null;
	FileProcessor fp=null;
	
	/*
	 * Constructor
	 */
	public PopulateTreeVisitor(FileProcessor fp){
		MyLogger.printToStdout(2,"PopulateTreeVisitor Constructor is called");
		this.fp = fp;
	}
	
	/*
	 * Vsit Method of Populate Visitor
	 * @see wordCount.visitors.VisitorInterface#visit(wordCount.treesForStrings.TreeInfo)
	 */
	public void visit(TreeInfo tst)	{
		MyLogger.printToStdout(1,"Visit Method is called");
		while((word = this.fp.ReadfromFile())!= null){
			tst.insert(word);
		}
	}
}