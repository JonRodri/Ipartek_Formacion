package com.ipartek.formacion.proyecto.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelColumna {

	static final String[] ALUMNOS = { "Ander", "Ione", "Itziar", "Mikel", "Ibon", "Miguel", "Pedro", "Diosdado",
			"Sergio", "Jon", "Sara" };

	public static void main(String[] args) throws Exception {

		// definiendo el excel
		XSSFWorkbook libro = new XSSFWorkbook();
		XSSFSheet hoja = libro.createSheet();

		// crear la row
		//

		// rellenando celdas
		for (int i = 0; i < ALUMNOS.length; i++) { // filas
			XSSFRow fila = hoja.createRow(i);
			// celda alumno
			XSSFCell cell = fila.createCell(0); // 1 celda
			cell.setCellValue(ALUMNOS[i]);

			// Celda tiempo
			XSSFCell cellTiempo = fila.createCell(1);
			LocalDateTime now = LocalDateTime.now();
			cellTiempo.setCellValue(now.toString());
		}

		// generando fichero
		String nombreExcel = "alumnoscolum.xlsx";
		String rutaArchivo = "C:\\hobetuz\\" + nombreExcel;

		File file = new File(rutaArchivo);
		FileOutputStream fileOuS = new FileOutputStream(file);
		libro.write(fileOuS);
		fileOuS.flush();
		fileOuS.close();
	}

}
