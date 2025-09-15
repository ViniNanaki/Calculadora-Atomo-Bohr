/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pkg222210361_vinicius_alves_pedro_projeto.model;

/**
 * Classe do tipo Enum, que armazena todas as contantes necessárias para a realização dos calculos, 
 * e as distribui para as outras classes conforme forem chamadas.
 * @author vinic
 */
public enum Constantes {
    planckEv,
    planckJ,
    velocidadeLuz,
    AEletron,
    AProton;
    
    /**
     * Switch case que retorna os valores de acordo com o nome da variável de constante.
     * @return 
     */
    public double getValue(){
        switch (this){
            case planckEv -> {
                return 4.136e-15;
            }
            case planckJ -> {
                return 6.626e-34;
            }
            case velocidadeLuz -> {
                return 3e8;
            }
            case AEletron -> {
                return 9.11e-31;
            }
            case AProton -> {
                return 1.67e-27;
            }
            default -> {
                return 0;
            }
        }
    }
}
