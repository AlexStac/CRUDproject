package ru.taxicrud.crudproject.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "city_queue")
@Data
public class CityQueueEntity {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_queue_seq")
    @SequenceGenerator(name = "city_queue_seq", sequenceName = "city_queue_seq", allocationSize = 1)
    private Long cityId;

    @Column(name = "name")
    private String name;

    @Column(name = "queue")
    private String queue;
}
