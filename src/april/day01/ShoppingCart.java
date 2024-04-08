package april.day01;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车类，用于管理购物车中的商品。
 */
public class ShoppingCart {
    // 购物车列表，存储商品及其数量
    public static List<ProductWithQuantity> shoppingCartList = new ArrayList<>();

    /**
     * 用于表示购物车中的商品及其数量。
     */
    public static class ProductWithQuantity {

        ProductManager.Product product; // 商品对象
        double quantity; // 商品数量

        /**
         * 构造函数，初始化购物车中的商品及其数量。
         *
         * @param product  商品对象。
         * @param quantity 商品数量。
         */
        public ProductWithQuantity(ProductManager.Product product, double quantity) {
            this.product = product;
            this.quantity = quantity;
        }

    }

    /**
     * 向购物车中添加商品。
     *
     * @param product  需要添加的商品。
     * @param quantity 添加的商品数量。
     */
    public static void addItem(ProductManager.Product product, double quantity) {
        shoppingCartList.add(new ProductWithQuantity(product, quantity));
    }

    /**
     * 从购物车中移除指定位置的商品。
     *
     * @param i 商品在购物车列表中的索引。
     */
    public static void removeItem(int i) {
        shoppingCartList.remove(i);
    }

    /**
     * 清空购物车列表。
     */
    public static void clearShoppingCartList() {
        shoppingCartList.clear();
    }

    /**
     * 显示购物车中的所有商品及其数量。
     */
    public static void displayCart() {
        System.out.println("*********购物车*************");
        for (int i = 0; i < shoppingCartList.size(); i++) {
            // 打印每件商品的详细信息
            System.out.println((i + 1) + ". " + shoppingCartList.get(i).product.getName() + " ￥" + shoppingCartList.get(i).product.getPrice() + " x " + shoppingCartList.get(i).quantity + "斤");
        }

    }

}
