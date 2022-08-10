public class Book {
    //attributes
    String title;
    int yearOfPublishing;
    long iSBNNumber;
    String authorName;


    public static void main(String[] args) {
        Book obj = new Book();
        System.out.println("obj.title = " + obj.title);
        System.out.println("obj.authorName = " + obj.authorName);
        System.out.println("obj.yearOfPublishing = " + obj.yearOfPublishing);
        System.out.println("obj.iSBNNumber = " + obj.iSBNNumber);
        
        obj.title="Complete Reference 12th Edition";
        obj.authorName ="Herbert Schildth ";
        obj.yearOfPublishing = 2021;
        obj.iSBNNumber = 1234567890123L;


        System.out.println("obj.authorName = " + obj.authorName);
        System.out.println("obj.yearOfPublishing = " + obj.yearOfPublishing);
        System.out.println("obj.iSBNNumber = " + obj.iSBNNumber);
        System.out.println("obj.title = " + obj.title);
    }
    
}
