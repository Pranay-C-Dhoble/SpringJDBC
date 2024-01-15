package springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteData implements DeleteDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int delete(int id) {
        String query = "delete from students where id=?";
        int result = this.jdbcTemplate.update(query, id);
        return result;
    }
}
