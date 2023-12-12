package org.opennuri.study.ecommerce.goods.domain;

/**
 * 아이템 도메인 모델
 */
//lombok을 사용하여 불변객제 만들기

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor(staticName = "from")
public class Goods {

    // 상품 식별자
    private final Long goodsId;
    // 상품 코드
    private final String goodsCode;
    // 상품 이름
    private final String goodsName;

    // 상품 구분 (단품, 묶음, 1+1, 지류(쿠폰), 무형 등)
    private final String goodsType;

    // 상품 브랜드
    private final String goodsBrand;
    // 상품 검색 예약어
    private final String goodsSearchKeyword;
    // 상품 판매 가격
    private final Long goodsSalePrice;


    // 상품 할인가
    private final Long goodsDiscountPrice;
    // 상품 할인 적용 여부
    private final Boolean isItemOnDiscount;
    // 상품 할인율 적용 여부
    private final Boolean isItemDiscountRate;
    // 상품 할인 시작 일시
    private final String itemOnDiscountStartDateTime;
    // 상품 할인 종료 일시
    private final String itemOnDiscountEndDateTime;

    // 상품 적립금
    private final Long goodsPoint;

    // 성인상품 포함 여부
    private final Boolean isGoodsAdult;


    // 상품 전시 여부
    private final Boolean IsGoodsOnDisplay;
    // 전시 시작 일시
    private final String goodsOnDisplayStartDateTime;
    // 전시 종료 일시
    private final String goodsOnDisplayEndDateTime;

    // 아이템 전시 카테고리
    private final GoodsDisplayCategory itemDisplayCategory;

    // 상품 전시 이미지들
    private final List<GoodsDisplayImage> goodsDisplayImages;


    // 레코드 생성자
    private final String createdBy;
    // 레코드 생성 일시
    private final LocalDateTime createdDateTime;
    // 레코드 마지막 수정자
    private final String lastModifiedBy;
    // 레코드 마지막 수정 일시
    private final LocalDateTime lastModifiedDateTime;






}
