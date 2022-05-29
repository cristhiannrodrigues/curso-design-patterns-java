package br.com.alura.loja;

public class DomainException extends RuntimeException {

    private static final long serialVesionUID = 1L;

    public DomainException(String ex) {

        super(ex);

    }

}
