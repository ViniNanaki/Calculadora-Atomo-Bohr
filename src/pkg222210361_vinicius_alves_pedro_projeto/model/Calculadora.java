/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210361_vinicius_alves_pedro_projeto.model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Classe com as funções que realizam os demais calculos.
 * @author vinic
 */
public class Calculadora {
    
    /**
     * Função que estabelece o formato ideal para a exibição da função de onda.
     * @param number
     * @return 
     */
    public String conversorDecimal(double number) {
        NumberFormat numFormat = new DecimalFormat();
        numFormat = new DecimalFormat("0.#####E0");

        return numFormat.format(number).replace(",", ".");
    }
    
    /**
     * Função que recebe os níveis de energia (inicial e final), e retorna a energia do Fóton.
     * @param Eni
     * @param Enf
     * @return 
     */
    public double energiaFoton(double Eni, double Enf) {
        return Math.abs(Enf - Eni);
    }
    
    /**
     * Função que recebe a energia do Fóton e retorna sua frequência.
     * @param energiaFoton
     * @return 
     */
    public double frequenciaFoton(double energiaFoton) {
        return energiaFoton / Constantes.planckEv.getValue();
    }
    
    /**
     * Função que recebe frequência do Fóton e retorna seu comprimento de onda.
     * @param freq
     * @return 
     */
    public double comprimentoFoton(double freq) {
        return Constantes.velocidadeLuz.getValue() / freq;
    }
    
    /**
     * Função que recebe a largura do poço, o Nível Inicial, e os limites, e retorna a probabilidade para o Nível Inicial.
     * @param larguraPoco
     * @param ni
     * @param a
     * @param b
     * @return 
     */
    public String probabilidadeNi(double larguraPoco, double ni, double a, double b) {
        double x = (2 / larguraPoco) * (((larguraPoco * Math.sin((2 * Math.PI * a * ni) / larguraPoco) - (2 * Math.PI * a * ni)) / (4 * Math.PI * ni)) - (((larguraPoco * Math.sin((2 * Math.PI * b * ni) / larguraPoco) - (2 * Math.PI * b * ni)) / (4 * Math.PI * ni))));
        return "P(" + conversorDecimal(a) + " <= x <= " + conversorDecimal(b) + ") = " + conversorDecimal((x * 100));
    }
    
    /**
     * Função que recebe a largura do poço, o Nível Final, e os limites, e retorna a probabilidade para o Nível Final.
     * @param larguraPoco
     * @param nf
     * @param a
     * @param b
     * @return 
     */
    public String probabilidadeNf(double larguraPoco, double nf, double a, double b) {
        double x = (2 / larguraPoco) * (((larguraPoco * Math.sin((2 * Math.PI * a * nf) / larguraPoco) - (2 * Math.PI * a * nf)) / (4 * Math.PI * nf)) - (((larguraPoco * Math.sin((2 * Math.PI * b * nf) / larguraPoco) - (2 * Math.PI * b * nf)) / (4 * Math.PI * nf))));
        return "P(" + conversorDecimal(a) + " <= x <= " + conversorDecimal(b) + ") = " + conversorDecimal((x * 100));
    }
    
    /**
     * Função que recebe a largura do poço e o Nível Inicial, e retorna a Função de Onda do Nível Inicial.
     * @param largura
     * @param ni
     * @return 
     */
    public String funcaoOndaNi(double largura, int ni) {
        double fracao = Math.sqrt(2 / largura);
        double angulo = (ni * Math.PI) / largura;
        return "𝜓(x) = " + conversorDecimal(fracao) + "* sen(" + conversorDecimal(angulo) + "* x)";
    }
    
    /**
     * Função que recebe a largura do poço e o Nível Inicial, e retorna a Função de Onda do Nível Inicial.
     * @param largura
     * @param nf
     * @return 
     */
    public String funcaoOndaNf(double largura, int nf) {
        double fracao = Math.sqrt(2 / largura);
        double angulo = (nf * Math.PI) / largura;
        return "𝜓(x) = " + conversorDecimal(fracao) + "* sen(" + conversorDecimal(angulo) + "* x)";
    }
}
