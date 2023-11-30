package cargo;

public class CargoPleno extends Cargo{
    private String pleno;
    private int nivel;
    public CargoPleno() {
        super();
        this.nivel = 2;
        this.pleno = "Pleno";
    }

    @Override
    public String getNome() {return super.getNome() + pleno;}
    @Override
    public double getSalarioBase() {
        return super.getSalarioBase()*4;
    }

    @Override
    public String getBeneficio(){
        return " Vale refeição + Plano de saúde";
    }

    public String toString(){
        return "Cargo Pleno{" +
                "nome='" + getNome() + '\'' +
                ", salarioBase=" + getSalarioBase() +
                ", beneficio='" + getBeneficio() + '\'' +
                '}';
    }
}
