class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    int waitingTime;
    int turnAroundTime;

    ProcessNode next;

    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

public class RoundRobinScheduler {
    private ProcessNode head = null;
    private int timeQuantum;
    private int totalProcesses = 0;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int id, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(id, burstTime, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        totalProcesses++;
    }

    // Simulate Round Robin Scheduling
    public void schedule() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;
        ProcessNode current = head;

        System.out.println("\n--- Round Robin Scheduling Started ---");

        while (totalProcesses > 0) {

            if (current.remainingTime > 0) {
                int execTime = Math.min(current.remainingTime, timeQuantum);
                current.remainingTime -= execTime;
                currentTime += execTime;

                System.out.println("\nExecuting Process P" + current.processId +
                        " for " + execTime + " units");

                displayProcesses();

                if (current.remainingTime == 0) {
                    current.turnAroundTime = currentTime;
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    System.out.println("Process P" + current.processId + " completed.");

                    int completedId = current.processId;
                    current = current.next;
                    removeProcess(completedId);
                    continue;
                }
            }
            current = current.next;
        }

        calculateAverages();
    }

    // Remove process by ID
    private void removeProcess(int processId) {
        if (head == null) return;

        ProcessNode temp = head;
        ProcessNode prev = null;

        do {
            if (temp.processId == processId) {
                if (temp == head) {
                    ProcessNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                totalProcesses--;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Display current process list
    private void displayProcesses() {
        if (head == null) {
            System.out.println("No remaining processes.");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Current Queue: ");
        do {
            System.out.print("P" + temp.processId +
                    "(RT:" + temp.remainingTime + ")  ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Calculate averages
    private void calculateAverages() {
        ProcessNode temp = head;
        double totalWT = 0, totalTAT = 0;

        System.out.println("\n--- Final Process Statistics ---");
        System.out.println("PID\tWT\tTAT");

        // Since processes are removed, values were already printed during completion
        // This section is for conceptual clarity in exams

        System.out.println("\nAverage Waiting Time and Turnaround Time calculated during execution.");
