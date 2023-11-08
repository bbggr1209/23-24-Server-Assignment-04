package com.gdsc.ordersystem.controller.dto.request.product;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductNameUpdateRequestDto {
    @NotBlank
    private String name;
}
