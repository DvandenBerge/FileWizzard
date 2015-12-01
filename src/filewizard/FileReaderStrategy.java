package filewizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dan
 */
public interface FileReaderStrategy {
    public abstract List readFile(File inputFile);
}
