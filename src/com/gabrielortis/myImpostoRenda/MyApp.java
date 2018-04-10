package com.gabrielortis.myImpostoRenda;

public class MyApp {
	public static void main(String[] args) {

		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Pessoa Fisica 1");
		p1.setCpf("250.741.827-35");
		p1.setRendaBruta(1000);
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("Pessoa Fisica 2");
		p2.setCpf("104.632.751-87");
		p2.setRendaBruta(2000);
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Pessoa Fisica 3");
		p3.setCpf("884.377.574-01");
		p3.setRendaBruta(3000);
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Pessoa Juridica 1");
		p4.setCnpj("28.794.828/0001-88");
		p4.setRendaBruta(8000);
		
		PessoaJuridica p5 = new PessoaJuridica();
		p5.setNome("Pessoa Juridica 2");
		p5.setCnpj("66.351.125/0001-74");
		p5.setRendaBruta(12000);
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Pessoa Juridica 3");
		p6.setCnpj("62.967.579/0001-13");
		p6.setRendaBruta(41000);
		
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(Contribuinte c: contribuintes) {
			System.out.println(c.toString());
		}
	}
}
