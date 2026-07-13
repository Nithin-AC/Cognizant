import java.util.Arrays;
import java.util.Comparator;
class Product {
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
    }
}
public class EcommerceSearch {
    // Linear Search by productId
    public static Product linearSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return products[i];
            }
        }
        return null;
    }
    // Binary Search by productId
    public static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            } 
            else if (products[mid].productId < id) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(103, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Fashion"),
            new Product(105, "Phone", "Electronics"),
            new Product(102, "Watch", "Accessories"),
            new Product(104, "Bag", "Fashion")
        };

        int searchId = 104;

        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, searchId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        // Sorting array before binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, searchId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }
    }
}