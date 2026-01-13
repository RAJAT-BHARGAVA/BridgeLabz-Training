import java.util.Scanner;

// vehicle node for circular linked list
class Vehicle {
    String number;
    Vehicle next;

    Vehicle(String number) {
        this.number = number;
        next = null;
    }
}

// circular linked list (roundabout)
class Roundabout {
    Vehicle head = null;

    void addVehicle(String number) {
        Vehicle v = new Vehicle(number);

        if (head == null) {
            head = v;
            v.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = v;
            v.next = head;
        }
        System.out.println("Vehicle entered roundabout: " + number);
    }

    void removeVehicle(String number) {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle curr = head;
        Vehicle prev = null;

        do {
            if (curr.number.equals(number)) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        Vehicle last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }

                System.out.println("Vehicle exited roundabout: " + number);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    void showRoundabout() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}

// queue for waiting vehicles
class VehicleQueue {
    String[] queue;
    int front = 0, rear = -1, size = 0;

    VehicleQueue(int capacity) {
        queue = new String[capacity];
    }

    void enqueue(String number) {
        if (size == queue.length) {
            System.out.println("Queue overflow! Vehicle waiting area full");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = number;
        size++;
        System.out.println("Vehicle added to waiting queue: " + number);
    }

    String dequeue() {
        if (size == 0) {
            System.out.println("Queue underflow! No vehicles waiting");
            return null;
        }
        String num = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return num;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void showQueue() {
        if (size == 0) {
            System.out.println("Waiting queue empty");
            return;
        }

        System.out.print("Waiting Queue: ");
        int i = front;
        for (int c = 0; c < size; c++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % queue.length;
        }
        System.out.println();
    }
}

// main class
public class TrafficManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(5);

        int choice;

        do {
            System.out.println("\n1 Vehicle Arrives");
            System.out.println("2 Allow Vehicle Into Roundabout");
            System.out.println("3 Vehicle Exits Roundabout");
            System.out.println("4 Show Roundabout");
            System.out.println("5 Show Waiting Queue");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter vehicle number: ");
                queue.enqueue(sc.nextLine());
            }

            else if (choice == 2) {
                String v = queue.dequeue();
                if (v != null) {
                    roundabout.addVehicle(v);
                }
            }

            else if (choice == 3) {
                System.out.print("Enter vehicle number: ");
                roundabout.removeVehicle(sc.nextLine());
            }

            else if (choice == 4) {
                roundabout.showRoundabout();
            }

            else if (choice == 5) {
                queue.showQueue();
            }

        } while (choice != 0);

        sc.close();
    }
}
