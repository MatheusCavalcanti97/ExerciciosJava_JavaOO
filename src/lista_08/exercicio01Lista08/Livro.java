package lista_08.exercicio01Lista08;

public class Livro {
	protected Autor autorLivro;
	protected Editora editoraLivro;
	protected String isbn;
	protected String tituloLivro;
	protected String anoDeEdicaoLivro;

	public Livro() {
		super();
	}

	public Livro(Autor autorLivro, Editora editoraLivro, String isbn, String tituloLivro, String anoDeEdicaoLivro) {
		super();
		this.autorLivro = autorLivro;
		this.editoraLivro = editoraLivro;
		this.isbn = isbn;
		this.tituloLivro = tituloLivro;
		this.anoDeEdicaoLivro = anoDeEdicaoLivro;
	}

	public Autor getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(Autor autorLivro) {
		this.autorLivro = autorLivro;
	}

	public Editora getEditoraLivro() {
		return editoraLivro;
	}

	public void setEditoraLivro(Editora editoraLivro) {
		this.editoraLivro = editoraLivro;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTituloLivro() {
		return tituloLivro;
	}

	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	public String getAnoDeEdicaoLivro() {
		return anoDeEdicaoLivro;
	}

	public void setAnoDeEdicaoLivro(String anoDeEdicaoLivro) {
		this.anoDeEdicaoLivro = anoDeEdicaoLivro;
	}

	@Override
	public String toString() {

		return "Nome Autor: " + this.getAutorLivro().getNomeAutor() + "\nTítulo do Livro: " + this.getTituloLivro();
	}

	public String toStringNomeAutores() {
		return "Nome Autor: " + this.getAutorLivro().getNomeAutor();
	}
	
	public String toStringNomeEditoras() {
		return "Nome Editora: " + this.getEditoraLivro().getNomeEditora();
	}

}
