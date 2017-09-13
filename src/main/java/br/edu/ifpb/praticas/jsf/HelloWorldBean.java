package br.edu.ifpb.praticas.jsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by diogomoreira on 05/09/17.
 */
@Named
@SessionScoped
public class HelloWorldBean implements Serializable {

    private String nome = "Diogo Moreira";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
