package Dev.BackEndLab.domain.member;

import Dev.BackEndLab.domain.common.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
}
