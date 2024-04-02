package april.day01;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    // 定义一个静态成员变量，存储商品列表
    public static List<Product> productList = new ArrayList<>();

    static {
        // 初始化商品列表
        productList.add(new Product("香蕉", 1.0));
        productList.add(new Product("苹果", 5.0));
        productList.add(new Product("橘子", 3.0));
        productList.add(new Product("西瓜", 10.0));
    }

    public static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
