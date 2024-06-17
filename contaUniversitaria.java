public class contaUniversitaria extends Conta{

    public accountUniversitaria (int Num, Cliente Dono, double Saldo, double LimiteMax, double MinSaldo){

        super(Num, Dono, Saldo);
        setLimite(limiteMax, MinSaldo);

    }

     void setLimite(double limiteMax, double MinSaldo) {

        if ((MinSaldo > 500) && (LimiteMax < 0)){

            MinSaldo = 0;
            limiteMax = 500;

            super.MinSaldo = MinSaldo;
            super.limiteMax = MinSaldo;
            
        }

    }

}