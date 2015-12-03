package filewizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dan
 */
public class FileWizzard {

    private FileReaderStrategy frs;
    private FileWriterStrategy fws;
    //Can be a readable/writable file. Not really anything else
    private File inputFile;

    public FileReaderStrategy getFrs() {
        return frs;
    }
    public void setFrs(FileReaderStrategy frs) {
        this.frs = frs;
    }

    public FileWriterStrategy getFws() {
        return fws;
    }

    public void setFws(FileWriterStrategy fws) {
        this.fws = fws;
    }

    
    
    public File getInputFile() {
        return inputFile;
    }
    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }
    
    /**
     * outputs a decoded file 
     * to accomplish other output formats, change the body
     * maybe add another strategy object??
     */
    public void readFile(){
        List entries=frs.readFile(inputFile);
        for(int i=0;i<entries.size();i++){
            List entry=(List)entries.get(i);
            for(Object l:entry){
                l=(String)l;
                System.out.print(l+" ");
            }
            //carriage return because reasons
            System.out.println("");
        }
    }
    
    public void writeFile(){
        fws.writeToFile(inputFile);
    }
    
    public static void main(String[] args) {
        
          FileWizzard fw = new FileWizzard();
          File readFile=new File("C:" + File.separatorChar + "temp" + File.separatorChar + "garageTotals.txt");
          FileReaderStrategy frs=new TextFileReader(new CSVFormatter());        
          fw.setFrs(frs);
          fw.setInputFile(readFile);        
          fw.readFile();
          FileWriterStrategy fws=new TextFileWriter(new CSVFormatter());
          fw.setFws(fws);
          fw.writeFile();
    }
    
}
