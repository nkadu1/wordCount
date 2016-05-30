package wordCount.visitors;

import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;
import wordCount.treesForStrings.TreeInfo;

public class WordCountVisitor implements VisitorInterface,wordCountVisitorInterface{
	
	FileProcessor fp = null;
	/*
	 * Constructor
	 */
	public  WordCountVisitor(FileProcessor fp) {
		// TODO Auto-generated constructor stub
		MyLogger.printToStdout(2,"WordCountVisitor Constructor is called");
		this.fp = fp;

	}
	//Visit Method of WordCountVisitor
	public void visit(TreeInfo tf){
		MyLogger.printToStdout(1,"Visit Method is called");
		fp.Display(tf.countNodes(), tf.countUniqueNodes() , tf.countNumberOfChar());
	}
}