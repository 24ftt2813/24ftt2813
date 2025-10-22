public class ProductRating {

    public static void main(String[] args) {
        // 1. Create a two-dimensional array with Integer datatype
        // The array stores ratings for 4 customers across 3 criteria (Product, Packaging, Delivery).
        // Rows represent customers, columns represent criteria.
        int[][] ratings = {
            // Product, Packaging, Delivery
            {4, 5, 4}, // Customer 1
            {3, 5, 3}, // Customer 2
            {4, 5, 3}, // Customer 3
            {1, 2, 1}  // Customer 4
        };

        // Get the number of customers (rows) and criteria (columns)
        int numCustomers = ratings.length;
        int numCriteria = ratings[0].length;

        // 2. Display the header for the criterion averages
        // Using tabs for alignment as suggested in the hints.
        System.out.println("Rating\t\tProduct\tPackage\tDelivery");

        // 3. Display the average of each criterion (column averages)
        System.out.print("Average\t\t"); // Label for the average row

        // Iterate through each criterion (column)
        for (int j = 0; j < numCriteria; j++) {
            double sumOfRatingsForCriterion = 0;
            // Sum ratings for the current criterion across all customers
            for (int i = 0; i < numCustomers; i++) {
                sumOfRatingsForCriterion += ratings[i][j];
            }
            // Calculate the average for the current criterion
            double averageCriterion = sumOfRatingsForCriterion / numCustomers;
            // Print the average, formatted to two decimal places, followed by a tab.
            // The hint specifies "%.2f without %n" and using tab for alignment.
            System.out.printf("%.2f\t", averageCriterion);
        }
        System.out.println(); // Move to the next line after printing all criterion averages

        // 4. Display the average of each customer (row averages)
        // Iterate through each customer (row)
        for (int i = 0; i < numCustomers; i++) {
            double sumOfRatingsForCustomer = 0;
            // Sum ratings for the current customer across all criteria
            for (int j = 0; j < numCriteria; j++) {
                sumOfRatingsForCustomer += ratings[i][j];
            }
            // Calculate the average for the current customer
            double averageCustomer = sumOfRatingsForCustomer / numCriteria;
            // Print the customer's average, formatted to two decimal places, followed by a new line.
            System.out.printf("Customer %d provide the average rating %.2f%n", (i + 1), averageCustomer);
        }
    }
}

    

