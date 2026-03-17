package br.com.fiapride.model;

/**
 * Classe que representa um veículo da frota FiapRide.
 * Aplicando Clean Code e Encapsulamento.
 */
public class Veiculo {
    // Atributos privados (Blindagem de dados)
    private String proprietario;
    private String placa;
    private double nivelCombustivel;

    // Construtor Padrão
    public Veiculo() {}

    // Construtor Cheio (Facilita a criação de objetos já validados)
    public Veiculo(String proprietario, String placa, double nivelCombustivel) {
        this.proprietario = proprietario;
        this.placa = placa;
        setNivelCombustivel(nivelCombustivel); // Usa o setter para validar o valor inicial
    }

    // Métodos de Negócio com Validação
    public void abastecer(double litros) {
        if (litros > 0) {
            this.nivelCombustivel += litros;
        } else {
            System.out.println("Erro: Quantidade de abastecimento deve ser positiva.");
        }
    }

    public void consumir(double litros) {
        if (litros > 0 && (this.nivelCombustivel - litros) >= 0) {
            this.nivelCombustivel -= litros;
        } else {
            System.out.println("Erro: Combustível insuficiente ou valor inválido.");
        }
    }

    // Getters e Setters (Acesso controlado)
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        if (nivelCombustivel >= 0) {
            this.nivelCombustivel = nivelCombustivel;
        } else {
            System.out.println("Erro: O nível de combustível não pode ser negativo.");
            this.nivelCombustivel = 0; // Valor padrão de segurança
        }
    }
}