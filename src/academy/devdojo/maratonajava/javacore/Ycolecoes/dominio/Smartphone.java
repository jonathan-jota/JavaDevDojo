package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /**Deve ser Reflexivo: x.equals(x) tem que ser true para tudo diferente de null
     * Simétrico para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
     * Transitividade para x,y e z diferentes de null, se x.equals(y) == true, e x.equals(z) == true, portanto y.equals(z) == true
     * Consistente x.equals(x) sempre retorna true se x for diferente de null
     * Se x é diferente de null, x.equals(null) tem que retornar false
     */

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return  serialNumber != null && serialNumber.equals(smartphone.serialNumber);
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
