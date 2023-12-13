package org.opennuri.study.ecommerce.goods.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 아이템 분류 코드
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)

public class ItemClassification {
    // 아이템 분류 코드 아이디
    private  final Long itemClassificationCodeId;
    // 아이템 parent 코드
    private  final String itemClassCodeParent;
    // 아이템 child 코드
    private  final String itemClassCodeChild;
    // 아이템 분류 코드 depth
    private  final Integer itemClassCodeDepth;
    // 아이템 분류 코드 명
    private  final String itemClassCodeName;
    // 아이템 분류 코드 설명
    private  final String itemClassCodeDescription;

    // 생성자
    public static ItemClassification from(
            ItemClassificationCodeId itemClassificationCodeId,
            ItemClassCodeParent itemClassCodeParent,
            ItemClassCodeChild itemClassCodeChild,
            ItemClassCodeDepth itemClassCodeDepth,
            ItemClassCodeName itemClassCodeName,
            ItemClassCodeDescription itemClassCodeDescription
    ) {
        return new ItemClassification(
                itemClassificationCodeId.itemClassificationCodeId(),
                itemClassCodeParent.itemClassCodeParent(),
                itemClassCodeChild.itemClassCodeChild(),
                itemClassCodeDepth.itemClassCodeDepth(),
                itemClassCodeName.itemClassCodeName(),
                itemClassCodeDescription.itemClassCodeDescription()
        );
    }

    public record ItemClassificationCodeId(Long itemClassificationCodeId) {}
    public record ItemClassCodeParent(String itemClassCodeParent) {}
    public record ItemClassCodeChild(String itemClassCodeChild) {}
    public record ItemClassCodeDepth(Integer itemClassCodeDepth) {}
    public record ItemClassCodeName(String itemClassCodeName) {}
    public record ItemClassCodeDescription(String itemClassCodeDescription) {}


    public static void main(String[] args) {
        ItemClassification itemClassification = ItemClassification.from(
                new ItemClassificationCodeId(1L),
                new ItemClassCodeParent("1"),
                new ItemClassCodeChild("1"),
                new ItemClassCodeDepth(1),
                new ItemClassCodeName("1"),
                new ItemClassCodeDescription("1")
        );
        System.out.println(itemClassification);
    }

}
