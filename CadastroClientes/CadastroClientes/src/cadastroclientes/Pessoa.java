
package cadastroclientes;


public class Pessoa {
    private int id;
    private String name;
    private String cpf;
    private String City;
    private String State;
    private String Address;

    public Pessoa(String name, String cpf, String City, String State, String Address) {
        this.name = name;
        this.cpf = cpf;
        this.City = City;
        this.State = State;
        this.Address = Address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
}
