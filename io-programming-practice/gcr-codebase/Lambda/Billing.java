import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice created for transaction " + transactionId;
    }
}

public class Billing {

    public static void main(String[] args) {

        List<String> transactions =
                Arrays.asList("TXN101", "TXN102", "TXN103");

        List<Invoice> invoices =
                transactions.stream()
                            .map(Invoice::new)
                            .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}