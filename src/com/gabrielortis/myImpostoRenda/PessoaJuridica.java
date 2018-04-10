package com.gabrielortis.myImpostoRenda;

public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return super.getRendaBruta() * 0.1;
	}
	
	public String toString() {
		return super.toString() + "PessoaJuridica \ncnpj: " + this.cnpj + "\n imposto a ser pago: R$" + this.calcularImposto() + "\n";
	}

}
