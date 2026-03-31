package JavaStreams;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
class Member {
    private String name;
    private LocalDate expiryDate;
    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
    public String getName() {
        return name;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    @Override
    public String toString() {
        return name + " - Expiry: " + expiryDate;
    }
}

public class GymMembership {
	public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Anuj", LocalDate.now().plusDays(10)),
                new Member("Shaurya", LocalDate.now().plusDays(45)),
                new Member("Subhash", LocalDate.now().plusDays(5)),
                new Member("Sandeep", LocalDate.now().plusDays(60)),
                new Member("Govind", LocalDate.now().plusDays(25)),
                new Member("Vidushi", LocalDate.now().minusDays(2)) // already expired
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()
                .filter(member ->
                        !member.getExpiryDate().isBefore(today) &&
                        !member.getExpiryDate().isAfter(next30Days)
                )
                .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
