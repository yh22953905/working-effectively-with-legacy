package me.kimyounghan.legacy.woowahan.legacyclass;

/**
 * 신규 요구사항에 따라, 접수한 주문 데이터를 로깅 시스템으로 보내는 클래스
 *
 * @author 김영한
 */
public class LoggingOrder {
    private final Order order;

    public LoggingOrder(Order order) {
        this.order = order;
    }

    public void acceptOrder() {
        order.acceptOrder(null);
        submitLoggingSystem(order); //신규 기능 추가: 주문 접수 데이터를 로깅 시스템으로 보낸다.
    }

    public void submitLoggingSystem(Order order){
        // do something..
    }
}
