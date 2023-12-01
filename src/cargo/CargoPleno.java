package cargo;

import beneficios.Senioridade;
import senioridade.Beneficios;

public class CargoPleno extends Cargo implements Beneficios {
    private Senioridade pleno;
    private int nivel;
    public CargoPleno() {
        super();
        this.nivel = 2;
        this.pleno = Senioridade.PLENO;
    }

    @Override
    public String getNome() {return nome + pleno;}

    @Override
    public String getBeneficio(){
        return " Vale refeição + Plano de saúde";
    }

    @Override
    public double calcularSalario() {
        return salarioBase*4;
    }

    @Override

    public String toString(){
        return "Cargo Pleno{" +
                "nome='" + getNome() + '\'' +
                ", salarioBase=" + calcularSalario() +
                ", beneficio='" + obterSenioridade() + '\'' +
                '}';
    }

    @Override
    public String obterSenioridade() {
        return getBeneficio();
    }
}
