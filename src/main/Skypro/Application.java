import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;

import model.Employee;

import java.sql.*;
import java.util.List;


public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        // Создаем параметры объекта
        Employee Taras = new Employee("Taras", "Tarasov", "Male", 60,3);
         // Создаем объект
        employeeDAO.create(Taras);

        // Получаем объект по id
        System.out.println(employeeDAO.getById(8));

        // Получаем полный список объектов
        List<Employee> list = employeeDAO.getAllEmployee();
        for (Employee employee : list) {
            System.out.println(employee);
        }

        // Создаем параметры изменения
        Employee Taras2 = new Employee(8,"Taras", "Tarasov", "Male", 62,3);
        // Изменяем объект
        employeeDAO.updateByID(Taras2);
        // Удаляем объект
        employeeDAO.deleteById(Taras2);
    }
}