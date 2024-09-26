
package tallerlinkedlist;


public class Estudiante {
       	String nombre; 
	int id; 
	double Promedio; 
  public Estudiante(String nombre, int id, double Promedio) {
        this.nombre = nombre;
        this.id = id;
        this.Promedio = Promedio;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", id=" + id + ", Promedio=" + Promedio + '}';
    }

  
 
}
