package org.opennuri.study.ecommerce.goods.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 상품 전시 카테고리 도메인 모델
 * 프론트의 전시카테고리 및 상품 전시를 위한 정보를 관리한다.
 * 상품은 여러개의 전시 카테고리를 가질 수 있다.
 * 전시 카테고리는 여러개의 상품을 가질 수 있다.
 * 전시 카테고리는 상품의 전시 순서를 가지고 있다.
 * 전시 카테고리는 상품의 전시 순서를 변경할 수 있다.
 * 전시 카테고리는 전시되는 상품수를 가지고 있다.
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DisplayCategory {
    // 전시 카테고리 ID
    private final Long displayCategoryId;
    // 전시 카테고리 parent 코드
    private final String displayCategoryParentCode;
    // 전시 카테고리 child 코드
    private final String displayCategoryChildCode;
    // 전시 카테고리 이름
    private final String displayCategoryName;
    
    // 전시 카테고리 설명(전시 카테고리에 대한 설명 alt text)
    private final String displayCategoryDescription;
    // 전시 카테고리 전시 순서
    private final Long displayCategoryOrder;
    // 전시 카테고리 이미지URL
    private final String displayCategoryImageUrl;
    // 전시 카테고리 전시 여부
    private final Boolean isDisplayCategoryOnDisplay;
    
    // 전시 카테고리 전시 상품 수(전시 카테고리에 속한 상품 수)
    // 전시 카테고리에 속한 상품이 페기되면 자동으로 감소한다.(karafka로 상품 삭제 이벤트를 받아서 처리)
    // 전시 카테고리에 속한 상품이 생성되면 자동으로 증가한다.(karafka로 상품 추가 이벤트를 받아서 처리)
    private final Long displayCategoryCount;

    public record DisplayCategoryId(Long displayCategoryId) {}
    public record DisplayCategoryParentCode(String displayCategoryParentCode) {}
    public record DisplayCategoryChildCode(String displayCategoryChildCode) {}
    public record DisplayCategoryName(String displayCategoryName) {}
    public record DisplayCategoryDescription(String displayCategoryDescription) {}
    public record DisplayCategoryOrder(Long displayCategoryOrder) {}
    public record DisplayCategoryCount(Long displayCategoryCount) {}
    public record DisplayCategoryImageUrl(String displayCategoryImageUrl) {}
    public record IsDisplayCategoryOnDisplay(Boolean isDisplayCategoryOnDisplay) {}

    // DisplayCategory 생성자
    public static DisplayCategory from(
            DisplayCategoryId displayCategoryId,
            DisplayCategoryParentCode displayCategoryParentCode,
            DisplayCategoryChildCode displayCategoryChildCode,
            DisplayCategoryName displayCategoryName,
            DisplayCategoryDescription displayCategoryDescription,
            DisplayCategoryOrder displayCategoryOrder,
            DisplayCategoryCount displayCategoryCount,
            DisplayCategoryImageUrl displayCategoryImageUrl,
            IsDisplayCategoryOnDisplay isDisplayCategoryOnDisplay
    ) {
        return new DisplayCategory(
                displayCategoryId.displayCategoryId(),
                displayCategoryParentCode.displayCategoryParentCode(),
                displayCategoryChildCode.displayCategoryChildCode(),
                displayCategoryName.displayCategoryName(),
                displayCategoryDescription.displayCategoryDescription(),
                displayCategoryOrder.displayCategoryOrder(),
                displayCategoryImageUrl.displayCategoryImageUrl(),
                isDisplayCategoryOnDisplay.isDisplayCategoryOnDisplay(),
                displayCategoryCount.displayCategoryCount()
        );
    }
}
