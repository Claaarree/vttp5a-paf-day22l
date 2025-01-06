package vttp5a.paf.day22l.repository;

public class Queries {
    
    public static String SQL_AUTHOR_SUMMARY = """
        select author, count(title) books_count, avg(stars) bk_avg
            from kindle
            where author != ''
            group by author
            having books_count > ?
            order by books_count desc
            limit ?;
            """;
}
