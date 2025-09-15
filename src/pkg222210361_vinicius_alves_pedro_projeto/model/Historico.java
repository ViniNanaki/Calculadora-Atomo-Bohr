/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210361_vinicius_alves_pedro_projeto.model;

import java.util.ArrayList;

/**
 * Classe com construtores, Getters e Setters, de elementos a serem recebidos pela classe DAO.
 * @author vinic
 */
public class Historico {

    private String funcaoOndaNi, probabilidadeNi, probabilidadeNf, funcaoOndaNf;

    private double energiaAtomoNi,
            energiaAtomoNiEv,
            energiaFoton,
            frequenciaFoton,
            comprimentoFoton,
            velocidadeNi,
            comprimentoBroglieNi,
            energiaAtomoNf,
            energiaAtomoNfEv,
            velocidadeNf,
            comprimentoBroglieNf;

    public Historico() {
    }

    /**
     * Construtor que recebe todos os calculos realizados pelo programa para posteriomente comporem um ArrayList.
     * @param funcaoOndaNi
     * @param probabilidadeNi
     * @param probabilidadeNf
     * @param funcaoOndaNf
     * @param energiaAtomoNi
     * @param energiaAtomoNiEv
     * @param energiaFoton
     * @param frequenciaFoton
     * @param comprimentoFoton
     * @param velocidadeNi
     * @param comprimentoBroglieNi
     * @param energiaAtomoNf
     * @param energiaAtomoNfEv
     * @param velocidadeNf
     * @param comprimentoBroglieNf 
     */
    public Historico(String funcaoOndaNi, String probabilidadeNi, String probabilidadeNf, String funcaoOndaNf, double energiaAtomoNi, double energiaAtomoNiEv, double energiaFoton, double frequenciaFoton, double comprimentoFoton, double velocidadeNi, double comprimentoBroglieNi, double energiaAtomoNf, double energiaAtomoNfEv, double velocidadeNf, double comprimentoBroglieNf) {
        this.funcaoOndaNi = funcaoOndaNi;
        this.probabilidadeNi = probabilidadeNi;
        this.probabilidadeNf = probabilidadeNf;
        this.funcaoOndaNf = funcaoOndaNf;
        this.energiaAtomoNi = energiaAtomoNi;
        this.energiaAtomoNiEv = energiaAtomoNiEv;
        this.energiaFoton = energiaFoton;
        this.frequenciaFoton = frequenciaFoton;
        this.comprimentoFoton = comprimentoFoton;
        this.velocidadeNi = velocidadeNi;
        this.comprimentoBroglieNi = comprimentoBroglieNi;
        this.energiaAtomoNf = energiaAtomoNf;
        this.energiaAtomoNfEv = energiaAtomoNfEv;
        this.velocidadeNf = velocidadeNf;
        this.comprimentoBroglieNf = comprimentoBroglieNf;
    }
    
    public String getFuncaoOndaNi() {
        return funcaoOndaNi;
    }
    
    public void setFuncaoOndaNi(String funcaoOndaNi) {
        this.funcaoOndaNi = funcaoOndaNi;
    }

    public String getProbabilidadeNi() {
        return probabilidadeNi;
    }

    public void setProbabilidadeNi(String probabilidadeNi) {
        this.probabilidadeNi = probabilidadeNi;
    }

    public String getProbabilidadeNf() {
        return probabilidadeNf;
    }

    public void setProbabilidadeNf(String probabilidadeNf) {
        this.probabilidadeNf = probabilidadeNf;
    }

    public String getFuncaoOndaNf() {
        return funcaoOndaNf;
    }

    public void setFuncaoOndaNf(String funcaoOndaNf) {
        this.funcaoOndaNf = funcaoOndaNf;
    }

    public double getEnergiaAtomoNi() {
        return energiaAtomoNi;
    }

    public void setEnergiaAtomoNi(double energiaAtomoNi) {
        this.energiaAtomoNi = energiaAtomoNi;
    }

    public double getEnergiaAtomoNiEv() {
        return energiaAtomoNiEv;
    }

    public void setEnergiaAtomoNiEv(double energiaAtomoNiEv) {
        this.energiaAtomoNiEv = energiaAtomoNiEv;
    }

    public double getEnergiaFoton() {
        return energiaFoton;
    }

    public void setEnergiaFoton(double energiaFoton) {
        this.energiaFoton = energiaFoton;
    }

    public double getFrequenciaFoton() {
        return frequenciaFoton;
    }

    public void setFrequenciaFoton(double frequenciaFoton) {
        this.frequenciaFoton = frequenciaFoton;
    }

    public double getComprimentoFoton() {
        return comprimentoFoton;
    }

    public void setComprimentoFoton(double comprimentoFoton) {
        this.comprimentoFoton = comprimentoFoton;
    }

    public double getVelocidadeNi() {
        return velocidadeNi;
    }

    public void setVelocidadeNi(double velocidadeNi) {
        this.velocidadeNi = velocidadeNi;
    }

    public double getComprimentoBroglieNi() {
        return comprimentoBroglieNi;
    }

    public void setComprimentoBroglieNi(double comprimentoBroglieNi) {
        this.comprimentoBroglieNi = comprimentoBroglieNi;
    }

    public double getEnergiaAtomoNf() {
        return energiaAtomoNf;
    }

    public void setEnergiaAtomoNf(double energiaAtomoNf) {
        this.energiaAtomoNf = energiaAtomoNf;
    }

    public double getEnergiaAtomoNfEv() {
        return energiaAtomoNfEv;
    }

    public void setEnergiaAtomoNfEv(double energiaAtomoNfEv) {
        this.energiaAtomoNfEv = energiaAtomoNfEv;
    }

    public double getVelocidadeNf() {
        return velocidadeNf;
    }

    public void setVelocidadeNf(double velocidadeNf) {
        this.velocidadeNf = velocidadeNf;
    }

    public double getComprimentoBroglieNf() {
        return comprimentoBroglieNf;
    }

    public void setComprimentoBroglieNf(double comprimentoBroglieNf) {
        this.comprimentoBroglieNf = comprimentoBroglieNf;
    }
    
    /**
     * Retorna, em ArrayList, um indicativo sobre sobre os calculos que são realizados no programa, para posteriormente serem registrados no banco de dados.
     * @return 
     */
    public ArrayList<String> contas() {
        ArrayList<String> contas = new ArrayList<>();

        contas.add(this.getFuncaoOndaNi());
        contas.add(this.getFuncaoOndaNf());
        contas.add("Energia da partícula em J N Inicial");
        contas.add("Energia da partícula em Ev N Inicial");
        contas.add("Energia da partícula em J N Final");
        contas.add("Energia da partícula em Ev N Final");
        contas.add("Energia do Fóton");
        contas.add("Frequência do Fóton");
        contas.add("Comprimento de onda do Fóton");
        contas.add("Velocidade N Inicial");
        contas.add("Velocidade N Final");
        contas.add("Comp. De Broglie N Inicial");
        contas.add("Comp. De Broglie N Final");
        contas.add(this.getProbabilidadeNi());
        contas.add(this.getProbabilidadeNf());
        return contas;
    }
    
    /**
     * Retorna, em ArrayList, os resultados dos calculos feitos no programa, para posteriormente serem registrados no banco de dados.
     * @return 
     */
    public ArrayList<Double> resultados() {
        ArrayList<Double> resultados = new ArrayList<>();

        resultados.add(0.0);
        resultados.add(0.0);
        resultados.add(this.getEnergiaAtomoNi());
        resultados.add(this.getEnergiaAtomoNiEv());
        resultados.add(this.getEnergiaAtomoNf());
        resultados.add(this.getEnergiaAtomoNfEv());
        resultados.add(this.getEnergiaFoton());
        resultados.add(this.getFrequenciaFoton());
        resultados.add(this.getComprimentoFoton());
        resultados.add(this.getVelocidadeNi());
        resultados.add(this.getVelocidadeNf());
        resultados.add(this.getComprimentoBroglieNi());
        resultados.add(this.getComprimentoBroglieNf());
        resultados.add(0.0);
        resultados.add(0.0);
        return resultados;
    }
}
