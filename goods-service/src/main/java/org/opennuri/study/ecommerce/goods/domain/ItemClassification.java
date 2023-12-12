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
    private  Long itemClassificationCodeId;

    // 아이템 parent 코드
    private  String itemClassCodeParent;

    // 아이템 child 코드
    private  String itemClassCodeChild;

    // 아이템 분류 코드 depth
    private  Integer itemClassCodeDepth;

    // 아이템 분류 코드 명
    private  String itemClassCodeName;

    // 생성자
    private  String createdBy;
    // 생성 일시
    private  LocalDateTime createdDateTime;
    // 수정자
    private  String lastModifiedBy;
    // 수정 일시
    private  LocalDateTime lastModifiedDateTime;

}
