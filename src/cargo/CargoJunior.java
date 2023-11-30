package cargo;

public class CargoJunior extends Cargo{
    private String junior;
    private int nivel;
    public CargoJunior() {
        super();
        this.nivel = 1;
        this.junior = "Junior";
    }

    public int getNivel() {return nivel;}

    @Override
    public String getNome() {return super.getNome() + junior;}

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase()*1;
    }

    @Override
    public String getBeneficio(){
        return " Vale refeição";
    }

    public String toString(){
        return "Cargo Junior{" +
                "nome='" + getNome() + '\'' +
                ", salarioBase=" + getSalarioBase() +
                ", beneficio='" + getBeneficio() + '\'' +
                '}';
    }
}
