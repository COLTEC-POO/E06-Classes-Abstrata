public class contaPoupanca extends Conta{

    public accountPoupanca (int Num, Cliente Dono, double Saldo, double LimiteMax, double MinSaldo){

        super(Num, Dono, Saldo);
        setLimite(limiteMax, MinSaldo);

    }

     void setLimite(double limiteMax, double MinSaldo) {

        if ((LimiteMax > 1000) && (MinSaldo < 100)){

            MinSaldo = 100;
            LimiteMax = 1000;
            
            super.MinSaldo = MinSaldo;
            super.limiteMax = MinSaldo;
            
        }

    }

}