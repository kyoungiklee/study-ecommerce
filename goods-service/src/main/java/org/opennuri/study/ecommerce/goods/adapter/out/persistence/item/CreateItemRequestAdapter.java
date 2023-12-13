package org.opennuri.study.ecommerce.goods.adapter.out.persistence.item;

import lombok.AllArgsConstructor;
import org.opennuri.study.ecommerce.common.PersistenceAdapter;
import org.opennuri.study.ecommerce.goods.application.port.out.RegisterItemRequestPort;
import org.opennuri.study.ecommerce.goods.domain.Item;

@PersistenceAdapter
@AllArgsConstructor
public class CreateItemRequestAdapter implements RegisterItemRequestPort {

    private final ItemEntityRepository itemEntityRepository;
    @Override
    public Item createItemRequest(Item.ItemName itemName
            , Item.ItemBrand itemBrand
            , Item.ItemMinimumOrderQuantity itemMinimumOrderQuantity
            , Item.ItemMaximumOrderQuantity itemMaximumOrderQuantity
            , Item.IsItemOnSale isItemOnSale
            , Item.ItemSalesStatus itemSalesStatus
            , Item.IsItemTaxable isItemTaxable
            , Item.IsItemAdult isItemAdult
            , Item.ItemAvailableStock itemAvailableStock
            , Item.ItemSafetyStock itemSafetyStock
            , Item.ItemSalesMethod itemSalesMethod
            , Item.ItemSalesApproverId itemSalesApproverId
            , Item.ItemSalesApprovedDateTime itemSalesApprovedDateTime
            , Item.IsItemSalesApproved isItemSalesApproved
            , Item.ItemOnSaleStartDateTime itemOnSaleStartDateTime
            , Item.ItemOnSaleEndDateTime itemOnSaleEndDateTime
            , Item.ItemSourcingChannel itemSourcingChannel
            , Item.IsItemPurchasedByOwnCompany isItemPurchasedByOwnCompany
            , Item.ItemSalesChannel itemSalesChannel
            , Item.ItemClassificationList itemClassification
            , Item.ItemOptionList itemOptions
            , Item.ItemImageList itemImages
            , Item.ItemInfoNoticeList itemInfoNotices
            , Item.ItemSpecificationList itemSpecifications
            , Item.ItemQualityInspectionReportList itemQualityInspectionReports
            , Item.ItemPriceApprovalList itemPriceApprovals) {
        return null;
    }
}
