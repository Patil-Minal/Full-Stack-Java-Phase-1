import java.io.*;


public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fs = new FileOutputStream("file.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fs);
		String s = "Java is OO programming langauge!!";
		bos.write(s.getBytes());
		System.out.println("File created");
		bos.close();
		fs.close();
		
	}

}
