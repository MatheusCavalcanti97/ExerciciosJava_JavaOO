package lista_04;

import java.util.List;

public class PessoaIMC extends Pessoa {
	Double pesoPessoa = null, alturaPessoa = null, imcPessoa = null;

	public PessoaIMC(String nomePessoa) {
		super(nomePessoa);
	}

	public PessoaIMC(String nomePessoa, Double pesoPessoa, Double alturaPessoa, Double imcPessoa) {
		super(nomePessoa);
		this.pesoPessoa = pesoPessoa;
		this.alturaPessoa = alturaPessoa;
		this.imcPessoa = imcPessoa;
	}

	public Double getPesoPessoa() {
		return pesoPessoa;
	}

	public void setPesoPessoa(Double pesoPessoa) {
		this.pesoPessoa = pesoPessoa;
	}

	public Double getAlturaPessoa() {
		return alturaPessoa;
	}

	public void setAlturaPessoa(Double alturaPessoa) {
		this.alturaPessoa = alturaPessoa;
	}

	public Double getImcPessoa() {
		return imcPessoa;
	}

	public void setImcPessoa(Double imcPessoa) {
		this.imcPessoa = imcPessoa;
	}

	public double calculaImc(List<PessoaIMC> info_Pessoas) {
		double imc = 0;
		List<PessoaIMC> calcIMC = (List<PessoaIMC>) info_Pessoas;
		imc = this.getPesoPessoa() / (this.getAlturaPessoa() * this.getAlturaPessoa());
		this.setImcPessoa(imc);
		return this.getImcPessoa();
	}

	public String imcsPessoas(List<PessoaIMC> info_Pessoas) {
		
		List<PessoaIMC> calcImcs = (List<PessoaIMC>) info_Pessoas ;
		int pessoasAbaixoPeso = 0, pessoasNoPesoIdeal = 0, pessoasAcimaDoPeso = 0;
		String resp = "";

		for (int i = 0; i < calcImcs.size(); i++) {
			if (calcImcs.get(i).imcPessoa < 18.5) {
				pessoasAbaixoPeso += 1;
			}

			if (calcImcs.get(i).imcPessoa > 18.5 && calcImcs.get(i).imcPessoa < 25) {
				pessoasNoPesoIdeal += 1;
			}

			if (calcImcs.get(i).imcPessoa >= 25) {
				pessoasAcimaDoPeso += 1;
			}
		}

		resp += "Relatorio do IMC's da Pessoas Inseridas." + "\n1 - Nº Pessoas Abaixo do Peso: " + pessoasAbaixoPeso
				+ "\n2 - Nº de Pessoas que estão no Peso Ideal: " + pessoasNoPesoIdeal
				+ "\n3 - Nº de Pessoas que estão Acima do Peso: " + pessoasAcimaDoPeso;

		return resp;

	}
}
