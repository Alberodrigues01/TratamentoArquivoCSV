package com.DesafioJavaBasico1.validators;

import com.DesafioJavaBasico1.models.OrderRequest;

public class ValidationOfNameExist implements IValidatorOfOrderRequest {

    @Override
    public String validation(OrderRequest orderRequest) {
     if(orderRequest.getNome().isEmpty()){
         return "NOME Não Informado - Pedido Não Pode Ser Processado";
     }
     return null;
   }
}
