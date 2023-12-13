package org.opennuri.study.ecommerce.goods.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;


@Getter
@AllArgsConstructor(staticName = "from", access = AccessLevel.PRIVATE)
public class ItemSpecification {

    // 아이템 스펙 식별자
    private final Long itemSpecificationId;
    // 아이템 식별자
    private final Long itemId;
    //아이템 스펙 코드 아이디
    private final Long itemSpecificationCodeId;
    //아이템 스펙 코드 명
    private final String itemSpecificationCodeName;
    //아이템 스펙 코드 내용
    private final String itemSpecificationCodeContent;

    // ItemSpecification 객체를 생성하는 정적 팩토리 메서드 generate
    public static ItemSpecification generate(
            ItemSpecificationId itemSpecificationId,
            ItemId itemId,
            ItemSpecificationCodeId itemSpecificationCodeId,
            ItemSpecificationCodeName itemSpecificationCodeName,
            ItemSpecificationCodeContent itemSpecificationCodeContent
    ) {
        return ItemSpecification.from(
                itemSpecificationId.itemSpecificationId,
                itemId.itemId,
                itemSpecificationCodeId.itemSpecificationCodeId,
                itemSpecificationCodeName.itemSpecificationCodeName,
                itemSpecificationCodeContent.itemSpecificationCodeContent
        );
    }



    @Value
    public static class ItemSpecificationId {
         public ItemSpecificationId (Long value) {
                this.itemSpecificationId = value;
        }
        // 아이템 스펙 식별자
        Long itemSpecificationId;
    }

    @Value
    public static class ItemId {
         public ItemId (Long itemId) {
                this.itemId = itemId;
        }
        // 아이템 식별자
        Long itemId;
    }

    @Value
    public static class ItemSpecificationCodeId {
         public ItemSpecificationCodeId (Long itemSpecificationCodeId) {
                this.itemSpecificationCodeId = itemSpecificationCodeId;
        }
        //아이템 스펙 코드 아이디
        Long itemSpecificationCodeId;
    }

    @Value
    public static class ItemSpecificationCodeName {
         public ItemSpecificationCodeName (String itemSpecificationCodeName) {
                this.itemSpecificationCodeName = itemSpecificationCodeName;
        }
        //아이템 스펙 코드 명
        String itemSpecificationCodeName;
    }

    @Value
    public static class ItemSpecificationCodeContent {
         public ItemSpecificationCodeContent (String itemSpecificationCodeContent) {
                this.itemSpecificationCodeContent = itemSpecificationCodeContent;
        }
        //아이템 스펙 코드 내용
        String itemSpecificationCodeContent;
    }
}
