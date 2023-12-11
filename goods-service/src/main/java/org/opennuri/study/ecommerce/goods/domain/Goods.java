package org.opennuri.study.ecommerce.goods.domain;

/**
 * 상품 도메인 모델
 */
//lombok을 사용하여 불변객제 만들기

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(staticName = "from")
public class Goods {
    // 상품 식별자
    private final Long goodsId;
    // 상품 이름
    private final String goodsName;
    // 상품 검색 예약어
    private final String goodsSearchKeyword;
    // 상품 판매 가격
    private final Long goodsSalePrice;
    // 상품 매입 가격
    private final Long goodsPurchasePrice;

    // 상품 판매 가능 수량
    private final Long goodsAvailableStock;
    // 상품 안전 재고 수량
    private final Long goodsSafetyStock;

    // 상품 구분
    private final String goodsType;

    // 묶음 배송 여부
    private final Boolean isBundleDelivery;

    // 상품 판매 승인자
    private final String goodsSalesApprover;
    // 상품 판매 승인 일시
    private final LocalDateTime goodsSalesApprovedDateTime;
    // 상품 판매 승인 여부
    private final Boolean isGoodsSalesApproved;

    // 상품 면세 여부
    private final Boolean isGoodsTaxable;

    // 성인 상품 여부
    private final Boolean isGoodsAdult;

    // 상품 이미지 URL
    private final String goodsImageUrl;
    // 상품 판매 여부
    private final Boolean isGoodsOnSale;
    // 상품 판매 시작 일시
    private final String goodsOnSaleStartDateTime;
    // 상품 판매 종료 일시
    private final String goodsOnSaleEndDateTime;

    // 상품 전시 여부
    private final Boolean IsGoodsOnDisplay;
    // 전시 시작 일시
    private final String goodsOnDisplayStartDateTime;
    // 상품 전시 종료 일시
    private final String goodsOnDisplayEndDateTime;

    // 상품 할인 적용 여부
    private final Boolean isGoodsOnDiscount;
    // 상품 할인 비율 적용 여부
    private final Boolean isGoodsDiscountRate;

    // 상품 할인 시작 일시
    private final String goodsOnDiscountStartDateTime;
    // 상품 할인 종료 일시
    private final String goodsOnDiscountEndDateTime;

    // 상품 할인 가격(할인 금액)
    private final Long goodsDiscountPrice;
    // 상품 할인 비율(할인율)
    private final Long goodsDiscountRate;
    // 상품 소싱 채널
    private final String goodsSourcingChannel;
    // 상품 판매 채널
    private final String goodsSalesChannel;
    // 상품 브랜드
    private final String goodsBrand;
    // 묶음 상품 여부
    private final Boolean isBundleGoods;
    // 생성자
    private final String createdBy;
    // 생성 일시
    private final LocalDateTime createdDateTime;
    // 수정자
    private final String lastModifiedBy;
    // 수정 일시
    private final LocalDateTime lastModifiedDateTime;

}
