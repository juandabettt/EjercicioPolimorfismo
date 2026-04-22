package medio;

public class MensajeTexto implements MedioNotificacion {

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando mensaje de texto a " + destinatario + ": " + mensaje);
    }
}
