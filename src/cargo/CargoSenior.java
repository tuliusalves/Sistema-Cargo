package cargo;

public class CargoSenior extends Cargo {
    private String senior;
    private int nivel;
    public CargoSenior() {
        super();
        this.nivel = 3;
        this.senior = "Senior";
    }

    @Override
    public String getNome() {return super.getNome() + senior;}
    @Override
    public double getSalarioBase() {
        return super.getSalarioBase()*6;
    }

    @Override
    public String getBeneficio(){
        return " Vale refeição + Plano de saúde + Seguro";
    }

    public String toString(){
        return "Cargo Senior{" +
                "nome='" + getNome() + '\'' +
                ", salarioBase=" + getSalarioBase() +
                ", beneficio='" + getBeneficio() + '\'' +
                '}';
    }
}
