package isp.lab6.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    ArrayList<Product> products;
    private String orderId;
    private LocalDateTime date;
    private Double totalPrice;

    public Order(ArrayList<Product> products, String orderId, LocalDateTime date, Double totalPrice) {
        this.products = products;
        this.orderId = orderId;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", orderId='" + orderId + '\'' +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                '}';
    }

    }

