
package domain;

import java.io.Serializable;

/**
 *
 * @author brixa
 */
public class Note implements Serializable {
    
    private String title;
    private String contents;

    public Note() {
        title = "";
        contents = "";
    }

    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
    
    
    
}
