package wordCount.driver;
import wordCount.util.MyLogger;

import java.util.ArrayList;

import wordCount.treesForStrings.TreeInfo;
import wordCount.util.FileProcessor;
import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.PopulateTreeVisitorInterface;
import wordCount.visitors.WordCountVisitor;
import wordCount.visitors.wordCountVisitorInterface;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			MyLogger d  = MyLogger.getInstance();
     		if(args.length != 4) {
 				System.err.println("Less than Required length input, please enter three parameters for logger level,input file,output file\n");
 				System.exit(1);
 			}
 			if(Integer.parseInt(args[2])>3 ||Integer.parseInt(args[2])<0)
 			{
 				System.err.println("Invalid Value");
 				System.exit(1);
 			}
 			d.set(Integer.parseInt(args[2]),args[1]);
	     	
			int N=Integer.parseInt(args[3]);
			
			String s = "";
			long startTime = System.currentTimeMillis();
			ArrayList<Integer> l = new ArrayList<Integer>();
			
			String str = "";
		
			StringBuilder sb =  new StringBuilder();
			
			
			
			for(int i=0;i<N;i++){
				FileProcessor fp = new FileProcessor(args[0], args[1]);
				TreeInfo tst = new TreeInfo();
				PopulateTreeVisitorInterface ptv = new PopulateTreeVisitor(fp);
				tst.accept(ptv);
				wordCountVisitorInterface wcv = new WordCountVisitor(fp);
				tst.accept(wcv);
			}
			
			long endTime   = System.currentTimeMillis();
			long totalTime = (endTime- startTime)/1000;
			System.out.println("Total Time Insertion : " + totalTime);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
			
	}
}
