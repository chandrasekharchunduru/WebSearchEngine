
import java.io.*;
import java.net.URL;
import java.util.ArrayList;



import org.jsoup.*;

public class HTMLTextConverter {

//This method converts HTML Files into text documents.
	public static void convertHtmlToText()
			throws IOException, FileNotFoundException, NullPointerException {
		org.jsoup.nodes.Document doc = null;
		BufferedWriter out = null;

		try {
			File dir = new File("F:\\Advanced Computing Concepts\\SearchEngine\\W3C Web Pages");
			File[] fileArray = dir.listFiles();
			for (File file : fileArray) {
				doc = Jsoup.parse(file, "UTF-8");
				String str = file.getName().substring(0, file.getName().lastIndexOf('.'));
				out = new BufferedWriter(
						new FileWriter("F:\\Advanced Computing Concepts\\SearchEngine\\src\\ConvertedTextFiles\\"
								+ str  + ".txt"));
				out.write(doc.text());
				out.close();
				//System.out.println("File " + file.getName() + " converted into " + file.getName()+ ".txt successfully");

			}

			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
