package ru.taxicrud.crudproject.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "taxi_drive_info")
@Data
public class TaxiDriverInfoEntity {
    @Id
    @Column(name = "driver_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taxi_driver_seq")
    @SequenceGenerator(name = "taxi_driver_seq", sequenceName = "taxi_driver_seq", allocationSize = 1)
    private Long driverId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "level")
    private int level;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "create_dttm")
    private Date createDttm;
}
