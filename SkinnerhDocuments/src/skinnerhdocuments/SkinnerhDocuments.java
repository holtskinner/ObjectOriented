
package skinnerhdocuments;

/**
 *Holt Skinner 
 * Challenge 3 - Documents
 * Skinnerh
 */
public class SkinnerhDocuments {

    public static void main(String[] args) {
        
        Document document1 = new Document("Another Life", "Sally Smith");
        
        document1.setBody("The grass is always greener on the other side.");
        
        Document document2 = new Document("Final Word", "Karen Jones", "We should plan for the worst and hope for the best.");
        
        document2.setTitle("Final Words");
        
        System.out.println("document1:\n"
                        + "title: " + document1.getTitle() + "\n"
                        + "author: " + document1.getAuthor()+ "\n"
                        + "body: " + document1.getBody() + "\n"
                        + "version: " + document1.getVersion() + "\n\n");
        
        System.out.println("document2:\n"
                        + "title: " + document2.getTitle() + "\n"
                        + "author: " + document2.getAuthor()+ "\n"
                        + "body: " + document2.getBody() + "\n"
                        + "version: " + document2.getVersion() + "\n\n");
        
    }
    
}
