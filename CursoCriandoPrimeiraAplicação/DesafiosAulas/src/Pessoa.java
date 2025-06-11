public class Pessoa {
   // 1) Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.

    private String nome = "Joao";
    private int idade = 25;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString (){
        return ( "O nome " + nome +" a idade " + idade);
    }
}
