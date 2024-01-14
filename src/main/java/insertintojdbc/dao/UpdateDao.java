package insertintojdbc.dao;

import insertintojdbc.dao.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;
import insertintojdbc.model.Student;

public class UpdateDao implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query ="insert into students (id, name, city) values (?,?,?)";
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }
}
