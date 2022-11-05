
public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor vazio
    Carro() {    
    }

    //construtor com valores iniciais
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor; // o this representa que se trata do atributo do objeto e não to parâmetro na qual estou recebendo.
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //getters e setters
    void setCor(String cor){
        this.cor =  cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //método para calcular total do tanque cheio
    double totalValorTanque(double vlrCombustivel){
        return vlrCombustivel * capacidadeTanque;
    }

    public static void main(String[] args) throws Exception {
    }
}
