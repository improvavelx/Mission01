//cria a classe carro, a forma

public class Carro{

    //cria os atributos da classe
    String marca;
    String modelo;
    int ano;
    double valor;

    // Cria o metodo contrutor
    public Carro(String marca, String modelo, int ano, double valor) {

        //o this recebe
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    //metodo para exibir informações
    public void mostrarDados() {

        //Exibe uma mensagem
        System.out.println("==== CARRO CADASTRADO ====");

        System.out.println("Marca: " + marca);

        System.out.println("Modelo: " + modelo);

        System.out.println("Ano: " + ano);

        System.out.println("Valor: R$ " + valor);
    }

    //metodo get
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getValor() {
        return valor;
    }
    //metodo set
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}