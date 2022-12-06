package model;


public class estudianteVo {
    
    private int idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String tipoDocumento;
    private String documentoEstudiante;
    private String fechaNacimiento;
    private String rhEstudiante;
    private String ciudadNacimiento;
    private String direccionEstudiante;
    private String sexoEstudiante;
    private boolean estadoEstudiante;
    private int idAcudiente;
    
    public estudianteVo(){

    }

    public estudianteVo (int idEstudiante, String nombreEstudiante, String apellidoEstudiante, String tipoDocumento, String documentoEstudiante, 
    String fechaNacimiento, String rhEstudiante, String ciudadNacimiento,String direccionEstudiante, String sexoEstudiante, boolean estadoEstudiante, int idAcudiente){

        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.tipoDocumento = tipoDocumento;
        this.documentoEstudiante = documentoEstudiante;
        this.fechaNacimiento = fechaNacimiento;
        this.rhEstudiante = rhEstudiante;
        this.ciudadNacimiento = ciudadNacimiento;
        this.direccionEstudiante = direccionEstudiante;
        this.sexoEstudiante = sexoEstudiante;
        this.estadoEstudiante = estadoEstudiante;
        this.idAcudiente=idAcudiente;
    }

    // ID 
        public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }    

    //NOMBRE
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    //APELLIDO
    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    //TIPO DOCUMENTO
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    //DOCUMENTO
    public String getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(String documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }

    //FECHA NACIMIENTO
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Rh 
    public String getRhEstudiante() {
        return rhEstudiante;
    }

    public void setRhEstudiante(String rhEstudiante) {
        this.rhEstudiante = rhEstudiante;
    }

    //CIUDAD NACIMIENTO 
    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    //DIRECCION 
    public String getDireccionEstudiante() {
        return direccionEstudiante;
    }

    public void setDireccionEstudiante(String direccionEstudiante) {
        this.direccionEstudiante = direccionEstudiante;
    }

    //SEXO 
    public String getSexoEstudiante() {
        return sexoEstudiante;
    }

    public void setSexoEstudiante(String sexoEstudiante) {
        this.sexoEstudiante = sexoEstudiante;
    }

    //ESTADO
    public boolean getEstadoEstudiante() {
        return estadoEstudiante;
    }

    public void setEstadoEstudiante(boolean estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }

    //LLAVE FORANEA
    public int getIdAcudiente() {
        return idAcudiente;
    }

    public void setIdAcudiente(int idAcudiente) {
        this.idAcudiente = idAcudiente;
    }


}
