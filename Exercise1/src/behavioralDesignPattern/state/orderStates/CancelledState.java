package behavioralDesignPattern.state.orderStates;

import behavioralDesignPattern.state.Order;

public class CancelledState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order cancelled. Cannot move to next state");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled.");
    }

    @Override
    public String getStatus() {
        return "Order cancelled";
    }
}
