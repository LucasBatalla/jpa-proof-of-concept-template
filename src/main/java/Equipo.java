import javax.persistence.*;
import java.util.List;
@Entity
public class Equipo {

  @Id
  @GeneratedValue
  private long id;

  private String nombre;

  @Transient
  private List<Persona> personas;

  @Transient
  private List<Auto> autos;

  public Equipo(String nombre, List<Persona> personas, List<Auto> autos) {
    this.nombre = nombre;
    this.personas = personas;
    this.autos = autos;
  }
}
