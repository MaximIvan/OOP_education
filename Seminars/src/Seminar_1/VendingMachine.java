package Seminar_1;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected List<Product> locallist = new ArrayList<>();
    public List<Product> getLocallist() {
        return locallist;
    }

    private double cash;

    public VendingMachine addProduct(Product inputProduct) {
        locallist.add(inputProduct);
        inputProduct.setLoadDate(Date.valueOf(LocalDate.now()));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Product product : locallist) {
            localString.append(product.toString());
            localString.append("\n");
        }
        localString.append(cash + "\n");
        return localString.toString();
    }

    public List<Product> findProduct(String name) {
        List<Product> findProducts = new ArrayList<>();
        for (Product product : locallist) {
            if (product.getname().contains(name)) {
                findProducts.add(product);
            }
        }
        return findProducts;
    }

    public Product sellProduct(Product sailingProduct) {
        Product sellProduct = new Product();
        if (locallist.contains(sailingProduct)) {
            for (int i = 0; i < locallist.size(); i ++) {
                if (locallist.get(i) == sailingProduct) {
                    sellProduct = locallist.get(i);
                    locallist.remove(i);
                    cash += sellProduct.getCost();
                    return sellProduct;
                }
            }
        }
        return sellProduct;
    }
}
