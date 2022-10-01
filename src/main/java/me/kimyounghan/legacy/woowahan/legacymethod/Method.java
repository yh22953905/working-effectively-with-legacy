package me.kimyounghan.legacy.woowahan.legacymethod;

/**
 * 레거시 메소드를 포장하는 예시
 *
 * @author 김영한
 */
public class Method {
    /**
     * 온라인 결제를 진행한 주문을 생성한다.
     * -> 기존에는 온라인 결제만 가능한 레거시 코드였으나 오프라인 결제도 가능하도록 해달라는 신규 요구사항이 발생
     */
    public void createOrder(){
        String orderNo = createOrderNo();
        Order order = createOrder(orderNo);
        PayResult payResult = pay(order.getPayInfo());

        if(isPaid(payResult))
            orderComplete(order);
        else
            orderFail(order);
    }

    /**
     * 주문 번호를 생성한다.
     *
     * @return 생성된 주문 번호
     */
    private String createOrderNo() {
        return null;
    }

    /**
     * 주문을 생성한다.
     *
     * @param orderNo
     * @return
     */
    private Order createOrder(String orderNo) {
        return null;
    }

    /**
     * 생성된 주문으로 결제한다.
     *
     * @param order 생성된 주문
     * @return 결제 결과
     */
    public PayResult pay(Order order){
        // do something..
        return null;
    }

    /**
     * 결제 정보에 따라 온라인 결제 혹은 오프라인 결제를 한다
     *
     * @param payInfo 결제 정보
     * @return 결제 결과
     */
    private PayResult pay(PayInfo payInfo) {
        if (isOnlinePay(payInfo))
            return payOnline();
        else
            return payOffline();
    }

    /**
     * 결제 결과로 결제 여부를 판단한다.
     *
     * @param payResult 결제 결과
     * @return 결제 여부
     */
    private boolean isPaid(PayResult payResult) {
        return false;
    }

    /**
     * 주문을 완료 처리한다.
     *
     * @param order 주문
     */
    private void orderComplete(Order order) {

    }

    /**
     * 주문을 실패 처리한다.
     *
     * @param order 주문
     */
    private void orderFail(Order order) {

    }

    /**
     * 결제 정보에 따라 온라인, 오프라인 여부를 리턴한다.
     *
     * @param payInfo 결제 정보
     * @return 온라인 오프라인 여부
     */
    private boolean isOnlinePay(PayInfo payInfo) {
        return false;
    }

    /**
     * 온라인 결제를 한다.
     *
     * @see Method#pay(me.kimyounghan.legacy.woowahan.legacymethod.Order)
     * @return 결제 결과
     */
    private PayResult payOnline() {
        return null;
    }

    /**
     * 오프라인 결제를 한다.
     *
     * @return 결제 결과
     */
    private PayResult payOffline() {
        return null;
    }
}
