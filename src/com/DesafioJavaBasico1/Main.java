package com.DesafioJavaBasico1;

import com.DesafioJavaBasico1.entities.OrderRequest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer StockProd_1;
        Integer StockProd_2;

        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Informe ESTOQUE do Produto-1 => ");
        StockProd_1 = scan.nextInt();


        System.out.print("Informe ESTOQUE do Produto-2 => ");
        StockProd_2 = scan.nextInt();


        String path = "c:\\MENTORAMA\\JAVA BASICO_Desafios\\TratamentoArquivoCSV\\pedidos.csv";

        List<OrderRequest> orders = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] vect = line.split(",");
                String Nome = vect[0];
                String Email = vect[1];
                Integer CodigoProduto = Integer.valueOf(vect[2]);
                Integer QtdVendida = Integer.valueOf(vect[3]);

                OrderRequest ord = new OrderRequest(Nome, Email, CodigoProduto, QtdVendida);
                orders.add(ord);

                line = br.readLine();
            }
            System.out.println(" ");
            System.out.println("PEDIDOS DE VENDA: ");
            for (OrderRequest o : orders) {
                System.out.println("============================================================================================");
                System.out.println(o);

                if (o.getNome().isBlank()) {
                    System.out.println("NOME não Informado no Pedido de Venda.");
                    System.out.println("Pedido de Venda NÃO PODE SER PROCESSADO !");
                    }
                    else if (o.getEmail().isBlank()) {
                        System.out.println("EMAIL não Informado no Pedido de Venda.");
                        System.out.println("Pedido de Venda NÃO PODE SER PROCESSADO !");
                    }
                    else if (o.getCodigoProduto() == null) {
                         System.out.println("CÓDIGO DO PRODUTO não informado no Pedido de Venda.");
                         System.out.println("Pedido de Venda NÃO PODE SER PROCESSADO !");
                    }
                    else if ((o.getCodigoProduto() < 1) && (o.getCodigoProduto() < 2)) {
                         System.out.println("CÓDIGO DO PRODUTO não é válido no Pedido de Venda.");
                         System.out.println("Pedido de Venda NÃO PODE SER PROCESSADO !");
                    }
                    else if (o.getQtdVendida() <= 0) {
                         System.out.println("QUANTIDADE do pedido inválida no Pedido de Venda.");
                         System.out.println("Pedido de Venda NÃO PODE SER PROCESSADO !");
                    }
                    else
                         if (o.getCodigoProduto() == 1) {
                           if (StockProd_1 >= o.getQtdVendida()) {
                               StockProd_1 -= o.getQtdVendida();
                               System.out.println("PEDIDO DE VENDA PROCESSADO PARA PRODUTO-1");
                               System.out.println("QUANTIDADE VENDIDA: " + o.getQtdVendida() + "  -  ESTOQUE PRODUTO-1 : " + StockProd_1);
                               } else {
                               System.out.println("PEDIDO DE VENDA NÃO PROCESSADO !");
                               System.out.println("ESTOQUE insuficiente para a quantidade pedida: " + o.getQtdVendida());
                               System.out.println("ESTOQUE PRODUTO-1 : " + StockProd_1);

                               }
                           }
                         else if (o.getCodigoProduto() == 2) {
                           if (StockProd_2 >= o.getQtdVendida()) {
                               StockProd_2 -= o.getQtdVendida();
                               System.out.println("PEDIDO DE VENDA PROCESSADO PARA PRODUTO-2");
                               System.out.println("QUANTIDADE VENDIDA: " + o.getQtdVendida() + "  -  ESTOQUE PRODUTO-2: " + StockProd_2);
                           } else {
                               System.out.println("PEDIDO DE VENDA NÃO PROCESSADO !");
                               System.out.println("ESTOQUE insuficiente para a quantidade pedida: " + o.getQtdVendida());
                               System.out.println("ESTOQUE PRODUTO-2: " + StockProd_2);
                           }

                         }
                    }

               }
        catch (IOException e){
        System.out.println("Error:" + e.getMessage());
        }
    }
}
