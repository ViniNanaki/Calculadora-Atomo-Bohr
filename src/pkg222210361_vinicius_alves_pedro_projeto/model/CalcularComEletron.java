/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210361_vinicius_alves_pedro_projeto.model;

/**
 * Classe com as funções dos calculos usando confinamento do Eletron.
 * @author vinic
 */
public class CalcularComEletron extends Calculadora {
    
    public CalcularComEletron() {
        super();
    }
    
    /**
     * Função que recebe o Nivel Inicial e a largura do poço, e retorna a energia no Nivel Inicial.
     * @param ni
     * @param largura
     * @return 
     */
    public double energiaEletronNi(int ni, double largura) {
        return Math.pow(ni, 2) * (Math.pow(Constantes.planckJ.getValue(), 2) / (8 * Constantes.AEletron.getValue() * Math.pow(largura, 2)));
    }
    
    /**
     * Função que recebe o Nivel Final e a largura do poço, e retorna a energia no Nivel Final.
     * @param nf
     * @param largura
     * @return 
     */
    public double energiaEletronNf(int nf, double largura) {
        return Math.pow(nf, 2) * (Math.pow(Constantes.planckJ.getValue(), 2) / (8 * Constantes.AEletron.getValue() * Math.pow(largura, 2)));
    }
    
    /**
     * Função que recebe a energia no Nivel Inicial (Anteriormente em Joules), e a retorna conveertida para Elétron-volt.
     * @param energiaEletronNi
     * @return 
     */
    public double energiaEletronEv(double energiaEletronNi) {
        return energiaEletronNi / (1.602e-19);
    }
    
    /**
     * Função que recebe a energia dos níveis, e retorna o comprimento de onda.
     * @param E
     * @return 
     */
    public double comprimentoOnda(double E) {
        return Constantes.planckJ.getValue() / Math.sqrt((2 * Constantes.AEletron.getValue() * E));
    }
    
    /**
     * Função que recebe a energia dos níveis, e retorna a velocidade.
     * @param E
     * @return 
     */
    public double velocidade(double E) {
        return Math.sqrt((E * 2) / Constantes.AEletron.getValue());
    }
}
