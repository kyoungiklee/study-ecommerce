package org.opennuri.study.ecommerce.goods.adapter.out.persistence.goods;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.opennuri.study.ecommerce.common.BaseEntity;

@Entity
@Table(name = "goods")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class GoodsEntity extends BaseEntity {
    // 상품 식별자
    @Id
    @GeneratedValue
    private Long goodsId;
    // 상품 코드
    private String goodsCode;
    // 상품 이름
    private String goodsName;

    // 상품 구분 (단품, 묶음, 1+1, 지류(쿠폰), 무형 등)
    private String goodsType;

    // 상품 브랜드
    private String goodsBrand;
    // 상품 검색 예약어
    private String goodsSearchKeyword;
    // 상품 판매 가격
    private Long goodsSalePrice;


    // 상품 할인가
    private Long goodsDiscountPrice;
    // 상품 할인 적용 여부
    private Boolean isItemOnDiscount;
    // 상품 할인율 적용 여부
    private Boolean isItemDiscountRate;
    // 상품 할인 시작 일시
    private String itemOnDiscountStartDateTime;
    // 상품 할인 종료 일시
    private String itemOnDiscountEndDateTime;

    // 상품 적립금
    private Long goodsPoint;

    // 성인상품 포함 여부
    private Boolean isGoodsAdult;


    // 상품 전시 여부
    private Boolean IsGoodsOnDisplay;
    // 전시 시작 일시
    private String goodsOnDisplayStartDateTime;
    // 전시 종료 일시
    private String goodsOnDisplayEndDateTime;

    // 아이템 전시 카테고리
    //private GoodsDisplayCategory itemDisplayCategory;

    // 상품 전시 이미지들
    //private List<GoodsDisplayImage> goodsDisplayImages;
}
