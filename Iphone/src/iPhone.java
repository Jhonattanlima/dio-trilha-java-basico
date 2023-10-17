

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int armazenamento;
    private String sistemaOperacional;

    public iPhone(String modelo, int armazenamento, String sistemaOperacional) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void tocar() {
        // Implementação para tocar música
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        // Implementação para pausar a reprodução de música
        System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação para selecionar uma música
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar() {
        // Implementação para ligar o telefone
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atenderChamada() {
        // Implementação para atender uma chamada
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        // Implementação para iniciar a caixa postal de voz
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação para exibir uma página na Internet
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação para adicionar uma nova aba no navegador
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página atual no navegador
        System.out.println("Atualizando a página...");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone("iPhone 13", 128, "iOS 15");
        iphone.ligar();
        iphone.selecionarMusica("Churrasquinho - Menos é Mais");
        iphone.tocar();
        iphone.pausar();
        iphone.exibirPagina("https://www.Iphone.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
