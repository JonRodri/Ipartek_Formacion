package com.ipartek.formacion.proyecto.excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAlumnos {

	static final String[] ALUMNOS = { "Ander", "Ione", "Itziar", "Mikel", "Ibon", "Miguel", "Pedro", "Diosdado",
			"Sergio", "Jon", "Sara" };

	public static void main(String[] args) throws Exception {

		// definiendo el excel
		XSSFWorkbook libro = new XSSFWorkbook();
		XSSFSheet hoja = libro.createSheet();

		// crear la row
		XSSFRow fila = hoja.createRow(0);

		// rellenando celdas
		for (int i = 0; i < ALUMNOS.length; i++) {
			XSSFCell cell = fila.createCell(i);
			cell.setCellValue(ALUMNOS[i]);
		}

		// generando fichero
		String nombreExcel = "alumnos.xlsx";
		String rutaArchivo = "C:\\hobetuz\\" + nombreExcel;

		File file = new File(rutaArchivo);
		FileOutputStream fileOuS = new FileOutputStream(file);
		libro.write(fileOuS);
		fileOuS.flush();
		fileOuS.close();
	}

}
