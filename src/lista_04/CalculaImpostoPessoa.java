package lista_04;

public class CalculaImpostoPessoa extends Pessoa {
	private double salarioPessoa = 0.;
	private double imposto = 0;

	public CalculaImpostoPessoa() {
		super();
	}

	public CalculaImpostoPessoa(String nomePessoa, double salarioPessoa, double imposto) {
		super(nomePessoa);
		this.salarioPessoa = salarioPessoa;
		this.imposto = imposto;
	}

	public double getSalarioPessoa() {
		return salarioPessoa;
	}

	public void setSalarioPessoa(double salarioPessoa) {
		this.salarioPessoa = salarioPessoa;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calculaImposto(String buscaNomePessoa, CalculaImpostoPessoa cp) {
		CalculaImpostoPessoa c = (CalculaImpostoPessoa) cp;

		if (c.getNomePessoa().equalsIgnoreCase(buscaNomePessoa)) {
			if (this.salarioPessoa <= 2000) {
				imposto = 0.;
			}
			if (this.getSalarioPessoa() > 2000 && this.getSalarioPessoa() <= 3500) {
				imposto = this.getSalarioPessoa() * (15 / 100.0);
				this.setImposto(imposto);
			}
			if (this.getSalarioPessoa() > 3500 && this.getSalarioPessoa() <= 5000) {
				imposto = this.getSalarioPessoa() * (22 / 100.0);
				this.setImposto(imposto);
			}
			if (this.getSalarioPessoa() > 5000) {
				imposto = this.getSalarioPessoa() * (30 / 100.0);
				this.setImposto(imposto);
			}

		}

		return imposto;

	}
}
