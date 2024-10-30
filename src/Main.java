import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lutador lutadores[] = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);


        for (int i = 0; i < lutadores.length; i++) {
            System.out.println("---- Lutador " + (i + 1) + " ----");
            lutadores[i].apresentar();
            System.out.println();
        }
        sc.close();

        Luta uec01 = new Luta();
        Luta uec02 = new Luta();
        Luta uec03 = new Luta();

        uec01.marcaLuta(lutadores[0], lutadores[1]);
        uec02.marcaLuta(lutadores[2], lutadores[3]);
        uec03.marcaLuta(lutadores[4], lutadores[5]);
        System.out.println();

        uec01.Lutar();
        System.out.println();
        uec02.Lutar();
        System.out.println();
        uec03.Lutar();



// se quiser solicitar ao usuario os nomes dos lutadores

       /* for(int i=0;i<lutadores.length;i++){
            System.out.print("Nome do " + (i + 1) + "º Lutador: ");
            String nome = sc.next();
            System.out.print("Nacionalidade: ");
            String nacionalidade = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            System.out.print("Vitorias: ");
            int vitorias = sc.nextInt();
            System.out.print("Derrotas: ");
            int derrotas = sc.nextInt();
            System.out.print("Empates: ");
            int empates = sc.nextInt();

            lutadores[i] = new Lutador(nome,nacionalidade,idade,altura,peso,vitorias,derrotas,empates);
        } */


    }
}


