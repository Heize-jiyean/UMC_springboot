package umc.spring.domain.enums.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.base.BaseEntity;
import umc.spring.domain.Member;           // 추가
import umc.spring.domain.FoodCategory;     // 추가

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberPrefer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Member와의 관계 추가
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    // FoodCategory와의 관계 추가
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private FoodCategory foodCategory;
}