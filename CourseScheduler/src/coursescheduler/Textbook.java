
package coursescheduler;

public class Textbook {
    private String title;
    private String publisher;
    private int edition;
    
    Textbook(){
    title = " ";
    publisher=" ";
    edition=0;
    }
    
    Textbook(String title, String publisher, int edition){
    this.title=title;
    this.publisher=publisher;
    this.edition=edition;
    }
    public String toString(){
    return getTitle() + System.lineSeparator()+ getPublisher() +System.lineSeparator()+getEdition();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the edition
     */
    public int getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(int edition) {
        this.edition = edition;
    }
    
}
