package behavioralDesignPattern.state;

import behavioralDesignPattern.state.orderStates.NewOrderState;
import behavioralDesignPattern.state.orderStates.OrderState;

public class Order {

    OrderState state;
    public Order(){
        state=new NewOrderState();
    }
    public void setState(OrderState orderState){
        state=orderState;
    }
    public void nextState(){
        state.next(this);
    }
    public void cancelOrder(){
        state.cancel(this);
    }

    public void getStatus(){
        System.out.println("Current State:"+state.getStatus());
    }
}
