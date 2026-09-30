package Recuperacion;

public class Peleador extends Torneo{
    private String nombre;
    private Long nivelPoder;
    private Long vida;
    private String habilidadEspecial;

    public Peleador(String nombre, Long nivelPoder, Long vida, String habilidadEspecial) {
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
        this.vida = vida;
        this.habilidadEspecial = habilidadEspecial;
    }

    public Peleador() {

    }

    public void setNivelPoder(Long nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getNivelPoder() {
        return nivelPoder;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    @Override
    public String toString() {
        return "Participante: " + getNombre() + " (" + getNivelPoder() + ") nivel de Poder.";
    }
}
