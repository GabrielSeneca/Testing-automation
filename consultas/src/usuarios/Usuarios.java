// Plantilla de uso múltiple
//package usuarios;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//public class Usuarios {
       // private static WebDriver driver = null;
    //public static void main(String[] args) throws InterruptedException {
      //2. En donde está el archivo WebDriver
       // System.setProperty("webdriver.chrome.driver",
               // );
        //3. para abrir un navegador en blanco
       // driver = new ChromeDriver(); 
        //---------------    Código obtenido de Selenium IDE
       // driver.get("https://www.infobae.com");
       // driver.manage().window().maximize();
 //////////////////////////////////////////////
 // Código específico de esta página generado por Selenium IDE
 
 
 
 
 
 /////////////////////////////////////////////
    
        //5. Tiempo de espera 3 segundos.
       // Thread.sleep(3000); 
        //6. Cerrar el navegador        
        //driver.close();       
   // }
    
//}

// Plantilla de uso múltiple
package usuarios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usuarios {
        private static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
       // abrir el archivo de texto
       String texto;
       String respuesta;// guardará los datos del buffer
       FileReader lector = new FileReader("prueba.txt");
       BufferedReader contenido = new BufferedReader(lector);
      
        //2. En donde está el archivo WebDriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Casa\\Desktop\\Curso Testing Codo\\chromedriver.exe");
        //3. para abrir un navegador en blanco
        driver = new ChromeDriver(); 
        //---------------    Código obtenido de Selenium IDE
        driver.get("https://emaras.com.ar/testing/usuyclave.html");
        driver.manage().window().maximize();
        
while( (texto=contenido.readLine())!=null ) {
 
 // Código específico de esta página generado por Selenium IDE
    driver.findElement(By.id("usuario")).click();
    driver.findElement(By.id("usuario")).sendKeys(texto);
        texto=contenido.readLine();
    driver.findElement(By.id("clave")).click();
    driver.findElement(By.id("clave")).sendKeys(texto);
    driver.findElement(By.name("B1")).click();
    Thread.sleep(2000); 
    
    respuesta= driver.getPageSource();
    if(respuesta.contains("Clave incorrecta!")){
        System.out.println("OK");
    }else {
        System.out.println("Error");
    }

    driver.findElement(By.id("volver")).click();
    Thread.sleep(2000); 

       }
  
        //6. Cerrar el navegador        
        driver.close();       
    }
    
}

