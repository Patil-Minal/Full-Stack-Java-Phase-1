
import java.io.*;

public class FileInputStreamDemo  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("abc.txt");
		BufferedInputStream bfs = new BufferedInputStream(fs);
		int size = bfs.available(); //returns size of file
		byte[] buffer = new byte[size];
		bfs.read(buffer);
		String s = new String(buffer); //convert byte to string
		System.out.println(s);
		bfs.close();
		fs.close();
	}

}
