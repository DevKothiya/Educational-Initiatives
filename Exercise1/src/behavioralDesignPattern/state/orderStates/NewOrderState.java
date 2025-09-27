package behavioralDesignPattern.state.orderStates;

import behavioralDesignPattern.state.Order;

public class NewOrderState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new PackedState());
        System.out.println("Order packed");
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order cancelled");
    }

    @Override
    public String getStatus() {
        return "New Order";
    }
}
