package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Roman","Sidorov", (byte) 38);
        userService.saveUser("Ivan","Ivanov", (byte) 45);
        userService.saveUser("Nikolai","Nikolaev", (byte) 34);
        userService.saveUser("Marina","Sivtcova", (byte) 25);

        userService.getAllUsers();
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();
   }
}
