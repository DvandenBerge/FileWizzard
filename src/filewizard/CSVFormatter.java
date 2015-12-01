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
    public List decode(String data) {
        String[] dataParts=data.split(",");
        List<String> newEntry=new Vector();
        for(int i=0;i<dataParts.length;i++){
            newEntry.add(i,dataParts[i]);
        }
        formattedArray.add(newEntry);
        return formattedArray;
    }
    
    @Override
    public List getFormattedText(){
        return formattedArray;
    }
    
    @Override
    public List encode(String data){
        String[] dataParts=data.split(" ");
        List<String> newEntry=new Vector();
        for(int i=0;i<dataParts.length;i++){
            newEntry.add(dataParts[i]+",");
        }
        formattedArray.add(newEntry);
        return formattedArray;
    }
    
    public void clearFormattedArray(){
        formattedArray.clear();
    }
}
