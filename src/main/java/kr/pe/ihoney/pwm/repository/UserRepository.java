package kr.pe.ihoney.pwm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.pe.ihoney.pwm.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
