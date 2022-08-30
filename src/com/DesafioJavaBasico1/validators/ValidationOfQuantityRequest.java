package com.DesafioJavaBasico1.validators;

import com.DesafioJavaBasico1.db.StockDB;
import com.DesafioJavaBasico1.models.OrderRequest;


public class ValidationOfQuantityRequest implements IValidatorOfOrderRequest{

    private StockDB stockDB;

   @Override
   public String validation(OrderRequest orderRequest) {
 //    if(orderRequest.getQtdVendida() > stockDB.getStockByCodProduto(orderRequest){
       if (orderRequest.getQtdVendida() > orderRequest.getStock().getQtdStock()) {
           return "QUANTIDADE pedida maior que Estoque  - Pedido Não Pode Ser Processado";
           }
           return null;
   }
}
