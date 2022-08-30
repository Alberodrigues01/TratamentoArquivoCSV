package com.DesafioJavaBasico1.validators;

import com.DesafioJavaBasico1.models.OrderRequest;

public class ValidationOfProductCodeExist implements IValidatorOfOrderRequest{

    @Override
    public String validation(OrderRequest orderRequest) {
        if (orderRequest.getCodigoProduto().describeConstable().isEmpty()){
            return "Nome Não Informado - Pedido Não Pode Ser Processado";
        }
        return null;
    }

}
