package behavioralDesignPattern.state.orderStates;

import behavioralDesignPattern.state.Order;

public class ShippedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
        System.out.println("Order delivered.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cannot be cancelled. Order already shipped");
    }

    @Override
    public String getStatus() {
        return "Order Shipped";
    }
}
