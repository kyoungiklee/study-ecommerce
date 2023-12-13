package org.opennuri.study.ecommerce.goods.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(staticName = "from", access = AccessLevel.PRIVATE)
public class ItemPrice {
    // 아이템 가격 식별자
    private final Long itemPriceId;
    // 아이템 식별자
    private final Long itemId;

    // 가격 적용 일시(가격이 적용되는 일시가 지나면 새로운 가격이 적용된다.)
    private final LocalDateTime itemPriceApplyDateTime;

    // 아이템 판매 가격 (부가세 제외)
    private final Long itemSalePrice;
    // 아이템 판매 부가세(판매가격 * 판매부가세율 / 100)
    private final Long itemSaleVat;
    // 아이템 판매 부가세율 10 -> 기본값
    private final Long itemSaleVatRate;

    // 아이템 매입 가격 (부가세 제외)
    private final Long itemPurchasePrice;
    // 아이템 매입 부가세 (매입가격 * 매입부가세율 / 100)
    private final Long itemPurchaseVat;
    // 아이템 매입 부가세율 10 -> 기본값
    private final Long itemPurchaseVatRate;

    // 아이템 적립금-fixed 0 -> 기본값
    private final Long itemPointPriceFixed;
    // 아이템 적립금-rate(상품판매가 * 적립율 / 100) 0 -> 기본값
    private final Long itemPointPriceRate;
    // 아이템 적립금 정액 여부 O -> 기본값
    private final Boolean isItemPointFixed;

    // 아이템 적립금 적용 일시
    private final String itemPointApplyDateTime;
    // 아이템 적립금 적용 종료 일시
    private final String itemPointEndDateTime;

    // 아이템 할인 fixed 0 -> 기본값
    private final Long itemDiscountPriceFixed;
    // 아이템 할인 rate 0 -> 기본값
    private final Long itemDiscountPriceRate;
    // 아이템 할인 여부 O -> 기본값
    private final Boolean isItemDiscounted;

    // 아이템 할인 시작 일시 now() -> 기본값
    private final String itemDiscountStartDateTime;
    // 아이템 할인 종료 일시 now() -> 기본값
    private final String itemDiscountEndDateTime;

    //아이템 무이자 힐부 개월수 0 -> 기본값
    private final Long itemInstallmentMonths;
    // 아이템 무이자 할부 부담 비율  0 -> 기본값
    private final Long itemInstallmentRate;
    
    // ItemPrice 생성자 만들기
    public static ItemPrice getInstance(
            ItemPrice.ItemPriceId itemPriceId,
            ItemPrice.ItemId itemId,
            ItemPrice.ItemPriceApplyDateTime itemPriceApplyDateTime,
            ItemPrice.ItemSalePrice itemSalePrice,
            ItemPrice.ItemSaleVat itemSaleVat,
            ItemPrice.ItemSaleVatRate itemSaleVatRate,
            ItemPrice.ItemPurchasePrice itemPurchasePrice,
            ItemPrice.ItemPurchaseVat itemPurchaseVat,
            ItemPrice.ItemPurchaseVatRate itemPurchaseVatRate,
            ItemPrice.ItemPointPriceFixed itemPointPriceFixed,
            ItemPrice.ItemPointPriceRate itemPointPriceRate,
            ItemPrice.IsItemPointFixed isItemPointFixed,
            ItemPrice.ItemPointApplyDateTime itemPointApplyDateTime,
            ItemPrice.ItemPointEndDateTime itemPointEndDateTime,
            ItemPrice.ItemDiscountPriceFixed itemDiscountPriceFixed,
            ItemPrice.ItemDiscountPriceRate itemDiscountPriceRate,
            ItemPrice.IsItemDiscounted isItemDiscounted,
            ItemPrice.ItemDiscountStartDateTime itemDiscountStartDateTime,
            ItemPrice.ItemDiscountEndDateTime itemDiscountEndDateTime,
            ItemPrice.ItemInstallmentMonths itemInstallmentMonths,
            ItemPrice.ItemInstallmentRate itemInstallmentRate
    ) {
        return new ItemPrice(
                itemPriceId.itemPriceId(),
                itemId.itemId(),
                itemPriceApplyDateTime.itemPriceApplyDateTime(),
                itemSalePrice.itemSalePrice(),
                itemSaleVat.itemSaleVat(),
                itemSaleVatRate.itemSaleVatRate(),
                itemPurchasePrice.itemPurchasePrice(),
                itemPurchaseVat.itemPurchaseVat(),
                itemPurchaseVatRate.itemPurchaseVatRate(),
                itemPointPriceFixed.itemPointPriceFixed(),
                itemPointPriceRate.itemPointPriceRate(),
                isItemPointFixed.isItemPointFixed(),
                itemPointApplyDateTime.itemPointApplyDateTime(),
                itemPointEndDateTime.itemPointEndDateTime(),
                itemDiscountPriceFixed.itemDiscountPriceFixed(),
                itemDiscountPriceRate.itemDiscountPriceRate(),
                isItemDiscounted.isItemDiscounted(),
                itemDiscountStartDateTime.itemDiscountStartDateTime(),
                itemDiscountEndDateTime.itemDiscountEndDateTime(),
                itemInstallmentMonths.itemInstallmentMonths(),
                itemInstallmentRate.itemInstallmentRate()
        );
    }




    public record ItemPriceId(Long itemPriceId) {}
    public record ItemId(Long itemId) {}
    public record ItemPriceApplyDateTime(LocalDateTime itemPriceApplyDateTime) {}
    public record ItemSalePrice(Long itemSalePrice) {}
    public record ItemSaleVat(Long itemSaleVat) {}
    public record ItemSaleVatRate(Long itemSaleVatRate) {}
    public record ItemPurchasePrice(Long itemPurchasePrice) {}
    public record ItemPurchaseVat(Long itemPurchaseVat) {}
    public record ItemPurchaseVatRate(Long itemPurchaseVatRate) {}
    public record ItemPointPriceFixed(Long itemPointPriceFixed) {}
    public record ItemPointPriceRate(Long itemPointPriceRate) {}
    public record IsItemPointFixed(Boolean isItemPointFixed) {}
    public record ItemPointApplyDateTime(String itemPointApplyDateTime) {}
    public record ItemPointEndDateTime(String itemPointEndDateTime) {}
    public record ItemDiscountPriceFixed(Long itemDiscountPriceFixed) {}
    public record ItemDiscountPriceRate(Long itemDiscountPriceRate) {}
    public record IsItemDiscounted(Boolean isItemDiscounted) {}

    public record ItemDiscountStartDateTime(String itemDiscountStartDateTime) {}
    public record ItemDiscountEndDateTime(String itemDiscountEndDateTime) {}
    public record ItemInstallmentMonths(Long itemInstallmentMonths) {}
    public record ItemInstallmentRate(Long itemInstallmentRate) {}



    
}
