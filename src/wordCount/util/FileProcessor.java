package wordCount.util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
	FileWriter fw = null;
	BufferedWriter bw =null;
	String textLine = "";
	BufferedReader br=null;
	FileReader reader=null;	
	String inputfilename;
	String outputfilename;
	File f = null;
	
	public FileProcessor(String ifilename,String ofilename)
	{
		MyLogger.printToStdout(2,"FileProcessor Constructor is called");
		inputfilename = ifilename;
		try {
			fw = new FileWriter(ofilename);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		bw = new BufferedWriter(fw);
	
		f = new File(inputfilename);
		try {
			reader=new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		br = new BufferedReader(reader);
	}
	
/*
 * To read from file
 */
public final String ReadfromFile(){	
 	try{
			textLine = br.readLine();
		}
		catch(Exception E){
			E.printStackTrace();
			System.out.println("Exception: file operation");
			}
 	//if(textLine.trim()==)
			return textLine;
// 	else
// 		return null;
	}

public void Display(int totalnodes , int uniquenodes, int totalnumberofchar){
	try{
		bw.write("Total Number of Words :");
		bw.write("" + totalnodes);
		bw.newLine();
		bw.flush();

		bw.write("Total Number of Unique Nodes :");
		bw.write("" + uniquenodes);
		bw.newLine();
		bw.flush();
		
		bw.write("Total Number of Chars :");
		bw.write("" + totalnumberofchar);
		bw.flush();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}



}
