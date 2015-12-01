package filewizard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author dvandenberge
 */
public class TextFileWriter implements FileWriterStrategy{

    private TextFormatter formatter;
    
    public TextFileWriter(TextFormatter tf){
        this.formatter=tf;
    }
    
    @Override
    public void writeToFile(File f) {
        try{
            File in=new File("C:" + File.separatorChar + "temp" + File.separatorChar + "output.txt","UTF=8");
            PrintWriter writer = new PrintWriter(in);
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line="";
            while(reader.readLine()!=null){
                writer.print(formatter.encode(line));
                line=reader.readLine();
            }
            
        }catch(IOException e){
            System.out.println("Cannot write that file");
        }
    }
    
}
