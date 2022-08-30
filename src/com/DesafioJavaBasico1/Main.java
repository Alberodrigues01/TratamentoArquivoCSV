package com.DesafioJavaBasico1;

import com.DesafioJavaBasico1.db.StockDB;
import com.DesafioJavaBasico1.models.OrderRequest;
import com.DesafioJavaBasico1.models.Stock;
import com.DesafioJavaBasico1.validators.ValidatorOfOrderRequest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Stock stock = new Stock();

    static StockDB stockDB = new StockDB();

    public static void main(String[] args) {

        Integer codProduto;
        Integer qtdStock;

        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Informe ESTOQUE do Produto-1 => ");
        codProduto = 1;
        qtdStock = scan.nextInt();
        Stock stockProd1 = new Stock(codProduto, qtdStock);
        stockDB.addStock(stockProd1);

        System.out.print("Informe ESTOQUE do Produto-2 => ");
        codProduto = 2;
        qtdStock = scan.nextInt();
        Stock stockProd2 = new Stock(codProduto, qtdStock);
        stockDB.addStock(stockProd2);

        String path = "C:\\MENTORAMA\\JAVA BASICO_Desafios\\TratamentoArquivoCSV\\pedidos.csv";

        System.out.println(" ");
        System.out.println("PEDIDOS DE VENDA: ");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] vect = line.split(",");
                String Nome = vect[0];
                String Email = vect[1];
                Integer CodigoProduto = Integer.valueOf(vect[2]);
                Integer QtdVendida = Integer.valueOf(vect[3]);

                OrderRequest orderRequest = new OrderRequest(Nome, Email, CodigoProduto, QtdVendida, stock);
                System.out.println("============================================================================================");
                System.out.println(orderRequest);

                ValidatorOfOrderRequest vld = new ValidatorOfOrderRequest(orderRequest);

                if (vld.ehValid()) {
                    stockDB.reduceQuantityInStock(CodigoProduto, QtdVendida);
                    System.out.println("Estoque do Produto:  " + stockDB.getStockByCodProduto(orderRequest));
                } else {
                    System.out.println(vld.getErrors());
                }

            line = br.readLine();
            }
        }
        catch (IOException e){
        System.out.println("Error:" + e.getMessage());
        }
    }
}
