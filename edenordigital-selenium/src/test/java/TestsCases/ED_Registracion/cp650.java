package TestsCases.ED_Registracion;

import Paquete1.BaseTest;
import Paquete1.Fachadas.Fachada_LoginRedSocial;
import Paquete1.Fachadas.Fachada_Registro;
import login.Steps_Login;
import org.testng.annotations.Test;

public class cp650 extends BaseTest {

    private String usuario = "automationnoregistradoened@gmail.com";
    private String password = "Edenor2019";
    private String dni = "24212881";

    @Test
    public void cp650(){
        Steps_Login sl = new Steps_Login(driver);
        sl.clickTengoUsuarioRegistrarme();
        String parentH = driver.getWindowHandle();
        sl.clickRedSocial(Steps_Login.RedSocial.GMAIL);
        Fachada_LoginRedSocial lrs = new Fachada_LoginRedSocial();
        lrs.loginGmail(usuario,password);
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(parentH);
        Fachada_Registro fr = new Fachada_Registro();
        fr.completarInicioDelRegistro(dni,"Male", "11", "11111111");
    }
}
