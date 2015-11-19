package filewizard;

import java.io.File;

/**
 *
 * @author dvandenberge
 */
public interface FileWriterStrategy {
    public abstract String writeToFile(File f);
}
