public class ProgrammingBook extends Book{
        private String language;
        private String framework;
    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String framework){
        super(bookCode, name, price, author);
        this.framework = framework;
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    @Override
    public double getAmount(){
        return getPrice() * 0.95 ;
    }
}
