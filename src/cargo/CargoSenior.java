package cargo;

import beneficios.Senioridade;
import senioridade.Beneficios;

public class CargoSenior extends Cargo implements Beneficios {
    private Senioridade senior;//Aqui
    private int nivel;
    public CargoSenior() {
        super();
        this.nivel = 3;
        this.senior = Senioridade.SENIOR;
    }

    @Override
    public String getNome() {return nome + senior;}
    @Override
    public double getSalarioBase() {
        return super.getSalarioBase()*6;
    }

    @Override
    public String getBeneficio(){
        return " Vale refeição + Plano de saúde + Seguro";
    }

    @Override
    public double calcularSalario() {
        return salarioBase*6;
    }

    public String toString(){
        return "Cargo Senior{" +
                "nome='" + getNome() + '\'' +
                ", salarioBase=" + getSalarioBase() +
                ", beneficio='" + obterSenioridade() + '\'' +
                '}';
    }

    @Override
    public String obterSenioridade() {
        return getBeneficio();
    }
}
