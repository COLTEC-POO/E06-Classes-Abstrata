public class contaCorrente extends Conta{

    public accountCorrente(int Num, Cliente Dono, double Saldo, double LimiteMax, double MinSaldo){

        super(Num, Dono, Saldo);
        setLimite(limiteMax, MinSaldo);

    }

     void setLimite(double limiteMax, double MinSaldo) {

        if (MinSaldo < -100){

            MinSaldo = -100;
            super.MinSaldo = MinSaldo;
            super.limiteMax = MinSaldo;
            
        }

    }

}