package transactionManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    private ThrowExceptionComponent throwExceptionComponent;

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void transactionRequire() {
        Student student = new Student("Husnu");
        studentDao.save(student);
        try {
            throwExceptionComponent.throwRuntimeWithRequired();
        } catch (RuntimeException e) {
            System.out.println("handled exception:" + e);
        }
    }

    @Transactional
    public void transactionRequireNew() {
        Student student = new Student("Husnu");
        studentDao.save(student);
        try {
            throwExceptionComponent.throwRuntimeWithRequiredNew();
        } catch (RuntimeException e) {
            System.out.println("handled exception:" + e);
        }

    }

}
