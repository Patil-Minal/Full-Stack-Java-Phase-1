import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Course\\FSD Java\\Day01\\FileHandling\\src\\FileInputStreamDemo.java");
		
		int n;
		while((n=fr.read())!= -1) {         //-1 indicated end of file
			System.out.println((char)n);
		}
		fr.close();
	}

}
