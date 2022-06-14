package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        Util.getSessionFactory();
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();


        userDao.saveUser("Ivan", "Novicov", (byte) 30);
        userDao.saveUser("Missy", "Master", (byte) 31);
        userDao.saveUser("Mike", "Diokis", (byte) 32);
        userDao.saveUser("Nikki", "Nellen", (byte) 30);

        userDao.getAllUsers();
        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
