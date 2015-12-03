package filewizard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
            File outputFile=new File("C://temp//output.txt");
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile,false)));
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line=reader.readLine();
            while(line!=null){
                writer.write(formatter.encode(line));
                line=reader.readLine();
                formatter.clearOutputStream();
            }
            writer.close();
        }catch(IOException e){
            System.out.println("Cannot write that file");
        }
    }
    
}
