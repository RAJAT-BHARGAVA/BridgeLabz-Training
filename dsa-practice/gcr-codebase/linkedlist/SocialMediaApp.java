import java.util.ArrayList;

// Node representing a user
class UserNode {
    int userId;
    String name;
    int age;
    ArrayList<Integer> friends;   // list of friend IDs
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

// Singly Linked List to manage users
class SocialMediaList {
    private UserNode head;

    // Add new user
    public void addUser(int id, String name, int age) {
        UserNode newNode = new UserNode(id, name, age);
        if (head == null) {
            head = newNode;
            return;
        }
        UserNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add friend connection
    public void addFriend(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        if (!user1.friends.contains(id2)) {
            user1.friends.add(id2);
            user2.friends.add(id1);
            System.out.println("Friend connection added.");
        } else {
            System.out.println("Users are already friends.");
        }
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        user1.friends.remove(Integer.valueOf(id2));
        user2.friends.remove(Integer.valueOf(id1));
        System.out.println("Friend connection removed.");
    }

    // Find mutual friends
    public void findMutualFriends(int id1, int id2) {
        UserNode user1 = searchById(id1);
        UserNode user2 = searchById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Mutual Friends: ");
        boolean found = false;

        for (int f : user1.friends) {
            if (user2.friends.contains(f)) {
                System.out.print(f + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = searchById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ": " + user.friends);
    }

    // Search by User ID
    public UserNode searchById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Search by Name
    public void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("User not found.");
        }
    }

    // Count friends for each user
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends.");
            temp = temp.next;
        }
    }

    private void displayUser(UserNode user) {
        System.out.println("ID: " + user.userId +
                ", Name: " + user.name +
                ", Age: " + user.age +
                ", Friends: " + user.friends);
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {

        SocialMediaList sm = new SocialMediaList();

        sm.addUser(1, "Rajat", 21);
        sm.addUser(2, "Amit", 22);
        sm.addUser(3, "Neha", 20);
        sm.addUser(4, "Priya", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        sm.displayFriends(1);

        sm.findMutualFriends(1, 2);

        sm.removeFriend(1, 3);

        sm.displayFriends(1);

        sm.searchByName("Neha");

        sm.countFriends();
    }
}
