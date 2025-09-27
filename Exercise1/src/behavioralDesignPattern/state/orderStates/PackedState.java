package behavioralDesignPattern.state.orderStates;

import behavioralDesignPattern.state.Order;

public class PackedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ShippedState());
        System.out.println("Order shipped.");
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order cancelled after packing");
    }

    @Override
    public String getStatus() {
        return "Order Packed";
    }
}
