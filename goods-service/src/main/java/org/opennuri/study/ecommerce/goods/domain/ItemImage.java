package org.opennuri.study.ecommerce.goods.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemImage {
    // 아이템 이미지 식별자
    private final Long itemImageId;
    // 아이템 식별자
    private final Long itemId;
    // 아이템 이미지 전시 순서
    private final Integer itemImageDisplayOrder;
    // 아이템 이미지 URL
    private final String itemImageUrl;
    // 아이템 이미지 명
    private final String itemImageName;
    // 아이템 이미지 설명 (alt text로 사용됨)
    private final String itemImageDescription;


    public static ItemImage from(
            ItemImage.ItemImageId itemImageId,
            ItemImage.ItemId itemId,
            ItemImage.ItemImageDisplayOrder itemImageDisplayOrder,
            ItemImage.ItemImageUrl itemImageUrl,
            ItemImage.ItemImageName itemImageName,
            ItemImage.ItemImageDescription itemImageDescription
    ) {
        return new ItemImage(
                itemImageId.itemImageId(),
                itemId.itemId(),
                itemImageDisplayOrder.itemImageDisplayOrder(),
                itemImageUrl.itemImageUrl(),
                itemImageName.itemImageName(),
                itemImageDescription.itemImageDescription()
        );
    }

    public record ItemImageId(Long itemImageId) {}
    public record ItemId(Long itemId) {}
    public record ItemImageDisplayOrder(Integer itemImageDisplayOrder) {}
    public record ItemImageUrl(String itemImageUrl) {}
    public record ItemImageName(String itemImageName) {}
    public record ItemImageDescription(String itemImageDescription) {}

}
