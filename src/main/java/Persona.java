import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Persona {

  @Id
  @GeneratedValue
  private long id;

  private String nombre;

  private LocalDate fechaNacimiento;

  @ManyToOne
  @JoinColumn(name="id_equipo")
  private Equipo equipo;

  private int numDoc;
}
