public class Aluno {

    String nome;
    double prova1;
    double prova2;
    double prova3;

    public Aluno() {
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.prova3 = prova3;
    }

    public double media(){
        return prova1 + prova2 + prova3;
    }

    public double reprovouPor(){
        if (media() < 60.0){
            return 60.0 - media();
        }
        else {
            return 0.0;
        }
    }
}
