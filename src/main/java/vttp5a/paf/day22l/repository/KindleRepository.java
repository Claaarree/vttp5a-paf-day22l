package vttp5a.paf.day22l.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class KindleRepository {
    
    @Autowired
    JdbcTemplate template;

    public void getAuthorAverageRating(int bookCount, int limit) {
        SqlRowSet rs = template.queryForRowSet(Queries.SQL_AUTHOR_SUMMARY, bookCount, limit);

        if(!rs.next()){
            System.out.println("No authors found");
            return;
        }

        String author = rs.getString("author");
        int count = rs.getInt("bk_count");
        float bookAvg = rs.getFloat("bk_avg");
    }
}
