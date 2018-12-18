import to.Locacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {


    public static void main(String args[]){

        Locacao locacao1 = new Locacao();
        locacao1.setBairro("Vila Marina");
        locacao1.setEndereco("Rua Coronel Seabra");
        locacao1.setNumeroCasa(2109);
        locacao1.setTipoFinanciamento('I');


        Locacao locacao2 = new Locacao();
        locacao2.setBairro("Vila Pires");
        locacao2.setEndereco("Rua Coimbra");
        locacao2.setNumeroCasa(651);
        locacao2.setTipoFinanciamento('F');

        Locacao locacao3 = new Locacao();
        locacao3.setBairro("Vila Lutécia");
        locacao3.setEndereco("Rua Bernardo Guimarâes");
        locacao3.setNumeroCasa(123);
        locacao3.setTipoFinanciamento('F');
        locacao3.setValor(BigDecimal.valueOf(200_000d));

        List<Locacao> locacaoList = new ArrayList<>();
        locacaoList.add(locacao1);
        locacaoList.add(locacao2);
        locacaoList.add(locacao3);

        System.out.println(
                locacaoList.stream()
                .filter( e -> e.getTipoFinanciamento() != 'I')
                .allMatch(e -> e.getValor()==null)
        );
                //.collect(Collectors.toList());
       /* locacaoList
                .forEach(System.out::println);*/

        Optional<Locacao> optionalLocacao = Optional.of(locacao1);
        Optional<Locacao> optionalLocacaoFiltrado = optionalLocacao
                .filter(e -> e.getTipoFinanciamento() == 'I')
                .filter(e -> !BigDecimal.ZERO.equals(e.getValor()))
                .filter(e -> e.getNumeroCasa() == 21099);
        optionalLocacaoFiltrado
                .ifPresent(System.out::println);

        optionalLocacaoFiltrado
                .orElseThrow(IllegalArgumentException::new);
    }
}
