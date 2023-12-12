package org.opennuri.study.ecommerce.goods.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;;

import java.time.LocalDateTime;

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

    // 레코드 생성자
    private final String createdBy;
    // 레코드 생성 일시
    private final LocalDateTime createdDateTime;
    // 레코드 마지막 수정자
    private final String lastModifiedBy;
    // 레코드 마지막 수정 일시
    private final LocalDateTime lastModifiedDateTime;

    public static ItemImage from(
            ItemImage.ItemImageId itemImageId,
            ItemImage.ItemId itemId,
            ItemImage.ItemImageDisplayOrder itemImageDisplayOrder,
            ItemImage.ItemImageUrl itemImageUrl,
            ItemImage.ItemImageName itemImageName,
            ItemImage.ItemImageDescription itemImageDescription,
            ItemImage.CreatedBy createdBy,
            ItemImage.CreatedDateTime createdDateTime,
            ItemImage.LastModifiedBy lastModifiedBy,
            ItemImage.LastModifiedDateTime lastModifiedDateTime
    ) {
        return new ItemImage(
                itemImageId.itemImageId(),
                itemId.itemId(),
                itemImageDisplayOrder.itemImageDisplayOrder(),
                itemImageUrl.itemImageUrl(),
                itemImageName.itemImageName(),
                itemImageDescription.itemImageDescription(),
                createdBy.createdBy(),
                createdDateTime.createdDateTime(),
                lastModifiedBy.lastModifiedBy(),
                lastModifiedDateTime.lastModifiedDateTime()
        );
    }

    public record ItemImageId(Long itemImageId) {
        public static ItemImageId from(Long itemImageId) {
            return new ItemImageId(itemImageId);
        }
    }
    public record ItemId(Long itemId) {}
    public record ItemImageDisplayOrder(Integer itemImageDisplayOrder) {}
    public record ItemImageUrl(String itemImageUrl) {}
    public record ItemImageName(String itemImageName) {}
    public record ItemImageDescription(String itemImageDescription) {}
    public record CreatedBy(String createdBy) {}
    public record CreatedDateTime(LocalDateTime createdDateTime) {}
    public record LastModifiedBy(String lastModifiedBy) {}
    public record LastModifiedDateTime(LocalDateTime lastModifiedDateTime) {}

}
