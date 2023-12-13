package org.opennuri.study.ecommerce.goods.adapter.out.persistence.goods;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.opennuri.study.ecommerce.common.BaseEntity;

@Getter @Setter
@Entity
@Table(name = "display_category")
@EqualsAndHashCode(callSuper = false)
public class DisplayCategoryEntity extends BaseEntity {

    @Id
    @GeneratedValue
    // 전시 카테고리 ID
    private Long displayCategoryId;
    // 전시 카테고리 parent 코드
    private String displayCategoryParentCode;
    // 전시 카테고리 child 코드
    private String displayCategoryChildCode;
    // 전시 카테고리 이름
    private String displayCategoryName;

    // 전시 카테고리 설명(전시 카테고리에 대한 설명 alt text)
    private String displayCategoryDescription;
    // 전시 카테고리 전시 순서
    private Long displayCategoryOrder;
    // 전시 카테고리 이미지URL
    private String displayCategoryImageUrl;
    // 전시 카테고리 전시 여부
    private Boolean isDisplayCategoryOnDisplay;
}
