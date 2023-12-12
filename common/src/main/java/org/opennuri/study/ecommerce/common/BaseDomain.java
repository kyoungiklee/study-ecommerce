package org.opennuri.study.ecommerce.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


// 모든 도메인의 공통 속성을 정의
// 모든 도메인은 BaseDomain을 상속받아야 한다.
@Getter @Setter
@NoArgsConstructor
public class BaseDomain {
    // 만든자
    private String createdBy;
    // 생성일시
    private LocalDateTime createdDateTime;
    // 수정자
    private String lastModifiedBy;
    // 수정일시
    private LocalDateTime lastModifiedDateTime;

    // 도메인 생성시에는 생성자를 통해 생성일시와 수정일시를 같게 한다.

    public BaseDomain(String createdBy, LocalDateTime createdDateTime, String lastModifiedBy, LocalDateTime lastModifiedDateTime) {
        this.createdBy = createdBy;
        this.createdDateTime = createdDateTime;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDateTime = lastModifiedDateTime;
    }
}
