package model;


public class usuarioVo {
    
    private int idUsuario;
    private String username;
    private String pass;
    private boolean estadoUsuario;
    private String nivel;
    
    public usuarioVo(){

    }

    public usuarioVo (int idUsuario, String username, String pass, boolean estadoUsuario, String nivel){

        this.idUsuario = idUsuario;
        this.username = username;
        this.pass = pass;
        this.estadoUsuario = estadoUsuario;
        this.nivel = nivel;
    }

    // ID 
        public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }    

    //NOMBRE
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //CONTRASEÑA
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    //ESTADO
    public boolean getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    //nivel
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
     
}
