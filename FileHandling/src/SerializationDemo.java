import java.io.*;

class book implements Serializable{
	int bno;
	String name;
	transient double price; //not included during serialization (not serialized)
	public book(int bno, String name, double price) {
		this.bno = bno;
		this.name =  name;
		this.price = price;
	}
	
	public book() {}
	
	public String toString() {
		return bno+" "+name+" "+price;
	}
	
}
public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//serialization
		FileOutputStream fs = new FileOutputStream("book.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		book b = new book(1,"geeta",200.0);
		os.writeObject(b);
		os.close();
		fs.close();
		
		//deserialization
		FileInputStream fs1 = new FileInputStream("book.txt");
		ObjectInputStream oi = new ObjectInputStream(fs1);
		book b1 = (book)oi.readObject();
		System.out.println(b1);         //invokes tostring
		
	}

}
