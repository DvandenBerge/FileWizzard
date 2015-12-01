package filewizard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dvandenberge
 */
public interface TextFormatter {
    //Writing
    public List decode(String data);
    public List getFormattedText();
    
    public List encode(String data);
}
