import ru.netology.javaqa_homework_13.AllAboutProducts.Product;

public class ProductRepository {
    private Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void removeById(int id) {
        if (this.findById(id) == null) {
            throw new NegativeIdException(
                    "Element with id: " + id + " not found"
            );
        }
        Product[] tmp = new Product[products.length - 1];
        int copyToId = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[copyToId] = product;
                copyToId++;
            }
        }
        products = tmp;
    }

    public Product[] getProducts() {
        return products;
    }
}
