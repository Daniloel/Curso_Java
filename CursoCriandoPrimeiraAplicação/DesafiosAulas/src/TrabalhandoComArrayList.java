import java.util.ArrayList;

public class TrabalhandoComArrayList {
//    Para solidificar esses conceitos, sugerimos atividades práticas (não obrigatórias) que aprimorarão sua
//    compreensão desses princípios fundamentais. Está preparado para aplicar essas ideias?
//
//    1) Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
//    2) No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
//    3) Adicione pelo menos três pessoas à lista utilizando o método add.
//    4) Imprima o tamanho da lista utilizando o método size.
//    5) Imprima a primeira pessoa da lista utilizando o método get.
//    6) Imprima a lista completa

    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa_2 = new Pessoa("Esse", 30);

        Pessoa pessoa_1 = new Pessoa("Akemi", 18);

        Pessoa pessoa_3 = new Pessoa("Caroline", 35);



        listaDePessoas.add(pessoa_1);
        listaDePessoas.add(pessoa_2);
        listaDePessoas.add(pessoa_3);


        System.out.println("Tamnho da Lista " + listaDePessoas.size());

        System.out.println("Primeiro item da lista " + listaDePessoas.get(0));


        System.out.println("Lista de Pessoas:");


//        for (int i = 0; i < listaDePessoas.size(); i++) {
//            Pessoa pessoa = listaDePessoas.get(i);
//            System.out.println(pessoa);
//
//        }
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
