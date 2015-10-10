package example.com.checkstand.bean;

import java.io.Serializable;

/**
 * Created by laizuhong on 2015/10/10.
 */
public class GoodOrder implements Serializable{

    String goodName;
    String describe;
    double price;
    double preferential;
    int count;
    double amount;

    @Override
    public String toString() {
        return "GoodOrder{" +
                "goodName='" + goodName + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                ", preferential=" + preferential +
                ", count=" + count +
                ", amount=" + amount +
                '}';
    }

    public GoodOrder(String goodName, String describe, double price, double preferential, int count, double amount) {
        this.goodName = goodName;
        this.describe = describe;
        this.price = price;
        this.preferential = preferential;
        this.count = count;
        this.amount = amount;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPreferential() {
        return preferential;
    }

    public void setPreferential(double preferential) {
        this.preferential = preferential;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
