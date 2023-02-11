import dao.CityDAO;
import dao.CityDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;

import model.City;
import model.Employee;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        // Урок 8. Hibernate: работа с несколькими таблицами 08.02.23

        CityDAO cityDAO = new CityDAOImpl();

        City Surgut = new City("Surgut");
        cityDAO.createCity(Surgut);

//        Employee Taras = new Employee("Taras", "Tarasov", "Male", 60);
//        City Surgut = cityDAO.getByIdCity(8);
//        Taras.setCity_id(Surgut);
//        employeeDAO.create(Taras);

//        City Surgut = cityDAO.getByIdCity(8);
//        cityDAO.deleteCity(Surgut);


        //________________________________________
        // Урок 7.Hibernate: введение, Entity 07.02.23

//        // Создаем параметры объекта
//        Employee Taras = new Employee("Taras", "Tarasov", "Male", 60,3);
//         // Создаем объект
//        employeeDAO.create(Taras);
//
//        // Получаем объект по id
//        System.out.println(employeeDAO.getById(8));
//
//        // Получаем полный список объектов
//        List<Employee> list = employeeDAO.getAllEmployee();
//        for (Employee employee : list) {
//            System.out.println(employee);
//        }
//
//        // Создаем параметры изменения
//        Employee Taras2 = new Employee(8,"Taras", "Tarasov", "Male", 62,3);
//       // Изменяем объект
//        employeeDAO.update(Taras2);
//        // Удаляем объект
//        employeeDAO.delete(Taras2);
    }
}