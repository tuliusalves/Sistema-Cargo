import cargo.Cargo;
import cargo.CargoJunior;
import cargo.CargoPleno;
import cargo.CargoSenior;

public class Main {
    public static void main(String[] args) {
        Cargo cargo= new Cargo("Desenvolvedor java",1000,"Auxílio...");
        Cargo cargo2 = new CargoJunior();
        Cargo cargo3 = new CargoPleno();
        Cargo cargo4 = new CargoSenior();

        System.out.println(cargo2.toString());
        System.out.println(cargo3.toString());
        System.out.println(cargo4.toString());
    }
}