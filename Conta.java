public class Conta{

	protected double saldo;

	public double getSaldo(){
		return this.saldo;	
	}

	public void deposita(double valor){
			this.saldo += valor;
	}
	
	public void saca(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
		}		
	}
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}

	public void setSaldo(double valor){
		this.saldo += valor;
	}
}
