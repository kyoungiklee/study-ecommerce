package org.opennuri.study.ecommerce.goods.adapter.out.persistence.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.opennuri.study.ecommerce.common.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "item_price")
@Getter @Setter
@EqualsAndHashCode(callSuper = false)
public class ItemPriceJpaEntity extends BaseEntity {
    // 아이템 가격 식별자
    @Id
    @GeneratedValue
    private Long itemPriceId;
    // 아이템 식별자
    private Long itemId;

    // 가격 적용 일시(가격이 적용되는 일시가 지나면 새로운 가격이 적용된다.)
    private LocalDateTime itemPriceApplyDateTime;

    // 아이템 판매 가격 (부가세 제외)  
    private Long itemSalePrice;
    // 아이템 판매 부가세(판매가격 * 판매부가세율 / 100)
    private Long itemSaleVat;
    // 아이템 판매 부가세율 10 -> 기본값
    private Long itemSaleVatRate;

    // 아이템 매입 가격 (부가세 제외)
    private Long itemPurchasePrice;
    // 아이템 매입 부가세 (매입가격 * 매입부가세율 / 100)
    private Long itemPurchaseVat;
    // 아이템 매입 부가세율 10 -> 기본값
    private Long itemPurchaseVatRate;

    // 아이템 적립금-fixed 0 -> 기본값
    private Long itemPointPriceFixed;
    // 아이템 적립금-rate(상품판매가 * 적립율 / 100) 0 -> 기본값
    private Long itemPointPriceRate;
    // 아이템 적립금 정액 여부 O -> 기본값
    private Boolean isItemPointFixed;

    // 아이템 적립금 적용 일시
    private String itemPointApplyDateTime;
    // 아이템 적립금 적용 종료 일시
    private String itemPointEndDateTime;

    // 아이템 할인 fixed 0 -> 기본값
    private Long itemDiscountPriceFixed;
    // 아이템 할인 rate 0 -> 기본값
    private Long itemDiscountPriceRate;
    // 아이템 할인 여부 O -> 기본값
    private Boolean isItemDiscounted;

    // 아이템 할인 시작 일시 now() -> 기본값
    private String itemDiscountStartDateTime;
    // 아이템 할인 종료 일시 now() -> 기본값
    private String itemDiscountEndDateTime;

    //아이템 무이자 힐부 개월수 0 -> 기본값
    private Long itemInstallmentMonths;
    // 아이템 무이자 할부 부담 비율  0 -> 기본값
    private Long itemInstallmentRate;
}
