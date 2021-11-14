package jdbc;

public class Developer {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void doWork() {
		System.out.println("Developer work start");
		jdbcTemplate.update("update med set name=? where id=?","ABCD",1);
		// update delete insert
		System.out.println("Developer work end");
	}
}
