package org.opennuri.study.ecommerce.goods.adapter.out.persistence.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.opennuri.study.ecommerce.common.BaseEntity;

@Entity
@Table(name = "item_classification_code")
@Getter @Setter
@EqualsAndHashCode(callSuper = false)
public class ItemClassificationJpaEntity extends BaseEntity {

    @Id
    @GeneratedValue
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
    // 아이템 분류 코드 설명
    private  String itemClassCodeDescription;
    
    
}
