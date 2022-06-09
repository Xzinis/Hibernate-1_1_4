package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;




public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();


        userService.saveUser("Ivan", "Novicov", (byte) 30);
        userService.saveUser("Missy", "Master", (byte) 31);
        userService.saveUser("Mike", "Diokis", (byte) 32);
        userService.saveUser("Nikki", "Nellen", (byte) 30);

        userService.getAllUsers();
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
