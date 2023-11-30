package cargo;

public class Cargo {
    private String nome;
    private double salarioBase;
    private String beneficio;

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

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getBeneficio() {
        return beneficio;
    }


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
