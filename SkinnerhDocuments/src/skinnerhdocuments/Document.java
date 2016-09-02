
package skinnerhdocuments;

public class Document {
    
    private String title;
    private String author;
    private String body;
    private int version;
    
    public Document(String title, String author) {
        this.title = title;
        this.author = author;
        this.version = 0;
    }
    
    public Document(String title, String author, String body) {
        this(title, author);
        this.body = body;
        this.version = 1;
    }
    
    public void setTitle(String title) {
        this.title = title;
        this.version++;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setBody(String body) {
        this.body = body;
        this.version++;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getBody(){
        return this.body;
    }
    
    public int getVersion(){
        return this.version;
    }
}

