package site;
import java.time.LocalDateTime; // import the LocalDate class
import java.time.format.DateTimeFormatter;

/**
 * 
 */
public class Comment {
    private int idUser;
    private LocalDateTime date;
    private String content;


    /**
     * Default constructor
     */
    public Comment(String text) {
    	this.content = text;
    	// set date of comment
    	LocalDateTime now = LocalDateTime.now();
    	this.date = now;
    }

    public String getFormattedDate() {
    	// define date format
    	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
    	return this.date.format(format);  
    
    }

}