package filewizard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Dan
 */
public class TextFileReader implements FileReaderStrategy{
    
    private TextFormatter formatter;
    
    public TextFileReader(TextFormatter tf){
        this.formatter=tf;
    }
    
    @Override
    public ArrayList<List> readFile(File inputFile) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line=reader.readLine();
            while(line!=null){
                formatter.decode(line);
                line=reader.readLine();
            }
        }catch(IOException e){
            System.out.println("File cannot be read/opened!");
        }
        return formatter.getFormattedText();
    }
    
    @Override
    public String toString() {
        return "This class is used to read plain text files";
    }
}
