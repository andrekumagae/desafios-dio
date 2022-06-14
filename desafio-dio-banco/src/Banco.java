import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
public class Banco {
    @Getter
    private String nome;
    private List<Conta> contas;

}
