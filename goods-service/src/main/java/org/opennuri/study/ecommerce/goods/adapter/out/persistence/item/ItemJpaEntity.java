package org.opennuri.study.ecommerce.goods.adapter.out.persistence.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.opennuri.study.ecommerce.common.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ItemJpaEntity extends BaseEntity {
    // 아이템 식별자
    @Id
    @GeneratedValue
    private Long itemId;
    // 아이템 코드
    private String itemCode;
    // 아이템 이름
    private String itemName;
    // 아이템 브랜드
    private String itemBrand;

    // 아이템 판매 최소 갯수 (최소 주문 수량) 1 -> 기본값
    private Long itemMinimumOrderQuantity;

    // 아이템 판매 최대 갯수 (최대 주문 수량) 0 -> 무제한
    private Long itemMaximumOrderQuantity;

    // 아이템 판매 여부 (판매, 판매중지) 판매 -> 기본값
    private Boolean isItemOnSale;
    // 아이템 판매 상태(판매중, 판매중지, 품절 등) 판매중 -> 기본값
    private String itemSalesStatus;

    // 아이템 면세 여부 (과세, 면세) 과세 -> 기본값
    private Boolean isItemTaxable;

    // 성인 아이템 여부 (전체, 성인) 전체 -> 기본값
    private Boolean isItemAdult;

    // 아이템 판매 가능 수량 (재고 수량) 0 -> 기본값 재고수량이 0인 경우 품절로 처리(안전재고가 우선 적용됨)
    private Long itemAvailableStock;
    // 아이템 안전 재고 수량 (안전재고 수량이하인 경우 재고 부족으로 품절로 처리) 0 -> 기본값
    private Long itemSafetyStock;

    // 아이템 판매 방식(일반(배송), 예약, 방문설치 등) 일반(배송) -> 기본값
    private String itemSalesMethod;

    // 아이템 판매 승인자 아이디
    private String itemSalesApproverId;
    // 아이템 판매 승인 일시
    private LocalDateTime itemSalesApprovedDateTime;
    // 아이템 판매 승인 여부
    private Boolean isItemSalesApproved;

    // 아이템 판매 시작 일시
    // 아이템 판매 시작 일시는 아이템이 판매가 시작되는 일시를 의미한다.
    // 아이템 판매 여부 값이 판매중 이더라도 아이템 판매 시작 일시가 지나지 않으면 판매가 시작되지 않는다.
    private LocalDateTime itemOnSaleStartDateTime;
    // 아이템 판매 종료 일시
    private String itemOnSaleEndDateTime;

    // 아이템 할인 비율(할인율)
    private Long itemDiscountRate;
    // 아이템 소싱 채널
    private String itemSourcingChannel;

    //자사 매입 상품
    private  Boolean isItemPurchasedByOwnCompany;

    // 아이템 판매 채널
    private  String itemSalesChannel;
}
