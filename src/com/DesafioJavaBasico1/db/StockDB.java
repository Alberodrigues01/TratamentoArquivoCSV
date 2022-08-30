package com.DesafioJavaBasico1.db;

import com.DesafioJavaBasico1.models.OrderRequest;
import com.DesafioJavaBasico1.models.Stock;

import java.util.*;

public class StockDB {

    private OrderRequest orderRequest;

    List<Stock> stocks = new ArrayList<>();

   public Integer getStockByCodProduto(OrderRequest orderRequest) {

       for (Stock stock : stocks) {
           if (stock.getCodProduto().equals(orderRequest.getCodigoProduto())) {
               return stock.getQtdStock();
           }
       }
       return stocks.size();
   }
   public void addStock (Stock stock){
       stocks.add(stock);
   }
   public void reduceQuantityInStock(Integer codProduto, Integer quantidade) {
       for (Stock stk : stocks) {
           if (stk.getCodProduto().equals(codProduto)) {
               if (stk.getQtdStock() >= quantidade) {
                   stk.setQtdStock(stk.getQtdStock() - quantidade);
               }
           }
       }
   }
}
