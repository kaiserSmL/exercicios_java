package retangulo;
public class Retangulo {
    private double altura;
    private double base;

    public Retangulo(double alturah, double baseb) {		//construtor da entidade
        if(alturah <=0 || !Double.isFinite(alturah)) {
            throw new IllegalArgumentException("Altura deve ser um valor positivo e finito.");
        }
        if(baseb <=0 || !Double.isFinite(baseb)) {
            throw new IllegalArgumentException("Base deve ser um valor positivo e finito.");
        }
        this.altura = alturah;
        this.base = baseb;
    }

    public double calcularArea() {
        return altura * base;
    }

    public double calcularPerimetro() {
        return 2*altura + 2*base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

}
