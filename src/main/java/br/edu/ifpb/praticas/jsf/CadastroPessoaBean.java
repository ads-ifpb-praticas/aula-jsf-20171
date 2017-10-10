package br.edu.ifpb.praticas.jsf;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by diogomoreira on 06/09/17.
 */
@Named
@ViewScoped
public class CadastroPessoaBean implements Serializable {

    private List<String> pessoas = new LinkedList<String>();
    private String pessoa;

    public List<String> getPessoas() {
        return Collections.unmodifiableList(pessoas);
    }

    public void cadastrar() {
        pessoas.add(pessoa);
        pessoa = null;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
}