package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import springjdbc.dao.UpdateDao;
import springjdbc.model.Student;

public class SpringMain {
    public static void main(String[] args) {
        System.out.println("My Program Starts...");
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
        UpdateDao dao = context.getBean("update", UpdateDao.class);

        Student s = new Student();
        s.setId(4);
        s.setName("Firoj");
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
