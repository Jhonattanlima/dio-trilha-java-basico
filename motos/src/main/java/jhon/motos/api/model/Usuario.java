package jhon.motos.api.model;

public class Usuario {
    private Integer id;

    private String proprietario;
    private String modeloMoto;
    private String cor;

    private Integer anoFabricacao;
    public Usuario(String proprietario, String modeloMoto, String cor, Integer anoFabricacao ){
        this.proprietario = proprietario;
        this.modeloMoto = modeloMoto;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", proprietario='" + proprietario + '\'' +
                ", modeloMoto='" + modeloMoto + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getModeloMoto() {
        return modeloMoto;
    }

    public void setModeloMoto(String modeloMoto) {
        this.modeloMoto = modeloMoto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
