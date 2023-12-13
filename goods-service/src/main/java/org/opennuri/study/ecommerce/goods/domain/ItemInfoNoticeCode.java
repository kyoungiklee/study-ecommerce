package org.opennuri.study.ecommerce.goods.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 상품정보공시제도 코드
 * 전자상거래법(전자상거래 등에서의 소비자보호에 관한 법률)제13조 제4항에 따라,
 * 통신판매업자가 소비자에게 제공해야 하는 품목별 상품정보, 거래 조건 내용과 제공 방법 등을 구체적으로 표기해야 하는 필수 정보입니다
 *
 * 상품정보공시제도 코드는 상품정보공시제도 코드 타입, 상품정보공시제도 코드, 상품정보공시제도 코드 이름, 상품정보공시제도 코드 설명,
 * 상품정보공시제도 코드 사용여부, 상품정보공시제도 코드 정렬순번으로 구성된다.
 *
 * 상품정보공시제도 코드 타입은 아래와 같이 관리한다.
 * 1. 의류
 * 2. 구두/신발
 * 3. 가방
 * 4. 패션잡화 (모자/벨트/액세서리)
 * 5. 침구류/커튼
 * 6. 가구 (침대/소파/싱크대/DIY제품)
 * 7. 영상가전 (TV류)
 * 8. 가정용 전기제품 (냉장고/세탁기/식기세척기/전자레인지)
 * 9. 계절가전 (에어컨/온풍기)
 * 10. 사무용기기 (컴퓨터/노트북/프린터)
 * 11. 광학기기 (디지털카메라/캠코더)
 * 12. 소형전자 (MP3/전자사전 등)
 * 13. 휴대폰
 * 14. 내비게이션
 * 15. 자동차용품 (자동차부품/기타 자동차용품)
 * 16. 의료기기
 * 17. 주방용품
 * 18. 화장품
 * 19. 귀금속/보석/시계류
 * 20. 식품 (농수산물)
 * 21. 가공식품
 * 22. 건강기능식품
 * 23. 영유아용품
 * 24. 악기
 * 25. 스포츠용품
 * 26. 서적
 * 27. 호텔/펜션 예약
 * 28. 여행패키지
 * 29. 항공권
 * 30. 자동차 대여 서비스 (렌터카)
 * 31. 물품대여 서비스 (정수기, 비데, 공기청정기 등)
 * 32. 물품대여 서비스 (서적, 유아용품, 행사용품 등)
 * 33. 디지털 콘텐츠 (음원, 게임, 인터넷강의 등)
 * 34. 상품권/쿠폰
 * 35. 모바일 쿠폰
 * 36. 영화/공연
 * 37. 기타 용역
 * 38. 기타 재화
 * 위의 항목을 참고하여 상품정보공시제도 코드 타입을 관리한다.
 *
 * 상품정보공시제도 코드는 아래와 같이 관리한다.
 * 의류의 경우
 * -제품 소재
 * 섬유의 조성 또는 혼용률을 백분율로 표시, 기능성인 경우 성적서 또는 허가서
 * -색상
 * -치수
 * -제조자
 * 수입품의 경우 수입자를 함께 표기 (병행수입의 경우 병행수입 여부로 대체 가능)
 * -제조국
 * -세탁방법 및 취급시 주의사항
 * -제조연월
 * -품질보증기준
 * 예) 관련법 및 소비자분쟁해결 규정에 따름
 * -A/S 책임자와 전화번호
 * 담당자 이름 표기가 어려울 경우, 업체명 표기
 *
 */
@AllArgsConstructor(staticName = "from", access = AccessLevel.PRIVATE)
@Getter
public class ItemInfoNoticeCode {
    // 상품정보공시제도 코드 id
    private Long itemInfoNoticeCodeId;
    // 상품정보공시제도 코드 타입
    private final String itemInfoNoticeCodeType;
    // 상품정보공시제도 코드
    private final String infoNoticeCodeNumber;
    // 상품정보공시제도 코드 이름
    private final String infoNoticeCodeName;
    // 상품정보공시제도 코드 설명
    private final String infoNoticeCodeDescription;
    // 상품정보공시제도 코드 사용여부
    private final Boolean isInfoNoticeCodeUsed;
    // 상품정보공시제도 코드 정렬순번
    private final Long infoNoticeCodeOrder;

    // ItemInfoNoticeCode 생성자 만들기
    public static ItemInfoNoticeCode getInstance(
            ItemInfoNoticeCode.ItemInfoNoticeCodeId itemInfoNoticeCodeId,
            ItemInfoNoticeCode.ItemInfoNoticeCodeType itemInfoNoticeCodeType,
            ItemInfoNoticeCode.InfoNoticeCodeNumber infoNoticeCodeNumber,
            ItemInfoNoticeCode.InfoNoticeCodeName infoNoticeCodeName,
            ItemInfoNoticeCode.InfoNoticeCodeDescription infoNoticeCodeDescription,
            ItemInfoNoticeCode.IsInfoNoticeCodeUsed isInfoNoticeCodeUsed,
            ItemInfoNoticeCode.InfoNoticeCodeOrder infoNoticeCodeOrder
    ) {
        return ItemInfoNoticeCode.from(
                itemInfoNoticeCodeId.itemInfoNoticeCodeId,
                itemInfoNoticeCodeType.itemInfoNoticeCodeType,
                infoNoticeCodeNumber.infoNoticeCodeNumber,
                infoNoticeCodeName.infoNoticeCodeName,
                infoNoticeCodeDescription.infoNoticeCodeDescription,
                isInfoNoticeCodeUsed.isInfoNoticeCodeUsed,
                infoNoticeCodeOrder.infoNoticeCodeOrder
        );
    }

    public record ItemInfoNoticeCodeId(Long itemInfoNoticeCodeId) {}
    public record ItemInfoNoticeCodeType(String itemInfoNoticeCodeType) {}
    public record InfoNoticeCodeNumber(String infoNoticeCodeNumber) {}
    public record InfoNoticeCodeName(String infoNoticeCodeName) {}
    public record InfoNoticeCodeDescription(String infoNoticeCodeDescription) {}
    public record IsInfoNoticeCodeUsed(Boolean isInfoNoticeCodeUsed) {}
    public record InfoNoticeCodeOrder(Long infoNoticeCodeOrder) {}
}
