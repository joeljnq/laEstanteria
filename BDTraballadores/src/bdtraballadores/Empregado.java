package bdtraballadores;

import java.time.LocalDate;

/**
 *
 * @author marta
 */
public class Empregado {
    private int number;
    private String name;
    private LocalDate birthDate;

    public Empregado(int number, String name, LocalDate birthDate) {
        this.number = number;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Empregado{" + "number=" + number + ", name=" + name + ", birthDate=" + birthDate + '}';
    }
    
    

}
