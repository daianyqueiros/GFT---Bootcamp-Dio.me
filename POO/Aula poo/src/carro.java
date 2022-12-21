class carro {
//atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor aqui

    carro(){

    }
    //sobrecarga do construtor
    carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //get e set
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;

    }
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

   int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //método de negocio
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
