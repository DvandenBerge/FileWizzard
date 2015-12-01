package filewizard;

import java.io.File;
import java.util.List;

/**
 *
 * @author dvandenberge
 */
public interface FileWriterStrategy {
    public abstract void writeToFile(File f);
}
