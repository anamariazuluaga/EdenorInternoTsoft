package TestsCases.ED_Mail_no_federado;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_Home;
import Paquete1.Fachadas.Fachada_Login;
import org.testng.annotations.Test;

public class cp624_ED_Mail_No_Federado_Mail_Asociado_A_Usuario_Registrado extends BaseTest {

    //624. ED. Mail no federeado. Mail asociado a usuario registrado

    private String email = "a.lisis@yahoo.com";
    private String pass = "Prueba2018";

    @Test
    public void cp624(){
        Fachada_Login fl = new Fachada_Login();
        fl.loginConEmailNoFederado(email,pass);
        Fachada_Home fh =  new Fachada_Home();
        fh.cerrarBienvenida();
        //generarLog(driver.getTitle().equalsIgnoreCase("edenor | Oficina online las 24hs"),"Ingreso a home ED");
    }
}
