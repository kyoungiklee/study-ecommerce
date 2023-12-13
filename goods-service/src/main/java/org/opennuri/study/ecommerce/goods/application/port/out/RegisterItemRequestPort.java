package org.opennuri.study.ecommerce.goods.application.port.out;

import org.opennuri.study.ecommerce.goods.domain.Item;

public interface RegisterItemRequestPort {

    // 아이템 등록 요청 처리 interface
    Item createItemRequest(
            Item.ItemName itemName,
            Item.ItemBrand itemBrand,
            Item.ItemMinimumOrderQuantity itemMinimumOrderQuantity,
            Item.ItemMaximumOrderQuantity itemMaximumOrderQuantity,
            Item.IsItemOnSale isItemOnSale,
            Item.ItemSalesStatus itemSalesStatus,
            Item.IsItemTaxable isItemTaxable,
            Item.IsItemAdult isItemAdult,
            Item.ItemAvailableStock itemAvailableStock,
            Item.ItemSafetyStock itemSafetyStock,
            Item.ItemSalesMethod itemSalesMethod,
            Item.ItemSalesApproverId itemSalesApproverId,
            Item.ItemSalesApprovedDateTime itemSalesApprovedDateTime,
            Item.IsItemSalesApproved isItemSalesApproved,
            Item.ItemOnSaleStartDateTime itemOnSaleStartDateTime,
            Item.ItemOnSaleEndDateTime itemOnSaleEndDateTime,
            Item.ItemSourcingChannel itemSourcingChannel,
            Item.IsItemPurchasedByOwnCompany isItemPurchasedByOwnCompany,
            Item.ItemSalesChannel itemSalesChannel,
            Item.ItemClassificationList itemClassification,
            Item.ItemOptionList itemOptions,
            Item.ItemImageList itemImages,
            Item.ItemInfoNoticeList itemInfoNotices,
            Item.ItemSpecificationList itemSpecifications,
            Item.ItemQualityInspectionReportList itemQualityInspectionReports,
            Item.ItemPriceApprovalList itemPriceApprovals
    );
}
