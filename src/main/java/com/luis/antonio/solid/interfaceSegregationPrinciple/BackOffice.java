package com.luis.antonio.solid.interfaceSegregationPrinciple;

public class BackOffice implements IGerarRelatorioDeVendasExcel,IGerarRelatorioDeVendasPDF{
    @Override
    public void gerarExcel() {
        System.out.println("gerar excel");
    }

    @Override
    public void gerarPdf() {
        System.out.println("gera! pdf");
    }
}
