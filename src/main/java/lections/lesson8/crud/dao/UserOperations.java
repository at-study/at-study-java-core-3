package lections.lesson8.crud.dao;

import java.util.List;

import lections.lesson8.crud.dao.crud.Crud;
import lections.lesson8.crud.model.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class UserOperations implements Crud<User> {

    @Override
    public void create(User user) {
        String query = "INSERT INTO users VALUES ....";
        // Выполнение запроса
    }

    @Override
    public void update(int id, User user) {
        String query = "UPDATE .... WHERE id = " + id;
        // Выполнение запроса
    }

    @Override
    public List<User> read() {
        String query = "SELECT * FROM users";
        // Обработка результатов
        // TODO: Переделать после выполнения задачи
        throw new NotImplementedException();
    }

    @Override
    public User read(int id) {
        String query = "SELECT * FROM users WHERE id = " + id;
        // Обработка результатов
        // TODO: Переделать
        throw new NotImplementedException();
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM users WHERE id = " + id;
        // Выполнение запроса
    }
}
