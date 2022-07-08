package com.github.fabriciolfj.customerservice.infrastructure.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerRequest {

    private String document;
    private String phone;
    private String name;
}
