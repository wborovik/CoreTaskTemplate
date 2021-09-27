package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Ivan", "Sergeev", (byte) 47);
        userService.saveUser("Vladimir", "Matveev", (byte) 21);
        userService.saveUser("Sergey", "Vetrov", (byte) 34);
        userService.saveUser("Andrey", "Filatov", (byte) 12);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
