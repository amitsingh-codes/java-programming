public class Book {
    private String title;
    private int no_pages;
    private int pub_year;

    public Book(String title , int no_pages , int pub_year){
        this.title = title;
        this.no_pages = no_pages;
        this.pub_year = pub_year;
    }

    public String getname(){
        return this.title;
    }

    public String toString(){
        return this.title + ", " + this.no_pages + " pages" + ", " +this.pub_year; 
    }
}
