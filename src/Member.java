import java.util.Objects;

public class Member {
    private final String name;
    private final int memberID;


    public Member(String name, int id) {
        this.name = name;
        this.memberID = memberID;
    }
    public void add(Member member) {
        membersList.add(member);
    }

    public String toString() {
        return String.format("""
                %s (Medlems nummer; %d)
                """, name, memberID);
    }

    @Override
    public boolean equals(Object otherMembers) {
        if (otherMembers == null || getClass() != otherMembers.getClass()) return false;
        Member otherBook = (Member) otherMembers;
        return Objects.equals(name, otherBook.name) &&
                Objects.equals(ID, otherBook.ID);
    }
}