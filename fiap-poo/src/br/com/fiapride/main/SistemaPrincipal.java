package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        // Instanciação correta seguindo PascalCase
        Veiculo v1 = new Veiculo();

        // Uso de Setters (Fim do acesso direto 'individuo' e 'pl')
        v1.setProprietario("Carlos");
        v1.setPlaca("ABC-1234");

        // Tentativa de inserir valor negativo (Será bloqueada pela validação do setter)
        v1.setNivelCombustivel(-18);

        // Operações de abastecimento e consumo
        v1.abastecer(50);
        v1.consumir(10);

        // Saída de dados formatada e limpa
        System.out.println("--- Dados do Veículo ---");
        System.out.println("Dono: " + v1.getProprietario());
        System.out.println("Placa: " + v1.getPlaca());
        System.out.println("Nível de Gasolina: " + v1.getNivelCombustivel() + "L");
    }
}