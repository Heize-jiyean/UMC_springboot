package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import umc.spring.domain.common.base.BaseEntity;
import java.util.ArrayList;
import java.util.List;
import umc.spring.domain.enums.mapping.MemberMission;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer reward;
    private LocalDate deadline;
    private String missionSpec;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();
}