package filewizard;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author dvandenberge
 */
public class CSVFormatter implements TextFormatter{

    private ArrayList<List> formattedArray;
    
    public CSVFormatter(){
        this.formattedArray=new ArrayList();
    }
    
    @Override
    public ArrayList decode(String data) {
        String[] dataParts=data.split(",");
        List<String> newEntry=new Vector();
        for(int i=0;i<dataParts.length;i++){
            newEntry.add(i,dataParts[i]);
        }
        formattedArray.add(newEntry);
        return formattedArray;
    }
    
    @Override
    public ArrayList getFormattedText(){
        return formattedArray;
    }
    
    public String encode(String data){
        String[] dataParts=data.split(" ");
        String line="";
        for(int i=0;i<dataParts.length;i++){
            line+=dataParts[i]+",";
        }
        return line;
    }
}
