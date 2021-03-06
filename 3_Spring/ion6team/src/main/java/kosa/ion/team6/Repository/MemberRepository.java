package kosa.ion.team6.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kosa.ion.team6.Domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
	 Optional<Member> findByEmail(String email);
	 //boolean existsByEamil(String email);
}
