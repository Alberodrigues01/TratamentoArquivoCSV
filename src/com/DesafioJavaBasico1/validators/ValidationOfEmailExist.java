package com.DesafioJavaBasico1.validators;

import com.DesafioJavaBasico1.models.OrderRequest;

public class ValidationOfEmailExist implements IValidatorOfOrderRequest{

    @Override
    public String validation(OrderRequest orderRequest) {
        if(orderRequest.getEmail().isEmpty()){
            return "EMAIL Não Informado - Pedido Não Pode Ser Processado";
        }
        return null;
    }
}
