package fileSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

	public static void main(String[] args) {
		try {
			FileReader reader =new FileReader("C:\\Users\\happiness\\Desktop\\vinay_repository\\revature_India_26th_July_13Week\\"
		+"Week1(Git,Java)\\notes & images\\vinay_java_new.txt");
			BufferedReader br=new BufferedReader(reader);
			BufferedWriter bw=new BufferedWriter(new FileWriter("‪C:\\Users\\happiness\\Desktop\\check\\write.tx"));
//			int character =reader.read();
//			while(character!=-1) {
//				System.out.print((char)character);
//				character=reader.read();
//			}
			
			String line=br.readLine();
			while(line!=null) {
				System.out.println(line);
				//bw.write(line);
				line=br.readLine();
			}
			br.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
