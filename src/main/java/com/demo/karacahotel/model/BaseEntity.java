package com.demo.karacahotel.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class BaseEntity {

    private LocalDateTime createDate = LocalDateTime.now();
    private LocalDateTime updateDate;
}