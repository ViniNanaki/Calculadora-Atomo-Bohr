/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg222210361_vinicius_alves_pedro_projeto.controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pkg222210361_vinicius_alves_pedro_projeto.view.Interface;
import pkg222210361_vinicius_alves_pedro_projeto.model.CalcularComEletron;
import pkg222210361_vinicius_alves_pedro_projeto.model.CalcularComProton;
import pkg222210361_vinicius_alves_pedro_projeto.model.Historico;
import pkg222210361_vinicius_alves_pedro_projeto.DAO.Conexao;
import pkg222210361_vinicius_alves_pedro_projeto.DAO.DAO;

/**
 * Classe que cria relações entre os calculos, a interface, e o banco de dados.
 * @author vinic
 */
public class Controller {

    private final Interface simulacao;
    private final CalcularComEletron calcularComEletron;
    private final CalcularComProton calcularComProton;

    public Controller(Interface simulacao) {
        this.simulacao = simulacao;
        this.calcularComEletron = new CalcularComEletron();
        this.calcularComProton = new CalcularComProton();
    }
    
    /**
     * Coloca argumentos nas funções de calculos que usam confinamento de Eletron, e os guarda em variáveis.
     */
    public void CalculadoraEletron() {
        double larguraCaixa = Double.parseDouble(simulacao.getLargura().getText());
        int ni = Integer.parseInt(simulacao.getNi().getText());
        int nf = Integer.parseInt(simulacao.getNf().getText());
        double a = Double.parseDouble(simulacao.getProbA().getText());
        double b = Double.parseDouble(simulacao.getProbB().getText());

        String funcaoOndaNi = this.calcularComEletron.funcaoOndaNi(larguraCaixa, ni);
        String funcaoOndaNf = this.calcularComEletron.funcaoOndaNf(larguraCaixa, nf);
        double energiaAtomoNi = this.calcularComEletron.energiaEletronNi(ni, larguraCaixa);
        double energiaAtomoNiEv = this.calcularComEletron.energiaEletronEv(energiaAtomoNi);
        double energiaAtomoNf = this.calcularComEletron.energiaEletronNf(nf, larguraCaixa);
        double energiaAtomoNfEv = this.calcularComEletron.energiaEletronEv(energiaAtomoNf);
        double energiaFoton = this.calcularComEletron.energiaFoton(energiaAtomoNiEv, energiaAtomoNfEv);
        double frequenciaFoton = this.calcularComEletron.frequenciaFoton(energiaFoton);
        double comprimentoFoton = this.calcularComEletron.comprimentoFoton(frequenciaFoton);
        double velocidadeNi = this.calcularComEletron.velocidade(energiaAtomoNi);
        double velocidadeNf = this.calcularComEletron.velocidade(energiaAtomoNf);
        double comprimentoBroglieNi = this.calcularComEletron.comprimentoOnda(energiaAtomoNi);
        double comprimentoBroglieNf = this.calcularComEletron.comprimentoOnda(energiaAtomoNf);
        String probabilidadeNi = this.calcularComEletron.probabilidadeNi(larguraCaixa, ni, a, b);
        String probabilidadeNf = this.calcularComEletron.probabilidadeNf(larguraCaixa, nf, a, b);
        Historico contas = new Historico(funcaoOndaNi, probabilidadeNi, probabilidadeNf, funcaoOndaNf, energiaAtomoNi, energiaAtomoNi, energiaFoton, frequenciaFoton, comprimentoFoton, velocidadeNi, comprimentoBroglieNi, energiaAtomoNf, energiaAtomoNf, velocidadeNf, comprimentoBroglieNf);
        this.listarResultadosNivelInicial(funcaoOndaNi, energiaAtomoNi, energiaAtomoNiEv, energiaFoton, frequenciaFoton, comprimentoFoton, velocidadeNi, comprimentoBroglieNi, probabilidadeNi);
        this.listarResultadosNivelFinal(funcaoOndaNf, energiaAtomoNf, energiaAtomoNfEv, energiaFoton, frequenciaFoton, comprimentoFoton, velocidadeNf, comprimentoBroglieNf, probabilidadeNf);
        this.insert(contas);
    }
    
    /**
     * Coloca argumentos nas funções de calculos que usam confinamento de Proton, e os guarda em variáveis.
     */
    public void CalculadoraProton() {
        double larguraCaixa = Double.parseDouble(simulacao.getLargura().getText());
        int ni = Integer.parseInt(simulacao.getNi().getText());
        int nf = Integer.parseInt(simulacao.getNf().getText());
        double a = Double.parseDouble(simulacao.getProbA().getText());
        double b = Double.parseDouble(simulacao.getProbB().getText());

        String funcaoOndaNi = this.calcularComProton.funcaoOndaNi(larguraCaixa, ni);
        String funcaoOndaNf = this.calcularComProton.funcaoOndaNf(larguraCaixa, nf);
        double energiaAtomoNi = this.calcularComProton.energiaProtonNi(ni, larguraCaixa);
        double energiaAtomoNiEv = this.calcularComProton.energiaProtonEv(energiaAtomoNi);
        double energiaAtomoNf = this.calcularComProton.energiaProtonNf(nf, larguraCaixa);
        double energiaAtomoNfEv = this.calcularComProton.energiaProtonEv(energiaAtomoNf);
        double energiaFoton = this.calcularComProton.energiaFoton(energiaAtomoNiEv, energiaAtomoNfEv);
        double frequenciaFoton = this.calcularComProton.frequenciaFoton(energiaFoton);
        double comprimentoFoton = this.calcularComProton.comprimentoFoton(frequenciaFoton);
        double velocidadeNi = this.calcularComProton.velocidade(energiaAtomoNi);
        double velocidadeNf = this.calcularComProton.velocidade(energiaAtomoNf);
        double comprimentoBroglieNi = this.calcularComProton.comprimentoOnda(energiaAtomoNi);
        double comprimentoBroglieNf = this.calcularComProton.comprimentoOnda(energiaAtomoNf);
        String probabilidadeNi = this.calcularComProton.probabilidadeNi(larguraCaixa, ni, a, b);
        String probabilidadeNf = this.calcularComProton.probabilidadeNf(larguraCaixa, nf, a, b);
        Historico contas = new Historico(funcaoOndaNi, probabilidadeNi, probabilidadeNf, funcaoOndaNf, energiaAtomoNi, energiaAtomoNi, energiaFoton, frequenciaFoton, comprimentoFoton, velocidadeNi, comprimentoBroglieNi, energiaAtomoNf, energiaAtomoNf, velocidadeNf, comprimentoBroglieNf);
        this.listarResultadosNivelInicial(funcaoOndaNi, energiaAtomoNi, energiaAtomoNiEv, energiaFoton, frequenciaFoton, comprimentoFoton, velocidadeNi, comprimentoBroglieNi, probabilidadeNi);
        this.listarResultadosNivelFinal(funcaoOndaNf, energiaAtomoNf, energiaAtomoNfEv, energiaFoton, frequenciaFoton, comprimentoFoton, velocidadeNf, comprimentoBroglieNf, probabilidadeNf);
        this.insert(contas);
    }

    /**
     * Coloca os resultados dos calculos, quanto ao nivel inicial, na Interface.
     * @param funcaoOndaNi
     * @param energiaAtomoNi
     * @param energiaAtomoNiEv
     * @param energiaFoton
     * @param frequenciaFoton
     * @param comprimentoFoton
     * @param velocidadeNi
     * @param comprimentoBroglieNi
     * @param probabilidadeNi 
     */
    private void listarResultadosNivelInicial(
            String funcaoOndaNi,
            double energiaAtomoNi,
            double energiaAtomoNiEv,
            double energiaFoton,
            double frequenciaFoton,
            double comprimentoFoton,
            double velocidadeNi,
            double comprimentoBroglieNi,
            String probabilidadeNi
    ) {
        this.simulacao.getjTextField1().setText(funcaoOndaNi);
        this.simulacao.getEnergiaJouleIn().setText(this.calcularComEletron.conversorDecimal(energiaAtomoNi));
        this.simulacao.getEnergiaEvIn().setText(this.calcularComEletron.conversorDecimal(energiaAtomoNiEv));
        this.simulacao.getEnergiaFotonIn().setText(this.calcularComEletron.conversorDecimal(energiaFoton));
        this.simulacao.getFrequenciaIn().setText(this.calcularComEletron.conversorDecimal(frequenciaFoton));
        this.simulacao.getCompOndaIn().setText(this.calcularComEletron.conversorDecimal(comprimentoFoton));
        this.simulacao.getVelocidadeIn().setText(this.calcularComEletron.conversorDecimal(velocidadeNi));
        this.simulacao.getCompBroglieIn().setText(this.calcularComEletron.conversorDecimal(comprimentoBroglieNi));
        this.simulacao.getProbabilidadeIn().setText(probabilidadeNi);
    }
    
    /**
     * Coloca os resultados dos calculos, quanto ao nivel final, na Interface, além de uma mensagem de confirmação.
     * @param funcaoOndaNf
     * @param energiaAtomoNf
     * @param energiaAtomoNfEv
     * @param energiaFoton
     * @param frequenciaFoton
     * @param comprimentoFoton
     * @param velocidadeNf
     * @param comprimentoBroglieNf
     * @param probabilidadeNf 
     */
    private void listarResultadosNivelFinal(
            String funcaoOndaNf,
            double energiaAtomoNf,
            double energiaAtomoNfEv,
            double energiaFoton,
            double frequenciaFoton,
            double comprimentoFoton,
            double velocidadeNf,
            double comprimentoBroglieNf,
            String probabilidadeNf
    ) {

        this.simulacao.getFuncaoOnda().setText(funcaoOndaNf);
        this.simulacao.getEnergiaJoule().setText(String.format(this.calcularComEletron.conversorDecimal(energiaAtomoNf)));
        this.simulacao.getEnergiaEv().setText(this.calcularComEletron.conversorDecimal(energiaAtomoNfEv));
        this.simulacao.getEnergiaFoton().setText(this.calcularComEletron.conversorDecimal(energiaFoton));
        this.simulacao.getFrequencia().setText(this.calcularComEletron.conversorDecimal(frequenciaFoton));
        this.simulacao.getCompOnda().setText(this.calcularComEletron.conversorDecimal(comprimentoFoton));
        this.simulacao.getVelocidade().setText(this.calcularComEletron.conversorDecimal(velocidadeNf));
        this.simulacao.getCompBroglie().setText(this.calcularComEletron.conversorDecimal(comprimentoBroglieNf));
        this.simulacao.getProbabilidade().setText(probabilidadeNf);
        JOptionPane.showMessageDialog(simulacao, "Confira os resultados nas abas ao lado.");
    }

    /**
     * Função relacionada a classe Historico que insere no Banco de Dados o ArrayList montado.
     * @param contas 
     */
    private void insert(Historico contas) {
        Conexao conn = new Conexao();

        try {
            Connection connection = conn.getConnection();
            DAO dao = new DAO(connection);
            dao.insert(contas);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
