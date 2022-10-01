package me.kimyounghan.legacy.woowahan.legacyclass;

/**
 * 주문 상태 클래스
 *
 * @author 김영한
 */
public class OrderStatus {
    /**
     * 대기 상태인지 여부
     *
     * @return 대기 상태 여부
     */
    public boolean isWait() {
        return false;
    }

    /**
     * 주문 상태를 변경한다.
     *
     * @param status 주문 상태 (String)
     */
    public void changeOrderStatus(String status) {

    }
}
