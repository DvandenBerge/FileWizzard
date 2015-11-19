package filewizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dan
 */
public class FileWizard {

    //Can be either a reader or writer
    private FileReaderStrategy frs;
    //Can be a readable/writable file. Not really anything else
    private File inputFile;

    public FileReaderStrategy getFrs() {
        return frs;
    }
    public void setFrs(FileReaderStrategy frs) {
        this.frs = frs;
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
        ArrayList<List> entries=frs.readFile(inputFile);
        for(int i=0;i<entries.size();i++){
            List entry=entries.get(i);
            for(Object l:entry){
                l=(String)l;
                System.out.print(l+" ");
            }
            //carriage return because reasons
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        
        FileWizard fw = new FileWizard();
        File readFile=new File("C:" + File.separatorChar + "temp" + File.separatorChar + "garageTotals.txt");
        //Kinda like the decorator pattern?
        FileReaderStrategy frs=new TextFileReader(new CSVFormatter());
        
        fw.setFrs(frs);
        fw.setInputFile(readFile);
        
        fw.readFile();
    }
    
}
