package example.com.checkstand.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by laizuhong on 2015/10/10.
 */
public class OrderDetail implements Serializable{
    int id;
    long number;
    double amount;
    double realityAmount;
    String time;
    String name;
    String cloundNumber;
    String orderState;
    String service;
    String serviceState;
    List<GoodOrder> goodOrders;

    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRealityAmount() {
        return realityAmount;
    }

    public void setRealityAmount(double realityAmount) {
        this.realityAmount = realityAmount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCloundNumber() {
        return cloundNumber;
    }

    public void setCloundNumber(String cloundNumber) {
        this.cloundNumber = cloundNumber;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    public List<GoodOrder> getGoodOrders() {
        return goodOrders;
    }

    public void setGoodOrders(List<GoodOrder> goodOrders) {
        this.goodOrders = goodOrders;
    }

    public OrderDetail(int id, long number, double amount, double realityAmount, String time, String name, String cloundNumber, String orderState, String service, String serviceState, List<GoodOrder> goodOrders) {
        this.id = id;
        this.number = number;
        this.amount = amount;
        this.realityAmount = realityAmount;
        this.time = time;
        this.name = name;
        this.cloundNumber = cloundNumber;
        this.orderState = orderState;
        this.service = service;
        this.serviceState = serviceState;
        this.goodOrders = goodOrders;
    }
}
