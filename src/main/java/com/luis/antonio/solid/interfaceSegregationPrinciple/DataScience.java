package com.luis.antonio.solid.interfaceSegregationPrinciple;

public class DataScience implements IGerarRelatorioDeVendasExcel {
    @Override
    public void gerarExcel() {
        System.out.println("gerar excel");
    }

    //violação
//    @Override
//    public void gerarPdf() {
//        System.out.println("não utiliza, ");
//    }
}
