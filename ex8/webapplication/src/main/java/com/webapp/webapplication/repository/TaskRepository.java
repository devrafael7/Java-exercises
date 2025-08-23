import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.webapplication.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
    List<Task> findByUserId(Long, userId);
}