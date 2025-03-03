package Dev.BackEndLab.domain.member.repository;

import Dev.BackEndLab.domain.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberReposiroty extends JpaRepository<Member, Long> {
}
