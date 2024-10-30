public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;


    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empate) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitoria(vitoria);
        this.setDerrota(derrota);
        this.setEmpate(empate);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 71) {
            this.categoria = "peso leve";
        } else if (this.getPeso() < 89) {
            this.categoria = "peso medio";
        } else {
            this.categoria = "peso pesado";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitoria: " + this.getVitoria());
        System.out.println("Derrota: " + this.getDerrota());
        System.out.println("Empate: " + this.getEmpate());
        System.out.println("------------------------------------");
    }

    public void status() {
        System.out.println(this.getNome());
        System.out.println("O lutador é um peso: " + this.getCategoria());
        System.out.println(getVitoria() + " Vitorias");
        System.out.println(getDerrota() + " Derrota");
        System.out.println(getEmpate() + " Empates");
        System.out.println("------------------------------------");
    }

    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }


    public void perderLuta() {
        this.setDerrota(this.getDerrota() + 1);
    }

    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }
}
