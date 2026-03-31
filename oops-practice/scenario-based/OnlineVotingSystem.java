import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class DuplicateVoteException extends Exception {
    DuplicateVoteException(String msg) {
        super(msg);
    }
}

// service interface
interface ElectionService {
    void registerVoter(Voter v);
    void addCandidate(Candidate c);
    void castVote(int voterId, int candidateId) throws DuplicateVoteException;
    void showResults();
}

// voter class
class Voter {
    int voterId;
    String name;
    boolean hasVoted = false;

    Voter(int id, String name) {
        voterId = id;
        this.name = name;
    }
}

// candidate class
class Candidate {
    int candidateId;
    String name;
    int votes = 0;

    Candidate(int id, String name) {
        candidateId = id;
        this.name = name;
    }
}

// vote class
class Vote {
    Voter voter;
    Candidate candidate;

    Vote(Voter v, Candidate c) {
        voter = v;
        candidate = c;
    }
}

// main system
public class OnlineVotingSystem implements ElectionService {

    ArrayList<Voter> voters = new ArrayList<>();
    ArrayList<Candidate> candidates = new ArrayList<>();
    ArrayList<Vote> votes = new ArrayList<>();

    public void registerVoter(Voter v) {
        voters.add(v);
        System.out.println("Voter registered");
    }

    public void addCandidate(Candidate c) {
        candidates.add(c);
        System.out.println("Candidate added");
    }

    public void castVote(int voterId, int candidateId)
            throws DuplicateVoteException {

        Voter voter = null;
        Candidate candidate = null;

        for (Voter v : voters)
            if (v.voterId == voterId)
                voter = v;

        for (Candidate c : candidates)
            if (c.candidateId == candidateId)
                candidate = c;

        if (voter == null || candidate == null) {
            System.out.println("Invalid voter or candidate");
            return;
        }

        if (voter.hasVoted) {
            throw new DuplicateVoteException("Vote already cast");
        }

        voter.hasVoted = true;
        candidate.votes++;
        votes.add(new Vote(voter, candidate));

        System.out.println("Vote cast successfully");
    }

    public void showResults() {
        System.out.println("\nElection Results:");
        for (Candidate c : candidates) {
            System.out.println(c.name + " : " + c.votes + " votes");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OnlineVotingSystem ovs = new OnlineVotingSystem();

        int choice;

        do {
            System.out.println("\n1 Register Voter");
            System.out.println("2 Add Candidate");
            System.out.println("3 Cast Vote");
            System.out.println("4 Show Results");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Voter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    ovs.registerVoter(new Voter(id, name));
                }

                else if (choice == 2) {
                    System.out.print("Candidate id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    ovs.addCandidate(new Candidate(id, name));
                }

                else if (choice == 3) {
                    System.out.print("Voter id: ");
                    int vid = sc.nextInt();
                    System.out.print("Candidate id: ");
                    int cid = sc.nextInt();

                    ovs.castVote(vid, cid);
                }

                else if (choice == 4) {
                    ovs.showResults();
                }

            } catch (DuplicateVoteException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}
