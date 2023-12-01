package cargo;

import beneficios.Senioridade;
import senioridade.Beneficios;

public class CargoJunior extends Cargo implements Beneficios {
    private Senioridade junior;
    private int nivel;
    public CargoJunior() {
        super();
        this.nivel = 1;
        this.junior = Senioridade.JUNIOR;
    }

    public int getNivel() {return nivel;}

    @Override
    public String getNome() {return super.nome + junior;}

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase()*1;
    }

    @Override
    public String getBeneficio(){
        return " Vale refeição";
    }

    @Override
    public double calcularSalario() {
        return salarioBase*1;
    }

    public String toString(){
        return "Cargo Junior{" +
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
