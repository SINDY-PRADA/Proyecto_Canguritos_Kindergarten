package model;


public class anolectivoVo {
    
    private int idAnolectivo;
    private String anoInicio;
    private String anoFin;
    private String valorMatricula;
    private String valorPension;
    private boolean estadoAnolectivo;
    
    public anolectivoVo(){

    }

    public anolectivoVo (int idAnolectivo, String anoInicio, String anoFin, String valorMatricula, String valorPension, boolean estadoAnolectivo){

        this.idAnolectivo = idAnolectivo;
        this.anoInicio = anoInicio;
        this.anoFin = anoFin;
        this.valorMatricula = valorMatricula;
        this.valorPension = valorPension;
        this.estadoAnolectivo = estadoAnolectivo;
    }

    // ID 
        public int getIdAnolectivo() {
        return idAnolectivo;
    }

    public void setIdAnolectivo(int idAnolectivo) {
        this.idAnolectivo = idAnolectivo;
    }    

    //AÑO INICIO
    public String getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(String anoInicio) {
        this.anoInicio = anoInicio;
    }

    //AÑO FIN 
    public String getAnoFin() {
        return anoFin;
    }

    public void setAnoFin(String anoFin) {
        this.anoFin = anoFin;
    }

    //VALOR MATRICULA 
    public String getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(String valorMatricula) {
        this.valorMatricula = valorMatricula;
    }


    //VALOR PENSION
    public String getValorPension() {
        return valorPension;
    }

    public void setValorPension(String valorPension) {
        this.valorPension = valorPension;
    }

    //ESTADO
    public boolean getEstadoAnolectivo() {
        return estadoAnolectivo;
    }

    public void setEstadoAnolectivo(boolean estadoAnolectivo) {
        this.estadoAnolectivo = estadoAnolectivo;
    }


}
