package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = new Employee("Sergey", "Popov", "VP", 75000);
//            Detail detail = new Detail("Moscow", "1226", "www@ya.ru");
//            employee.setEmpDetail(detail);
//
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = new Employee("Shok", "Grebeshok", "School", 35000);
//            Detail detail = new Detail("SPB", "8666", "OOO@ya.ru");
//            employee.setEmpDetail(detail);


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
