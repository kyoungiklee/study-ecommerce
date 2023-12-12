package org.opennuri.study.ecommerce.goods.domain;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.opennuri.study.ecommerce.common.BaseDomain;

@Getter
@AllArgsConstructor(staticName = "from", access = AccessLevel.MODULE)
public class GoodsPrice {
    // 아이템 가격 식별자
    private final Long goodsPriceId;
    // 아이템 식별자
    private final Long goodsId;


    // 아이템 판매 가격
    private final Long goodsSalePrice;
    // 아이템 판매 부가세
    private final Long goodsSaleVat;
    // 아이템 판매 부가세율
    private final Long goodsSaleVatRate;

    // 아이템 매입 가격
    private final Long goodsPurchasePrice;
    // 아이템 매입 부가세
    private final Long goodsPurchaseVat;
    // 아이템 매입 부가세율
    private final Long goodsPurchaseVatRate;

    // 아이템 적립금-fixed
    private final Long goodsPointFixed;
    // 아이템 적립금-rate
    private final Long goodsPointRate;
    // 아이템 적립금 정액 여부
    private final Boolean isGoodsPointFixed;


    //아이템 무이자 힐부 개월수
    private final Long goodsInstallmentMonths;
    // 아이템 무이자 할부 부담 비율
    private final Long goodsInstallmentRate;


    // 가격 적용 일시
    private final LocalDateTime goodsPriceApplyDateTime;

    // 아이템 할인 가격
    private final Long goodsDiscountPrice;
    // 아이템 할인 여부
    private final Boolean isGoodsDiscounted;
    // 아이템 할인 시작 일시
    private final String goodsDiscountStartDateTime;
    // 아이템 할인 종료 일시
    private final String goodsDiscountEndDateTime;

    // 레코드 생성자
    private final String createdBy;
    // 레코드 생성 일시
    private final LocalDateTime createdDateTime;
    // 레코드 마지막 수정자
    private final String lastModifiedBy;
    // 레코드 마지막 수정 일시
    private final LocalDateTime lastModifiedDateTime;

}
