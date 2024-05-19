public class Main {
    public static void main(String[] args) {
        Book [] books = new Book[6];
        books[0] = new ProgrammingBook(001,"Thinking in Java",400,"Bruce Eckel","Java","Spring");
        books[1] = new ProgrammingBook(002,"Fluent Python", 500,"Lucian Ramalho","Python","Django");
        books[2] = new ProgrammingBook(003,"Effective Java", 550,"Joshua Bloch","Java","Wicket");
        books[3] = new FictionBook(004,"Harry Potter",2000,"J.K Rolling","Viễn tưởng 1");
        books[4] = new FictionBook(005,"Percy Jackson: The lighting thief",3000,"Rick Riodan","Viễn tưởng 2");
        books[5] = new FictionBook(006,"Dune",3500,"Frank Herbert","Viễn tưởng 1");

        double sum = 0 ;
        for (Book book : books){
            sum += book.getAmount();
        }
        System.out.println("Sum: "+sum);

        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook){
                ProgrammingBook pb = (ProgrammingBook) book;
                String languge = pb.getLanguge();
                if (languge.equals("Java")){
                    count++;
                }
            }
        }
        System.out.println("Count: "+count);

        int countCategory = 0;
        for (Book book : books) {
            if(book instanceof FictionBook){
                FictionBook fb = (FictionBook) book;
                String category = fb.getCategory();
                if( category.equals("Viễn tưởng 1")){
                    countCategory++;
                }
            }
        }

        int countFictionPrice = 0;
        for (Book book : books) {
            if (book instanceof FictionBook && book.getPrice()< 3200) {
                countFictionPrice++;
            }
        }
        System.out.println("Count FB < 3200: "+ countFictionPrice);
        
    }
}