package filewizard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dvandenberge
 */
public interface TextFormatter {
    //Writing
    public ArrayList decode(String data);
    public ArrayList getFormattedText();
    
    public String encode(String data);
}
