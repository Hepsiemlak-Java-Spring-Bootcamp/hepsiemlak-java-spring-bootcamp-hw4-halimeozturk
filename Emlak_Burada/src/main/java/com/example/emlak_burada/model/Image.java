package com.example.emlak_burada.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
public class Image  extends BaseEntity  implements Serializable {
    private String path;
    private Integer sort;
}
