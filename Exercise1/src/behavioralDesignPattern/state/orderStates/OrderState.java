package behavioralDesignPattern.state.orderStates;

import behavioralDesignPattern.state.Order;

public interface OrderState {
    void next(Order order);
    void cancel(Order order);
    String getStatus();
}
