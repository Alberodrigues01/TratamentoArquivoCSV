package com.DesafioJavaBasico1.validators;

import com.DesafioJavaBasico1.models.OrderRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorOfOrderRequest extends Validator {

    private OrderRequest orderRequest;

    private Integer codProduto;

    public List<IValidatorOfOrderRequest> validatorsOfOrderRequest = new ArrayList<>();

    public ValidatorOfOrderRequest(OrderRequest orderRequest) {

        this.orderRequest = orderRequest;
        this.validatorsOfOrderRequest.add(new ValidationOfNameExist());
        this.validatorsOfOrderRequest.add(new ValidationOfEmailExist());
        this.validatorsOfOrderRequest.add(new ValidationOfProductCodeExist());
        this.validatorsOfOrderRequest.add(new ValidationOfQuantityRequest());
    }

    @Override
    public boolean ehValid() {
        for (IValidatorOfOrderRequest validatorOfOrderRequest : validatorsOfOrderRequest) {
            String error = validatorOfOrderRequest.validation(orderRequest);

            if (error != null) {
                addErrors(error);
            }
        }
        return !(getErrors().size() > 0);
    }

}
