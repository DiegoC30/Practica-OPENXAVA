package com.tuempresa.ejemplo1.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class ejemplo1 {

	public static void main(String[] args) throws Exception {
		DBServer.start("ejemplo1-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("ejemplo1"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
