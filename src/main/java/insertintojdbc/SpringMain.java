package insertintojdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import insertintojdbc.dao.UpdateDao;
import insertintojdbc.model.Student;

public class SpringMain {
    public static void main(String[] args) {
        System.out.println("My Program Starts...");
        ApplicationContext context = new ClassPathXmlApplicationContext("insertintojdbc.xml");
        UpdateDao dao = context.getBean("update", UpdateDao.class);

        Student s = new Student();
        s.setId(6);
        s.setName("Will");
        s.setCity("Nagpur");

        int result = dao.insert(s);
        System.out.println("Number of records inserted are: " + result);



//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
          //insert query
//        String query ="insert into students (id, name, city) values (?,?,?)";
          //fire query
//        int result = template.update(query, 3, "Swaraj", "Nagpur");
//        System.out.println("Number of records inserted are: " + result);
    }
}
