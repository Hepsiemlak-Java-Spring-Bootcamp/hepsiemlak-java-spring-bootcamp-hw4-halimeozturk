package com.example.emlak_burada.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MessageFilterDTO extends BaseEntityDTO {
    private UserDTO sender;
    private UserDTO receiver;
    private String content;
}
