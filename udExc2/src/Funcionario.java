public class Funcionario {

    String name;
    double salarioB;
    double taxa;

    public Funcionario() {
    }

    public double salarioL(){
        return salarioB - taxa;
    }

    public void aumSalario(double porcentagem){
        salarioB += salarioB * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", salarioL());
    }
}
