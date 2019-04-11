package com.ipartek.formacion.proyecto.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeerExcelKorrika2 {

	public static void main(String[] args) throws Exception {

		String path = "C:\\hobetuz\\proyecto\\resources\\korrika2.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook libro = new XSSFWorkbook(fis);
		XSSFSheet Hoja1 = libro.getSheetAt(0);

		Iterator it = Hoja1.iterator();
		int cont = 0;
		while (it.hasNext()) {

			XSSFRow fila = (XSSFRow) it.next();

			if (cont >= 3) {

				XSSFCell celNombre = fila.getCell(0);
				XSSFCell celTiempo = fila.getCell(1);

				String lugar = celNombre.getStringCellValue();
				Date dateTiempo = celTiempo.getDateCellValue();

				int horas = dateTiempo.getHours();
				int minutos = dateTiempo.getMinutes();

				String horasMostrar = (horas < 10) ? "0" + horas : String.valueOf(horas);
				String minutosMostrar = (minutos < 10) ? "0" + minutos : String.valueOf(minutos);

				if (minutos < 10) {
					System.out.printf("%-20s %s:0%s \n", lugar, horas, minutos);
				} else {
					System.out.printf("%-20s %s:%s \n", lugar, horas, minutos);
				}

			}
			cont++;

		}

		// System.out.println(segundaHoja);

	}

}
