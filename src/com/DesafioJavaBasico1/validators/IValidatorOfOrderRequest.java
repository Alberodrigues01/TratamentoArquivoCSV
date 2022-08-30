package com.DesafioJavaBasico1.validators;

import com.DesafioJavaBasico1.models.OrderRequest;

public interface IValidatorOfOrderRequest {
    String validation(OrderRequest orderRequest);
}
