import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("file2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s = "Today is cloudy day";
		bw.write(s);
		System.out.println("File created");
		bw.close();
		fw.close();
		
	}

}
