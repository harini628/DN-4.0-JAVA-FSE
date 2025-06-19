public class Search {
  
    public static Product linearSearch(Product[] products, int searchId) {
        for (Product p : products) {
            if (p.productId == searchId) {
                return p;
            }
        }
        return null; 
    }

    public static Product binarySearch(Product[] products, int searchId) {
        int l = 0;
        int r = products.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (products[mid].productId == searchId) {
                return products[mid];
            } 
            else if (products[mid].productId < searchId) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }
        return null; 
      
    }

  
}
