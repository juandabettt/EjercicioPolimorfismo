package model;

import medio.MedioNotificacion;
import java.util.Date;

public class RecordatorioPagoMatricula extends Notificacion {

    public RecordatorioPagoMatricula() {}

    public RecordatorioPagoMatricula(String codigo, String destinatario, String mensaje,
                                     Date fechaEnvio, String estado, MedioNotificacion medioNotificacion) {
        super(codigo, destinatario, mensaje, fechaEnvio, estado, medioNotificacion);
    }

    @Override
    public void enviar() {
        getMedioNotificacion().enviar(getMensaje(), getDestinatario());
    }
}
