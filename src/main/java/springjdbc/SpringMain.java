package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springjdbc.dao.DeleteData;
import springjdbc.dao.UpdateData;
import springjdbc.model.Student;

public class SpringMain {
    public static void main(String[] args) {
        System.out.println("My Program Starts...");
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");

        //Delete Data from Database
        DeleteData dao = context.getBean("delete", DeleteData.class);
        int result = dao.delete(2);
        System.out.println("Number of records deleted are: " + result);


        //Update Data into DataBase.
//        UpdateData dao = context.getBean("update", UpdateData.class);
//        Student s = new Student();
//        s.setId(2);
//        s.setName("Rahul Kumar");
//        s.setCity("Rajastan");
//        int result = dao.update(s);
//        System.out.println("Number of record Updated are: " + result);



        //Insert Data into Database.
//        InsertData dao = context.getBean("insertdata", InsertData.class);
//        Student s = new Student();
//        s.setId(6);
//        s.setName("Will");
//        s.setCity("Nagpur");
//
//        int result = dao.insert(s);
//        System.out.println("Number of records inserted are: " + result);



//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
          //insert query
//        String query ="insert into students (id, name, city) values (?,?,?)";
          //fire query
//        int result = template.update(query, 3, "Swaraj", "Nagpur");
//        System.out.println("Number of records inserted are: " + result);
    }
}
