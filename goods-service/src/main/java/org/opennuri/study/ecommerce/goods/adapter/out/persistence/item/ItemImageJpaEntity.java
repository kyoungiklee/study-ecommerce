package org.opennuri.study.ecommerce.goods.adapter.out.persistence.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.opennuri.study.ecommerce.common.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "item_image")
@Data
public class ItemImageJpaEntity extends BaseEntity {
    // 아이템 이미지 식별자
    @Id
    @GeneratedValue
    private  Long itemImageId;
    // 아이템 식별자
    private  Long itemId;
    // 아이템 이미지 전시 순서
    private  Integer itemImageDisplayOrder;
    // 아이템 이미지 URL
    private  String itemImageUrl;
    // 아이템 이미지 명
    private  String itemImageName;
    // 아이템 이미지 설명 (alt text로 사용됨)
    private  String itemImageDescription;

    // 레코드 생성자
    private  String createdBy;
    // 레코드 생성 일시
    private  LocalDateTime createdDateTime;
    // 레코드 마지막 수정자
    private  String lastModifiedBy;
    // 레코드 마지막 수정 일시
    private  LocalDateTime lastModifiedDateTime;

}
