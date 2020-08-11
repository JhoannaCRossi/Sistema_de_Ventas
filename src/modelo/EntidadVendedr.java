
package modelo;

public class EntidadVendedr {
      
   //class variables
   private int id;
   private String dni;
   private String names;
   private String telephone;
   private String state;
   private String user;
   
   public EntidadVendedr(){
   
   }

    public EntidadVendedr(int id, String dni, String names, String telephone, String state, String user) {
        this.id = id;
        this.dni = dni;
        this.names = names;
        this.telephone = telephone;
        this.state = state;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
   
}
