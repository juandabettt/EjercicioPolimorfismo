package medio;

public class CorreoElectronico implements MedioNotificacion {

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}
