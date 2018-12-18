package to;

import com.sun.istack.internal.NotNull;

import java.math.BigDecimal;

public class Locacao {
    /**Sendo I para Seguro Fiança e F para Fiador*/
    @NotNull
    private char tipoFinanciamento;

    private BigDecimal valor;

    private String endereco;

    private int numeroCasa;

    private String bairro;

    public char getTipoFinanciamento() {
        return tipoFinanciamento;
    }

    public void setTipoFinanciamento(char tipoFinanciamento) {
        this.tipoFinanciamento = tipoFinanciamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString(){
        return "Tipo de Financiamento: "+ (tipoFinanciamento == 'I' ? "Fiança" : "Fiador");
    }
}
