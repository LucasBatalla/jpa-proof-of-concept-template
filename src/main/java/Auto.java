import javax.persistence.*;

@Entity
public class Auto {

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne
  @JoinColumn(name="id_equipo")
  private Equipo equipo;

  public Auto(Equipo equipo, String modelo, String marca, String rodado, float peso) {
    this.equipo = equipo;
    this.modelo = modelo;
    this.marca = marca;
    this.rodado = rodado;
    this.peso = peso;
  }

  private String modelo;

  private String marca;

  private String rodado;

  private float peso;

}
