package org.opennuri.study.ecommerce.goods.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 * 아이템의 옵션 정보를 관리한다.
 * 옵션은 (색상 : 빨강, 사이즈 : 100, 치수: 95, 100, 105 등 )으로 표현된다.
 * 아이템은 옵션을 가지고 있으며, 옵션은 옵션값을 가지고 있다.
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE, staticName = "from")
public class ItemOption {

    /**
     * 아이템 옵션 식별자
     */
    private final Long goodsOptionId;
    /**
     * 아이템 식별자
     * 아이템은 여러 옵션을 가질 수 있다.
     */
    private final Long itemId;

    /**
     * 아이템 옵션 코드
     * 아이템 옵션 순번으로 아이템은 여러 옵션을 가질 수 있다.
     * 예로 색상, 사이즈, 치수 등이 있다. 옷의 경우 색상, 사이즈를 옵션으로 가질수 있으며 itemOptionSeq로  1, 2등으로 관리한다.
     *
     */
    // 아이템 옵션 순번
    private final Long itemOptionSeq;
    /**
     * 아이템 옵션 코드
     * 아이템 옵션 코드는 아이템옶션의 key값이다.
     * 색상의 경우 RED, BLUE, GREEN 등이다.
     */
    // 아이템 옵션 코드
    private final String itemOptionKey;
    /**
     * 아이템 옵션명
     * 아이템 옵션명은 아이템옵션의 value값이다.
     * 색상의 경우 빨강, 파랑, 초록 등이다.
     */
    // 아이템 옵션명
    private final String itemOptionValue;
    /**
     * 아이템 옵션 순서
     * 아이템 옵션 순서는 아이템 옵션의 순서를 나타낸다.
     * 예를 들어 색상의 경우 빨강, 파랑, 초록 순서로 정렬된다.
     */
    // 아이템 옵션 순서
    private final Long itemOptionOrder;
}
