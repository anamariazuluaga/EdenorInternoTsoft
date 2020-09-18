package TestsCases.ED_Ventana_principal.ED_Ventana_principal_Seguinos;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Home;
import Paquete1.Fachadas.Fachada_Login;
import home.Steps_Home;
import org.testng.annotations.Test;

public class cp604_ED_Ventana_principal_Seguinos_Facebook extends BaseTest {

    private String email = "a.lisis@yahoo.com";
    private String pass = "Prueba2018";

    //604. ED.Ventana principal. Seguinos. Facebook
    @Test
    public void cp_604(){
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(email,pass);
        Fachada_Home fh = new Fachada_Home();
        fh.cerrarBienvenida();
        fh.verificarSeguinosEnRedesSociales(Steps_Home.RedSocialSeguinos.FACEBOOK);
    }
}