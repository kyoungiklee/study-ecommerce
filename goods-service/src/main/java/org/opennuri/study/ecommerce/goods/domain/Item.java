package org.opennuri.study.ecommerce.goods.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 아이템은 판매되는 실제적 형태이다.
 * 아이템은 아이템옵션을 가진다.
 * 아이템은 묶음아이템, 단품아이템, 무형아이템, 쿠폰아이템 1+1아이템 등으로 아이템의 형태가 다양하다.
 * 재고관리는 Item option 단위로 관리한다.
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Item {
    /**
     * 아이템 식별자 Long
     * 아이템 식별자는 아이템을 식별하는 식별자이다.
     * 아이템 식별자는 아이템에 대한 식별자이기 때문에 아이템 식별자는 유일해야 한다. primary key
     */
    // 아이템 식별자
    private final Long itemId;
    /**
     * 아이템 이름
     * 아이템 이름은 아이템에 대한 이름 정보를 담고 있다.
     */
    // 아이템 이름
    private final String itemName;
    /**
     * 아이템 브랜드
     * 아이템 브랜드는 아이템에 대한 브랜드 정보를 담고 있다.
     */
    // 아이템 브랜드
    private final String itemBrand;
    /**
     * 아이템 판매 최소 갯수 (최소 주문 수량) 1 -> 기본값
     * 아이템 판매 최소 갯수는 아이템에 대한 판매 최소 갯수 정보를 담고 있다.
     */
    // 아이템 판매 최소 갯수 (최소 주문 수량) 1 -> 기본값
    private final Long itemMinimumOrderQuantity;

    /**
     * 아이템 판매 최대 갯수 (최대 주문 수량) 0 -> 무제한
     * 아이템 판매 최대 갯수는 아이템에 대한 판매 최대 갯수 정보를 담고 있다.
     * 아이템 판매 최대 갯수가 0인 경우 무제한으로 판매가 가능하다.(최대 판매 가능 수량은 재고 수량 - 안전 재고수량 보다 작거나 같아야 한다.)
     */
    // 아이템 판매 최대 갯수 (최대 주문 수량) 0 -> 무제한
    private final Long itemMaximumOrderQuantity;

    // 아이템 판매 여부 (0: 판매중지, 1: 판매중) 1 -> 기본값
    private final Boolean isItemOnSale;
    // 아이템 판매 상태(판매중, 판매중지, 일시품절, 입고예정 등) 판매중 -> 기본값
    private final String itemSalesStatus;

    // 아이템 면세 여부 (과세, 면세) 과세 -> 기본값
    private final Boolean isItemTaxable;

    /**
     * 성인 아이템 여부 (전체, 성인) 전체 -> 기본값
     * 성인 아이템 여부는 아이템에 대한 성인 여부 정보를 담고 있다.
     * 성인 아이템 여부가 true인 경우 성인인 경우에만 구매가 가능하다.
     */
    // 성인 아이템 여부 (전체, 성인) 전체 -> 기본값
    private final Boolean isItemAdult;

    // 아이템 판매 가능 수량 (재고 수량) 0 -> 기본값 재고수량이 0인 경우 품절로 처리(안전재고가 우선 적용됨)
    private final Long itemAvailableStock;
    // 아이템 안전 재고 수량 (안전재고 수량이하인 경우 재고 부족으로 일시품절로 처리) 0 -> 기본값
    private final Long itemSafetyStock;

    // 아이템 판매 방식(일반(배송), 예약, 방문설치 등) 일반(배송) -> 기본값
    private final String itemSalesMethod;

    // 아이템 판매 승인자 아이디
    private final String itemSalesApproverId;
    // 아이템 판매 승인 일시
    private final LocalDateTime itemSalesApprovedDateTime;
    // 아이템 판매 승인 여부
    private final Boolean isItemSalesApproved;

    // 아이템 판매 시작 일시
    // 아이템 판매 시작 일시는 아이템이 판매가 시작되는 일시를 의미한다.
    // 아이템 판매 여부 값이 판매중 이더라도 아이템 판매 시작 일시가 지나지 않으면 판매가 시작되지 않는다.
    private final LocalDateTime itemOnSaleStartDateTime;
    // 아이템 판매 종료 일시
    private final String itemOnSaleEndDateTime;

    // 아이템 소싱 채널
    private final String itemSourcingChannel;

    //자사 매입 상품
    private final Boolean isItemPurchasedByOwnCompany;

    // 아이템 판매 채널
    private final String itemSalesChannel;



    /**
     *  아이템 상품 분류 정보
     *  아이템 분류 정보는 아이템에 대한 상품 분류 정보를 담고 있다.
     */
    private final ItemClassification itemClassification;

    /**
     * 아이템 옵션 정보
     * 아이템이 가지는 옵션 정보(색상, 사이즈, 용량 등)를 담고 있다.
     */
    private final List<ItemOption> itemOptions;

    /**
     * 아이템 이미지 정보
     * 아이템에 대한 이미지 정보를 담고 있다.(대표 이미지, 상세 이미지, 추가 이미지 등)
     */
    private final List<ItemImage> itemImages;

    /**
     * 아이템 정보 고시 정보
     * 아이템에 대한 정보 고시 정보를 담고 있다. (안전인증, 품질인증, 소재, 제조사, 제조국 등)
     */
    private final List<ItemInfoNotice> itemInfoNotice;

    /**
     *  아이템 상세 설명서 정보
     *  아이템에 대한  상세설명서 정보를 담고 있다. (상품 상세 설명서, 상품 상세  이미지 URL 등)
     */
    private final List<ItemSpecification> itemSpecification;

    /**
     * 아이템 품질 인증 정보
     * 아이템에 대한 품질 인증 정보를 담고 있다.
     */
    private final List<ItemQualityInspectionReport> itemQualityInspectionReport;

    /**
     * 아이템 가격 승인 히스토리
     * 아이템에 대한 가격 승인 히스토리를 담고 있다.
     */
    private final List<ItemPriceApproval> itemPriceApprovals;


    public record ItemId(Long itemId) {}
    public record ItemName(String itemName) {}
    public record ItemBrand(String itemBrand) {}
    public record ItemMinimumOrderQuantity(Long itemMinimumOrderQuantity) {}
    public record ItemMaximumOrderQuantity(Long itemMaximumOrderQuantity) {}
    public record IsItemOnSale(Boolean isItemOnSale) {}
    public record ItemSalesStatus(String itemSalesStatus) {}
    public record IsItemTaxable(Boolean isItemTaxable) {}
    public record IsItemAdult(Boolean isItemAdult) {}
    public record ItemAvailableStock(Long itemAvailableStock) {}
    public record ItemSafetyStock(Long itemSafetyStock) {}
    public record ItemSalesMethod(String itemSalesMethod) {}
    public record ItemSalesApproverId(String itemSalesApproverId) {}
    public record ItemSalesApprovedDateTime(LocalDateTime itemSalesApprovedDateTime) {}
    public record IsItemSalesApproved(Boolean isItemSalesApproved) {}
    public record ItemOnSaleStartDateTime(LocalDateTime itemOnSaleStartDateTime) {}
    public record ItemOnSaleEndDateTime(String itemOnSaleEndDateTime) {}
    public record ItemSourcingChannel(String itemSourcingChannel) {}
    public record IsItemPurchasedByOwnCompany(Boolean isItemPurchasedByOwnCompany) {}
    public record ItemSalesChannel(String itemSalesChannel) {}
    public record ItemOptionList(List<ItemOption> itemOptions) {}
    public record ItemImageList(List<ItemImage> itemImages) {}
    public record ItemInfoNoticeList(List<ItemInfoNotice> itemInfoNotices) {}
    public record ItemSpecificationList(List<ItemSpecification> itemSpecifications) {}
    public record ItemQualityInspectionReportList(List<ItemQualityInspectionReport> itemQualityInspectionReports) {}


    /**
     * 아이템 가격 승인 히스토리
     * 아이템에 대한 가격 승인 히스토리를 담고 있다.
     */
    public record ItemPriceApprovalList(List<ItemPriceApproval> itemPriceApprovals) {}

    public record ItemClassificationList(ItemClassification itemClassifications) {}

    // Item 생성자
    public static Item from(
            ItemId itemId,
            ItemName itemName,
            ItemBrand itemBrand,
            ItemMinimumOrderQuantity itemMinimumOrderQuantity,
            ItemMaximumOrderQuantity itemMaximumOrderQuantity,
            IsItemOnSale isItemOnSale,
            ItemSalesStatus itemSalesStatus,
            IsItemTaxable isItemTaxable,
            IsItemAdult isItemAdult,
            ItemAvailableStock itemAvailableStock,
            ItemSafetyStock itemSafetyStock,
            ItemSalesMethod itemSalesMethod,
            ItemSalesApproverId itemSalesApproverId,
            ItemSalesApprovedDateTime itemSalesApprovedDateTime,
            IsItemSalesApproved isItemSalesApproved,
            ItemOnSaleStartDateTime itemOnSaleStartDateTime,
            ItemOnSaleEndDateTime itemOnSaleEndDateTime,
            ItemSourcingChannel itemSourcingChannel,
            IsItemPurchasedByOwnCompany isItemPurchasedByOwnCompany,
            ItemSalesChannel itemSalesChannel,
            ItemClassificationList itemClassification,
            ItemOptionList itemOptions,
            ItemImageList itemImages,
            ItemInfoNoticeList itemInfoNotices,
            ItemSpecificationList itemSpecifications,
            ItemQualityInspectionReportList itemQualityInspectionReports,
            ItemPriceApprovalList itemPriceApprovals
    ) {
        return new Item(
                itemId.itemId,
                itemName.itemName,
                itemBrand.itemBrand,
                itemMinimumOrderQuantity.itemMinimumOrderQuantity,
                itemMaximumOrderQuantity.itemMaximumOrderQuantity,
                isItemOnSale.isItemOnSale,
                itemSalesStatus.itemSalesStatus,
                isItemTaxable.isItemTaxable,
                isItemAdult.isItemAdult,
                itemAvailableStock.itemAvailableStock,
                itemSafetyStock.itemSafetyStock,
                itemSalesMethod.itemSalesMethod,
                itemSalesApproverId.itemSalesApproverId,
                itemSalesApprovedDateTime.itemSalesApprovedDateTime,
                isItemSalesApproved.isItemSalesApproved,
                itemOnSaleStartDateTime.itemOnSaleStartDateTime,
                itemOnSaleEndDateTime.itemOnSaleEndDateTime,
                itemSourcingChannel.itemSourcingChannel,
                isItemPurchasedByOwnCompany.isItemPurchasedByOwnCompany,
                itemSalesChannel.itemSalesChannel,
                itemClassification.itemClassifications,
                itemOptions.itemOptions,
                itemImages.itemImages,
                itemInfoNotices.itemInfoNotices,
                itemSpecifications.itemSpecifications,
                itemQualityInspectionReports.itemQualityInspectionReports,
                itemPriceApprovals.itemPriceApprovals

        );
    }
}
