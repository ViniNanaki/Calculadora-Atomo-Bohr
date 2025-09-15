/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210361_vinicius_alves_pedro_projeto.model;

/**
 * Classe com as funções dos calculos usando confinamento do Proton.
 * @author vinic
 */
public class CalcularComProton extends Calculadora {

    public CalcularComProton() {
        super();
    }
    
    /**
     * Função que recebe o Nivel Inicial e a largura do poço, e retorna a energia no Nivel Inicial.
     * @param ni
     * @param largura
     * @return 
     */
    public double energiaProtonNi(int ni, double largura) {
        return Math.pow(ni, 2) * (Math.pow(Constantes.planckJ.getValue(), 2) / (8 * Constantes.AProton.getValue() * Math.pow(largura, 2)));
    }
    
    /**
     * Função que recebe o Nivel Final e a largura do poço, e retorna a energia no Nivel Final.
     * @param nf
     * @param largura
     * @return 
     */
    public double energiaProtonNf(int nf, double largura) {
        return Math.pow(nf, 2) * (Math.pow(Constantes.planckJ.getValue(), 2) / (8 * Constantes.AProton.getValue() * Math.pow(largura, 2)));
    }
    
    /**
     * Função que recebe a energia no Nivel Inicial (Anteriormente em Joules), e a retorna conveertida para Elétron-volt.
     * @param energiaProtonNi
     * @return 
     */
    public double energiaProtonEv(double energiaProtonNi) {
        return energiaProtonNi / (1.602e-19);
    }
    
    /**
     * Função que recebe a energia dos níveis, e retorna o comprimento de onda.
     * @param E
     * @return 
     */
    public double comprimentoOnda(double E) {
        return Constantes.planckJ.getValue() / Math.sqrt((2 * Constantes.AProton.getValue() * E));
    }
    
    /**
     * Função que recebe a energia dos níveis, e retorna a velocidade.
     * @param E
     * @return 
     */
    public double velocidade(double E) {
        return Math.sqrt((E * 2) / Constantes.AProton.getValue());
    }
}
