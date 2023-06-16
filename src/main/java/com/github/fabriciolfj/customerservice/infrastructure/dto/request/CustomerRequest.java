package com.github.fabriciolfj.customerservice.infrastructure.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerRequest {

    @CPF(message = "{customer.document}")
    private String document;
    @NotBlank(message = "{customer.phone}")
    private String phone;
    @NotBlank(message = "{customer.name}")
    private String name;
}
