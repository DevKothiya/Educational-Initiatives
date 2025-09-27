package behavioralDesignPattern.state.orderStates;

import behavioralDesignPattern.state.Order;

public class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order delivered. No next state.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot Cancel. Order already delivered");
    }

    @Override
    public String getStatus() {
        return "Order delivered";
    }
}
