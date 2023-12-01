package cargo;

public abstract class Cargo {
    protected String nome;
    protected double salarioBase;
    protected String beneficio;

    public Cargo(){
        this.nome="Desenvolvedor java ";
        this.salarioBase=1000;
        this.beneficio="";
    }

    public Cargo(String nome, double salarioBase, String beneficio) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.beneficio = beneficio;
    }

    public abstract String getNome();

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public abstract double calcularSalario();

    public String toString(int i) {
        CargoJunior cargoJunior = new CargoJunior();
        if (i == 1) {
            return "Cargo{" +
                    "nome='" + nome + '\'' +
                    ", salarioBase=" + cargoJunior.getSalarioBase() +
                    ", beneficio='" + beneficio + '\'' +
                    '}';
        }
        return "";
    }
}
