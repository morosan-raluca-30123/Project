package isp.lab6.exercise1;


public class Product {
        private String productId;
        private String name;
        private double price;
        private ProductCategory productCategory;

        private Order order;

        public Product(String productId, String name, double price, ProductCategory productCategory) {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.productCategory = productCategory;
        }

        public String getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public ProductCategory getProductCategory() {
            return productCategory;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "productId='" + productId + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", productCategory=" + productCategory +
                    '}';
        }
        public void buyProduct(Customer c)
        {
            System.out.println("Produsul " + this.name + " a fost cumparat de " + c.getName());
        }
}
