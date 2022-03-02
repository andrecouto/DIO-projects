package com.dio.base;

import java.math.BigDecimal;

/**
@author André Couto
@version 1.0.0
@see BigDecimal
@since Release 1.0.0
 */
public class Order {

    //comentário
    private final String code;
    private final BigDecimal totalValue;

    /**
    Construtor da Classe

    @param code        Código do pedido
    */
    public Order(String code){
        this.code = code;
    }
    /**
    Construtor da Classe

    @param code        Código do pedido
    @param totalValue  Valor total do pedido
    */
    public Order(String code, BigDecimal totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }
    /*
    comentário em bloco
    (com mais de 1 linha)
     */
    public String toString(){
        return "Order=(" +
                "code='" + code + "'" +
                ")";
    }

    /**
    Calcula as taxas de acordo com o valor total do pedido.Se o valor for maior que R$100,00 uma taxa será cobrada.

    @return Valor total do pedido com as taxas calculadas
    @throws RuntimeException Se o pedido for um valor negativo
     */
    public BigDecimal calculateFrete() throws RuntimeException {
        if(this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido não pode ter valor negativo");
        }
        if(this.totalValue.compareTo(new BigDecimal("100.00")) > 100){
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }
}