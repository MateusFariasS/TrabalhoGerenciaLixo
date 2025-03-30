public class CaminhaoPequeno {
    private String id ;
    private int capacidade;
    private double cargaAtual;
    private int viagensRealizadas;
    private String status;

    public CaminhaoPequeno(int capacidade){
        this.id = id;
        this.capacidade = capacidade;
        this.cargaAtual = 0;
        this.viagensRealizadas = 0;
        this.status = "disponível";
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public int getViagensRealizadas() {
        return viagensRealizadas;
    }

    public void setViagensRealizadas(int viagensRealizadas) {
        this.viagensRealizadas = viagensRealizadas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
