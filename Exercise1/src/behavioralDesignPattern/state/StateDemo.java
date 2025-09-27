package behavioralDesignPattern.state;

public class StateDemo {

    public static void main(String[] args) {

        //Creating an order
        Order order=new Order();
        order.getStatus();

        //moving order to pack state
        order.nextState();
        order.getStatus();

        //moving order to ship state
        order.nextState();
        order.getStatus();

        //trying to cancel a shipped order
        order.cancelOrder();

        //moving order to delivered state
        order.nextState();
        order.getStatus();

        //trying to move to next state when order is already delivered
        order.nextState();

        //trying to cancel a delivered order
        order.cancelOrder();

    }
}
