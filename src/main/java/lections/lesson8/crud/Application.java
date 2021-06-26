package lections.lesson8.crud;

import java.util.List;

import lections.lesson8.crud.dao.UserOperations;
import lections.lesson8.crud.dao.crud.Crud;
import lections.lesson8.crud.model.User;

public class Application {

    static Crud<User> userDao = new UserOperations();

    public static void main(String[] args) {
        User user = new User();
        user.id = 5;

        userDao.create(user);
        List<User> users = userDao.read();

        Crud<User> userCrud = new UserOperations();
    }
}
