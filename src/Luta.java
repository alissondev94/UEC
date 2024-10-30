import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcaLuta(Lutador desafiante, Lutador desafiado) {
        if (desafiante.getCategoria().equals(desafiado.getCategoria()) && desafiante != desafiado) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
            System.out.println("Luta marcada entre " + this.desafiante.getNome() + " e " + this.desafiado.getNome());
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("Luta não pode ser marcada. Verifique as categorias ou se os lutadores são diferentes.");
        }
    }

    public void Lutar() {
        if (this.isAprovada()) {
            System.out.println("------------ DESAFIANTE -----------");
            getDesafiante().apresentar();
            System.out.println("------------ DESAFIADO -----------");
            getDesafiado().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("O Vencedor é " + this.getDesafiado().getNome());
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("O Vencedor é " + this.getDesafiante().getNome());
                    getDesafiado().perderLuta();
                    getDesafiante().ganharLuta();
                    break;
            }

        } else {
            System.out.println("A luta nao foi aprovada!");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
