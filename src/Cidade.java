import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Cidade {
  //tabela com todas as cidades por nome
  public static HashMap<String, Cidade> cidades = new HashMap<String, Cidade>();

  //nome da cidade
  public String nome;

  //link da cidade adjacente
  public final HashSet<Link> links = new HashSet<Link>();

  //menor distancia
  public int distancia;

  //menor caminho percorrido
  public Link linkPai;

  /* contrutor para Cidade com um nome
   * adicionado a tabela (HashMap) de cidades
   */
  public Cidade(String nm) {
    nome = nm;
    cidades.put(nome, this);
  }

  /* Método para encontrar uma cidade pelo nome
   * retorna a cidade se ela existir na tabela
   * caso contrário retorna uma nova cidade com o nome informado
   */



  /* adiciona um link entre cidades na lista de links
   */


  /* compare cidades pelos seus nomes
   * returna negativo se c1 for alfabeticamente anterior,
   *  0 se os nomes forem os menos,
   *  e positivo se c2 for alfabeticamente maior
   */
  public int comparaNome(Cidade p1, Cidade p2) { //Ajustar o codigo para as condicoes para atender os requiisitos
    int valor = p1.nome.compareTo(p2.nome);
    if (valor < 0) {
      valor = -1;
    }else if (valor > 0) {
      valor = 1;
    }else {
      valor = 0;
    }
    return valor;
  }

  /* returna o nome da cidade
   */
  public String toString() {
    return nome;
  }

  /* compara cidades pela sua distancia até a rede de trens (ponto 0)
   * returna negativo se c1 for mais próxima, 0 se a distancia for a mesma, e positivo se c2 for mais próxima
   */
  public int comparaDistancia(Cidade c1, Cidade c2) { //Refatoração do codigo para aceite das condicoes do requisito
    int distancia;
    if(c1.distancia <= 0 || c1.distancia < c2.distancia){
      distancia = -1;
    }else if(c1.distancia == c2.distancia){
      distancia = 0;
    }else{
      distancia = 1;
    }
    return distancia;
  }

  public static String encontrarCidade(String nm) {  // Alterando retorno do metodo de Cidade para String
    Cidade p = cidades.get(nm);
    String cidade = null;
    int x = cidades.size();
    System.out.println(x);
    if (cidades.containsKey(nm)) { // Correção do método para verificar se na lista contém a cidade, caso nao
      // exista, cai no else e cria a cidade
      cidade = p.nome;
    } else {
      p = new Cidade(nm);
      cidade = p.nome;
    }
    return cidade;
  }

  public boolean addLink(Link link) { //Alteracao para retornar booleano (true) caso o link for adicionado com sucesso
//    HashSet<Link> links = new HashSet<Link>();
    links.add(link);
    return true;
  }
}
