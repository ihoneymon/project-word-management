package kr.pe.ihoney.pwm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 용어
 * @author jiheon
 *
 */
@Entity
public class Word {
    @Id
    @GeneratedValue
    private Long id;
}
