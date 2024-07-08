package renovatio.tareas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import renovatio.tareas.model.Tarea;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
}
