package aula03;

public class TipoComanda {
    private final String tipo;
    private final int codigo;
    private final String descricao;
    private final int calorias;

    public TipoComanda(String tipo, int codigo, String descricao, int calorias) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.descricao = descricao;
        this.calorias = calorias;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCalorias() {
        return this.calorias;
    }
}
