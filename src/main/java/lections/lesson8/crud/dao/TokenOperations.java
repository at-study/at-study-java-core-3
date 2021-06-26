package lections.lesson8.crud.dao;

import java.util.List;

import lections.lesson8.crud.dao.crud.Crud;
import lections.lesson8.crud.model.Token;

public class TokenOperations implements Crud<Token> {

    @Override
    public void create(Token token) {
        String query = "INSERT INTO tokens VALUES .......";
    }

    @Override
    public void update(int id, Token token) {

    }

    @Override
    public List<Token> read() {
        return null;
    }

    @Override
    public Token read(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
