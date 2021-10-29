import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparadorCidadeTest {

    @Test
    void compare() {
        ComparadorCidade comparadorCidade;
        Cidade cidade= new Cidade("Belo Horizonte");
        Cidade cidade2= new Cidade("São Paulo");
        cidade.distancia=50;
        cidade2.distancia=100;
        comparadorCidade = new ComparadorCidade();
        comparadorCidade.compare(cidade, cidade2);
        assertEquals(-1, comparadorCidade.compare(cidade, cidade2),"Erro ao comparar distancia");
    }
}