package Day7;
public class Problem11 {
    String title;
    String author;

   Problem11(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
class Member {
    String name;
    Member(String name) {
        this.name = name;
    }
}
class Library {

    Problem11 book;
    Member member;

    Library(Problem11 book, Member member) {
        this.book = book;
        this.member = member;
    }
    void issueBook() {
        System.out.println(member.name + " borrowed \"" + book.title + "\" written by " + book.author);
    }

    public static void main(String[] args) {

        Problem11 b = new Problem11("Java Programming", "James Gosling");

        Member m = new Member("Rahul");

        Library l = new Library(b, m);

        l.issueBook();
    }
}

