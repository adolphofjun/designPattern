package structural.filter;

import java.util.List;

public interface Filter {

    List<Product> filterProduct(List<Product> productList);
}
