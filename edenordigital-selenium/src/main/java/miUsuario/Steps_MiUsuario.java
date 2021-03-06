package miUsuario;

import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_MiUsuario extends Steps_Base {

    protected By OPCION_DELEGAR_CUENTAS = By.xpath("//span[text()='Delegar cuentas']");
    protected By OPCION_ADMINISTRAR_NOTIFICACIONES = By.xpath("//span[text()='Administrar notificaciones']");
    protected By OPCION_DATOS_DE_CONTACTO = By.xpath("//span[text()='Datos personales']");
    private By HEADER_MI_USUARIO =By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div/span"); //By.xpath("//span[text()='Mi usuario']");
    private By OPCION_CERRAR_SESION = By.xpath("/html/body/div[1]/div/div[2]/div[3]/button"); //By.xpath("//span[text()='Cerrar sesión']");
    private By OPCION_GENERICO = By.xpath("//span[text()='${opcion}']");
    private By BOTON_CERRAR_SESION = By.xpath("/html/body/div[4]/div[3]/div/div[3]/button[2]");

    public enum OpcionesMiUsuario {
        DELEGAR_CUENTAS,
        ADMINISTRAR_NOTIFICACIONES,
        DATOS_DE_CONTACTO,
        OTRA_OPCION;
    }

    public Steps_MiUsuario(WebDriver driver) {
        super(driver);
        checkVisibility(HEADER_MI_USUARIO);
        checkVisibility(OPCION_CERRAR_SESION);
        //waitForObject(HEADER_MI_USUARIO)
        //waitForObject(OPCION_CERRAR_SESION)
    }
    public void seleccionarOpcion(OpcionesMiUsuario opcion) {
        switch (opcion) {
            case DELEGAR_CUENTAS:
                verifyAndClick(OPCION_DELEGAR_CUENTAS);
                break;
            case DATOS_DE_CONTACTO:
                verifyAndClick(OPCION_DATOS_DE_CONTACTO);
                break;
            case ADMINISTRAR_NOTIFICACIONES:
                verifyAndClick(OPCION_ADMINISTRAR_NOTIFICACIONES);
                break;
            default:
                break;
        }
    }

    public void  seleccionarOpcion(String opcion){
        click(OPCION_GENERICO);
    }

    public void clickOpcionCerrarSesion(){
        click(OPCION_CERRAR_SESION);
    }

    public void clickBotonCerrarSesion(){
        click(BOTON_CERRAR_SESION);
    }


}
