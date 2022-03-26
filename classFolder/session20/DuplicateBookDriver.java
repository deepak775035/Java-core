package classFolder.session20;

import java.util.ArrayList;

class Book {

    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}

public class DuplicateBookDriver {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8));
        library.add(new Book(233, "Operating System", "Galvin", "Wiley", 6));
        library.add(new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4));
        library.add(new Book(121, "Let us C", "Yashwant Kanetkar", "Mc Graw Hill", 11));

        for (int i = 0; i < library.size(); i++) {

            Book currentBook = library.get(i);
            int count = 1;
            for (int j = i + 1; j < library.size(); j++) {
                if (currentBook.equals(library.get(j))) {
                    count++;
                    library.remove(j);
                }
            }

            if (count != 1) {
                System.out.println("No. of duplicate books =" + count);
                System.out.println(currentBook);
                library.remove(i);
            }
        }

        System.out.println("\n\nUnique Highest quantity:");
        Book highestQuantityBook = null;
        for (Book book : library) {
            if (highestQuantityBook == null || highestQuantityBook.quantity < book.quantity)
                highestQuantityBook = book;
        }
        System.out.println(highestQuantityBook);

    }
}
