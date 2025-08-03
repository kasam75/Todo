package spring.todo.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
       default boolean existsById(Long todoId, String password) {
        return false;
    }

}
