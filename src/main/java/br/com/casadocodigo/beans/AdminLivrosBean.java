package br.com.casadocodigo.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.casadocodigo.models.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}

	public void salvar() {
		System.out.println("Livro cadstrado: " + livro);
	}

}
