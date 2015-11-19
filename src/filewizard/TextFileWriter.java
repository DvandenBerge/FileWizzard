package filewizard;

import java.io.File;

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
    public String writeToFile(File f) {
        return "";
    }
    
}
