import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void batchInsertEmployees(List<Employee> employees) {
        Session session = entityManager.unwrap(Session.class);
        Transaction transaction = session.beginTransaction();

        int batchSize = 30;
        for (int i = 0; i < employees.size(); i++) {
            session.save(employees.get(i));

            if (i % batchSize == 0) {
               
                session.flush();
                session.clear();
            }
        }

        transaction.commit();
    }
}
