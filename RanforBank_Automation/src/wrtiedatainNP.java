import java.io.FileWriter;
import java.io.IOException;

public class wrtiedatainNP {

	public static void main(String[] args) throws IOException {

		FileWriter np = new FileWriter("C:/Users/prave/OneDrive/Desktop/Hello.txt", true);
		np.write("hi");

	}

}
