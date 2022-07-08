package com.github.fabriciolfj.customerservice.interfaceadapter.repository.data;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class CustomerData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(name = "document")
    private String document;
    @Column(name = "code")
    private String code;
    @Column(name = "phone")
    private String phone;
    @Column(name = "name")
    private String name;
}
