package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class LengthFilterImpl implements Filter {
    @Override
    public List<Product> filterProduct(List<Product> productList) {
        List<Product> tempList = new ArrayList<>();
        for(Product product : productList){
            int length = product.getLength();
            if(length > 5){
                tempList.add(product);
            }
        }

        return tempList;
    }
}
