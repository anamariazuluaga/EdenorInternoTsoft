package misCuentas;

import helper.CustomAssert;
import modelBase.Steps_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps_MisCuentas extends Steps_Base {



    By TITLE_MIS_CUENTAS = By.xpath("//*[@role='button']//../div/*[text()='Mis cuentas']");
    By BTN_VER_LISTA = By.xpath("//button[.//span[text()='VER LISTA']]");
    By BTN_ASOCIAR_CUENTA = By.xpath("//button/*[text()='Asociar Cuenta' or text()='ASOCIAR CUENTA']");
    By SOMBREADO_CARGANDO_CUENTA = By.xpath("//span[text()='Factura actual']/../../div[@class='styles_detailsAndAmount__VHo29']/div[@class='styles_skeleton__2Mmgs']");
    By BTN_DETALLE_DE_CUENTA = By.xpath("//span[text()='Cuenta']/following::button[2]");
    By BTN_SELECCION_DE_CUENTA = By.xpath("//span[text()='Cuenta']/following::button[1]");
    By OPTION_CUENTA = By.xpath("/html/body/div[4]/div[3]/ul/li"); //By.xpath("//div[@id='simple-menu']/div[2]/ul/li[2]/div/span"); //By.xpath("/html/body/div[4]/div[3]/ul/li[2]");
    By OBSTACULO = By.xpath("//*[@class='jss2827 jss2828']");
    By OPTION_HISTORIA_DE_FACTURAS = By.xpath("//*[text() = 'Historial de facturas y pagos']");
    By BTN_VER_FACTURAS = By.xpath("//*[text() = 'Historial de facturas y pagos']");
    By MONTO_TOTAL = By.xpath("//*[text()='Estado de Cuenta']/following::div[4]");
    By BTN_OPCION_DE_PAGO = By.xpath("//button[.//span[contains(., 'OPCIONES DE PAGO')]]");
    By BTN_EVOLUCION_CONSUMOS = By.xpath("//div[@role='button' and .//*[text()='Evolución de tus consumos']]");

    public Steps_MisCuentas(WebDriver driver) {
        super(driver);
        validate();
    }

    public void validate(){
        CustomAssert.assertTrue("El titulo Mis Cuentas no es visible",waitForElementVisible(TITLE_MIS_CUENTAS));
        CustomAssert.assertTrue("No se encuentra boton 'Ver Lista'", waitForElementVisible(BTN_VER_LISTA));
        CustomAssert.assertTrue("No se encuentra boton 'Asociar cuenta'", waitForElementVisible(BTN_ASOCIAR_CUENTA));
        //WebUI.waitForElementNotPresent(findTestObject(SOMBREADO_CARGANDO_CUENTA), 4)
    }


    public void clickConfiguracionDeCuenta(){
        click(BTN_DETALLE_DE_CUENTA);
    }

    public void clickSelectorDeCuentas(){
        click(BTN_SELECCION_DE_CUENTA);
    }

    public void  clickVerFactura(){
        click(BTN_VER_FACTURAS);
    }

    public void clickHistorialDeFacturas(){
        click(OPTION_HISTORIA_DE_FACTURAS);
        waitForElementNotPresent(OBSTACULO);
    }

    public String obtenerSaldoTotal(){
        waitForElementPresent(MONTO_TOTAL);
        //waitForElementNotPresent(findTestObject(SOMBREADO_CARGANDO_CUENTA), 3)
        String saldo = driver.findElement(MONTO_TOTAL).getText();
        //KeywordUtil.logInfo("Saldo total a pagar: " + saldo);
        return saldo;
    }
    public void clickOpcionesDePago(){
        click(BTN_OPCION_DE_PAGO);
    }

    public void clickAsociarCuenta(){
        click(BTN_ASOCIAR_CUENTA);
    }
    public void clickEvolucionDeConsumos(){
        click(BTN_EVOLUCION_CONSUMOS);
    }

    By inputCuenta = By.xpath("/html/body/div[4]/div[3]/ul/div/div/div/div/div/input");
    public void seleccionarCuenta(String numeroCuenta){
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/div/div/div/div/div/input")).sendKeys(numeroCuenta);
        click(OPTION_CUENTA);
    }

}






