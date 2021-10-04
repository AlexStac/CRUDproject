package ru.taxicrud.crudproject.model;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "car")
@Data
public class CarEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_seq")
    @SequenceGenerator(name = "car_seq", sequenceName = "car_seq", allocationSize = 1)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "createdttm")
    @CreationTimestamp
    private Date createDttm;
}
