public class Main {
    public static void main(String[] args) {
        double alturaParede = 2;
        double larguraParede = 5;
        double alturaAzulejo = 0.5;
        double larguraAzulejo = 1.5;

        double quantidadeDeAzulejos = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);
        System.out.println("Área da parede: " + (alturaParede * larguraParede));
        System.out.println("Área do azulejo: " + (alturaAzulejo * larguraAzulejo));
        System.out.println("Quantidade de azulejos necessários para cobrir toda a parede: " + quantidadeDeAzulejos);
    }
}