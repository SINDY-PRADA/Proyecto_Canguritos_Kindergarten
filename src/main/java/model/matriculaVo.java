package model;



public class matriculaVo {
    
    private int idMatricula;
    private String fechaMatricula;
    private String Nombre_Estudiante;
    private String Apellido_Estudiante;
    private String Archivo_pdf;
    private String Observacion_Estudiante;
    private String Observacion_Rectora;
    private String estadoMatricula;
    private int idAnolectivo;
    private int idEstudiante;

    
    public matriculaVo(){

    }

    public matriculaVo (int idMatricula, String fechaMatricula, String Nombre_Estudiante, String Apellido_Estudiante, String Archivo_pdf, String Observacion_Estudiante, String Observacion_Rectora, String estadoMatricula, int idAnolectivo, int idEstudiante){

        this.idMatricula = idMatricula;
        this.fechaMatricula = fechaMatricula;
        this.Nombre_Estudiante = Nombre_Estudiante;
        this.Apellido_Estudiante = Apellido_Estudiante;
        this.Archivo_pdf = Archivo_pdf;
        this.Observacion_Estudiante = Observacion_Estudiante;
        this.Observacion_Rectora = Observacion_Rectora;
        this.estadoMatricula = estadoMatricula;
        this.idAnolectivo=idAnolectivo;
        this.idEstudiante=idEstudiante;
    }

    // ID 
        public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }    

    //FECHA
    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    //NOMBRE ESTUDIANTE
    public String getNombreEstu() {
        return Nombre_Estudiante;
    }

    public void setNombreEstu(String Nombre_Estudiante) {
        this.Nombre_Estudiante = Nombre_Estudiante;
    }
    
    //APELLIDO ESTUDIANTE
    public String getApellidoEstu() {
        return Apellido_Estudiante;
    }

    public void setApellidoEstu(String Apellido_Estudiante) {
        this.Apellido_Estudiante = Apellido_Estudiante;
    }

    //ARCHIVO PDF
    public String getArchivo() {
        return Archivo_pdf;
    }

    public void setArchivo(String Archivo_pdf) {
        this.Archivo_pdf = Archivo_pdf;
    }

    //OBSERVACION ESTUDIANTE
    public String getObservacionEstu() {
        return Observacion_Estudiante;
    }

    public void setObservacionEstu(String Observacion_Estudiante) {
        this.Observacion_Estudiante = Observacion_Estudiante;
    }

    //OBSERVACION RECTORA
    public String getObservacionRectora() {
        return Observacion_Rectora;
    }

    public void setObservacionRectora(String Observacion_Rectora) {
        this.Observacion_Rectora = Observacion_Rectora;
    }

    //ESTADO MATRICULA
    public String getEstadoMatricula() {
        return estadoMatricula;
    }

    public void setEstadoMatricula(String estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }

    //LLave foranea de Id Año Lectivo
    public int getIdAnolectivo() {
        return idAnolectivo;
    }

    public void setIdAnolectivo(int idAnolectivo) {
        this.idAnolectivo = idAnolectivo;
    }

    //Llave foranea de Id Estudiante
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
}
