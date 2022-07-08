package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /**
     * Deve ser Reflexivo: x.equals(x) tem que ser true para tudo diferente de null
     * Simétrico para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
     * Transitividade para x,y e z diferentes de null, se x.equals(y) == true, e x.equals(z) == true, portanto y.equals(z) == true
     * Consistente x.equals(x) sempre retorna true se x for diferente de null
     * Se x é diferente de null, x.equals(null) tem que retornar false
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    /**
     * se x.equals(y) == true, y.hashCode() == x.hasCode()
     * y.hasCode() == x.hashCode() não necessiaramente o y.equals(x) tem que ser true
     * x.equals(y) == false
     * y.hashCode() != x.hashCode(), x.equals(y) deverá ser false
     */
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
