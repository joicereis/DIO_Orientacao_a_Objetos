//import javax.swing.event.SwingPropertyChangeSupport;
//import javax.swing.plaf.synth.SynthScrollBarUI;

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        System.out.println();
        System.out.println(carro1.modelo);
        System.out.println(carro1.cor);
        System.out.println(carro1.capacidadeTanque);

        //alimentando objeto instanciado através dos métodos get e set sem informar parâmetros no construtor Carro()
        System.out.println();
        carro1.setCor("Azul Del Rey");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.capacidadeTanque);
        System.out.println(carro1.totalValorTanque(5.99));

        //alimentando objeto carro2 através dos parâmetros do construtor 
        Carro carro2 = new Carro( "Prata", "Mercedes-Benz Classe C", 66);
        System.out.println();
        System.out.println(carro2.modelo);
        System.out.println(carro2.cor);
        System.out.println(carro2.capacidadeTanque);
        System.out.println(carro2.totalValorTanque(5.99));

    }  
}
