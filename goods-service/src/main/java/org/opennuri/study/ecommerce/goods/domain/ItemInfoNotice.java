package org.opennuri.study.ecommerce.goods.domain;

/**
 * 아이템 정보 공지사항 도메인 모델
 * <p>
 *     아이템 정보 공지사항은 아이템의 추가 정보를 제공하기 위한 정보이다.
 *     예를 들어, 아이템이 의류 타입이면 필수로로 색상, 사이즈, 재질 등의 정보를 제공해야한다.
 *     아이템은 상품의 타입별로 정보공지사항을 가질 수 있다.
 *     아이템 등록 시 필수로 등록되어야 한다.
 */
public class ItemInfoNotice {
    // 아이템 정보 공지사항 식별자
    private Long itemInfoNoticeId;

    // 아이템 식별자
    private Long itemId;
    // 아이템 정보공지사항코드 타입
    private String itemInfoNoticeCodeType;
    // 아이템 정보공지사항코드
    private String itemInfoNoticeCode;
    // 아이템 정보공지사항명
    private String itemInfoNoticeName;
    // 아이템 정보공지사항 값
    private String itemInfoNoticeValue;

    //정보공지사항 사용여부 1:사용, 0:미사용 1 -> 기본값
    private Boolean isInfoNoticeUse;






}
