package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import model.Aluno;

public class LerExcel {
	private static final String fileName = "C:/Teste/teste.xls";

	public static void main(String[] args) {

		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		try {
//			cria um objeto para aquivo
			FileInputStream arquivo = new FileInputStream(new File(LerExcel.fileName));
//			
			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
//		
			HSSFSheet sheetAlunos = workbook.getSheetAt(0);

//manipular as info e interagir
			Iterator<Row> rowIterator = sheetAlunos.iterator();
//manipula a celula 
			while (rowIterator.hasNext()) {
//next percorre a linha e le a proxima linha HasNext vefifica se tem uma proxima linha 
				Row row = rowIterator.next();
//pega as info das celulas e
				Iterator<Cell> cellIterator = row.cellIterator();

				//Aluno aluno = new Aluno();

//para cada linha manipula uma celula
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
//				em qual coluna de indice a celula esta 
					switch (cell.getColumnIndex()) {
					case 0:
//						pega String
						System.out.print(cell.getStringCellValue()+ " - ");
						break;
					case 1:
//						so aceita numero
						System.out.print(cell.getNumericCellValue()+ " - ");
						break;
					case 2:
						System.out.print(cell.getNumericCellValue()+ " - ");
						break;
					case 3:
						System.out.print(cell.getNumericCellValue()+ " - ");
						break;
					case 4:
						System.out.print(cell.getNumericCellValue()+ "\n");
						break;

					}
				}
			}// ao fim de ler todos os arquivo
			arquivo.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo não encontrado!!");
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
