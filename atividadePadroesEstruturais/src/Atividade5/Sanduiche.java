/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade5;

/**
 *
 * @author usuario
 */
public class Sanduiche {
    private String pao;
    private String carne;
    private String queijo;
    private boolean alface;
    private boolean tomate;
    private String molho;

    // Construtor privado para garantir que o Sanduiche só seja construído via o Builder
    private Sanduiche(SanduicheBuilder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.alface = builder.alface;
        this.tomate = builder.tomate;
        this.molho = builder.molho;
    }

    @Override
    public String toString() {
        return "Sanduíche [Pão: " + pao + ", Carne: " + carne + ", Queijo: " + queijo +
                ", Alface: " + alface + ", Tomate: " + tomate + ", Molho: " + molho + "]";
    }

    // Classe Builder interna
    public static class SanduicheBuilder {
        private String pao;
        private String carne;
        private String queijo;
        private boolean alface;
        private boolean tomate;
        private String molho;

        public SanduicheBuilder(String pao) { // Pão é obrigatório
            this.pao = pao;
        }

        public SanduicheBuilder carne(String carne) {
            this.carne = carne;
            return this;
        }

        public SanduicheBuilder queijo(String queijo) {
            this.queijo = queijo;
            return this;
        }

        public SanduicheBuilder alface(boolean alface) {
            this.alface = alface;
            return this;
        }

        public SanduicheBuilder tomate(boolean tomate) {
            this.tomate = tomate;
            return this;
        }

        public SanduicheBuilder molho(String molho) {
            this.molho = molho;
            return this;
        }

        // Método build para construir o Sanduiche final
        public Sanduiche build() {
            return new Sanduiche(this);
        }
    }
}

