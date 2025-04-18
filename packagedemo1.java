import bookdetails.bookdtls;

public class packagedemo1 {
    public static void main(String[] args) {
        bookdtls b1 = new bookdtls("subject-1", "author-1", 2023, "publisher-1", 1000);
        b1.show();
        bookdtls b2 = new bookdtls("subject-2", "author-2", 2023, "publisher-2", 1500);
        b2.show();

    }
}
