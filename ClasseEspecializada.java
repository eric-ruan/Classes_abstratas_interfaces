public class ClasseEspecializada extends Conta{
    @Override
    public void imprimeExtrato(){
        System.out.println("Seu saldo é de: " + getSaldo());

    }

    @Override
    public int idade(){
        int maioridade = 18;

        return 0;
    }
}