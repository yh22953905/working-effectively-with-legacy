package me.kimyounghan.legacy.woowahan.legacyclass;

/**
 * 주문을 관리하는 클래스
 *
 * @author 김영한
 */
public class Order {
    public Order(String orderNo){
        createNewOrder(orderNo);
    }

    public void receiptOrder(String orderNo) throws Exception {
        OrderStatus orderStatus = findOrderStatus(orderNo);

        if(orderStatus.isWait()){
            acceptOrder(orderStatus);
        } else {
            throw new Exception("접수할 수 없는 주문입니다.");
        }
    }

    /**
     * 주문 번호에 따라 새로운 주문을 생성한다.
     *
     * @param orderNo 주문 번호
     */
    private void createNewOrder(String orderNo) {

    }

    /**
     * 주문 번호로 해당 주문을 찾아, 상태를 리턴한다.
     *
     * @param orderNo 주문 번호
     * @return 주문 상태
     */
    private OrderStatus findOrderStatus(String orderNo) {
        return null;
    }

    /**
     * 주문을 접수한다.
     *
     * @param orderStatus 주문 상태
     */
    public void acceptOrder(OrderStatus orderStatus){
        orderStatus.changeOrderStatus("accept");
    }
}
