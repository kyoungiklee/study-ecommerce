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
@Table(name = "item_info_notice_code")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ItemInfoNoticeCodeJpaEntity extends BaseEntity {

    @Id
    @GeneratedValue
    // 상품정보공시제도 코드 id
    private Long itemInfoNoticeCodeId;
    // 상품정보공시제도 코드 타입
    private String itemInfoNoticeCodeType;
    // 상품정보공시제도 코드
    private String infoNoticeCodeNumber;
    // 상품정보공시제도 코드 이름
    private String infoNoticeCodeName;
    // 상품정보공시제도 코드 설명
    private String infoNoticeCodeDescription;
    // 상품정보공시제도 코드 사용여부
    private Boolean isInfoNoticeCodeUsed;
    // 상품정보공시제도 코드 정렬순번
    private Long infoNoticeCodeOrder;

}
