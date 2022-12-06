package model;


public class acudienteVo {
    
    private int idAcudiente;
    private String parentescoAcudiente;
    private String nombreAcudiente;
    private String apellidoAcudiente;
    private String tipoDocumento;
    private String documentoAcudiente;
    private String profesionAcudiente;
    private String telefonoAcudiente;
    private String direccionAcudiente;
    private String correoAcudiente;
    private boolean estadoAcudiente;
    
    public acudienteVo(){

    }

    public acudienteVo (int idAcudiente, String parentescoAcudiente, String nombreAcudiente, String apellidoAcudiente, String tipoDocumento, 
    String documentoAcudiente, String profesionAcudiente, String telefonoAcudiente,String direccionAcudiente, String correoAcudiente, boolean estadoAcudiente){

        this.idAcudiente = idAcudiente;
        this.parentescoAcudiente = parentescoAcudiente;
        this.nombreAcudiente = nombreAcudiente;
        this.apellidoAcudiente = apellidoAcudiente;
        this.tipoDocumento = tipoDocumento;
        this.documentoAcudiente = documentoAcudiente;
        this.profesionAcudiente = profesionAcudiente;
        this.telefonoAcudiente = telefonoAcudiente;
        this.direccionAcudiente = direccionAcudiente;
        this.correoAcudiente = correoAcudiente;
        this.estadoAcudiente = estadoAcudiente;
    }

    // ID 
        public int getIdAcudiente() {
        return idAcudiente;
    }

    public void setIdAcudiente(int idAcudiente) {
        this.idAcudiente = idAcudiente;
    }    

    //PARENTESCO
    public String getParentescoAcudiente() {
        return parentescoAcudiente;
    }

    public void setParentescoAcudiente(String parentescoAcudiente) {
        this.parentescoAcudiente = parentescoAcudiente;
    }

    //NOMBRE
    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    //APELLIDO
    public String getApellidoAcudiente() {
        return apellidoAcudiente;
    }

    public void setApellidoAcudiente(String apellidoAcudiente) {
        this.apellidoAcudiente = apellidoAcudiente;
    }

    //TIPO DOCUMENTO
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    //DOCUMENTO
    public String getDocumentoAcudiente() {
        return documentoAcudiente;
    }

    public void setDocumentoAcudiente(String documentoAcudiente) {
        this.documentoAcudiente = documentoAcudiente;
    }
    
    //PROFESION 
    public String getProfesionAcudiente() {
        return profesionAcudiente;
    }

    public void setProfesionAcudiente(String profesionAcudiente) {
        this.profesionAcudiente = profesionAcudiente;
    }

    //TELEFONO 
    public String getTelefonoAcudiente() {
        return telefonoAcudiente;
    }

    public void setTelefonoAcudiente(String telefonoAcudiente) {
        this.telefonoAcudiente = telefonoAcudiente;
    }

    //DIRECCION 
    public String getDireccionAcudiente() {
        return direccionAcudiente;
    }

    public void setDireccionAcudiente(String direccionAcudiente) {
        this.direccionAcudiente = direccionAcudiente;
    }

    //CORREO 
    public String getCorreoAcudiente() {
        return correoAcudiente;
    }

    public void setCorreoAcudiente(String correoAcudiente) {
        this.correoAcudiente = correoAcudiente;
    }

    //ESTADO
    public boolean getEstadoAcudiente() {
        return estadoAcudiente;
    }

    public void setEstadoAcudiente(boolean estadoAcudiente) {
        this.estadoAcudiente = estadoAcudiente;
    }


}
