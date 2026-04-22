package model;

import medio.MedioNotificacion;
import java.util.Date;

public abstract class Notificacion {

    private String codigo;
    private String destinatario;
    private String mensaje;
    private Date fechaEnvio;
    private String estado;
    private MedioNotificacion medioNotificacion;

    public Notificacion() {}

    public Notificacion(String codigo, String destinatario, String mensaje,
                        Date fechaEnvio, String estado, MedioNotificacion medioNotificacion) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.medioNotificacion = medioNotificacion;
    }

    public abstract void enviar();

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDestinatario() { return destinatario; }
    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public Date getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(Date fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public MedioNotificacion getMedioNotificacion() { return medioNotificacion; }
    public void setMedioNotificacion(MedioNotificacion medioNotificacion) { this.medioNotificacion = medioNotificacion; }
}
