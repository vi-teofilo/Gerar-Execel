/**
 * 
 */
package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import model.Aluno;

/**
 * @author vfurtado
 *
 */
public class CriarExcel {

	private static final String fileName = "C:/Teste/novo.xls";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		planilha criada 
		HSSFWorkbook workbook = new HSSFWorkbook();

		HSSFSheet sheetAlunos = workbook.createSheet("Alunos");
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		listaAlunos.add(new Aluno("Vitória", "123", 9.0, 8.0, 10.0, true));
		listaAlunos.add(new Aluno("João", "256", 5.0, 6.0, 10.0, true));
		listaAlunos.add(new Aluno("Welligton", "531", 7.0, 8.0, 9.0, true));
		listaAlunos.add(new Aluno("Pedro", "574", 8.0, 8.0, 10.0, true));
		listaAlunos.add(new Aluno("Vinicius", "354", 3.0, 4.0, 0.0, false));
		listaAlunos.add(new Aluno("Claudio", "234", 4.0, 1.0, 6.0, false));
		int rownum = 0;
//		 percorre e incrementa sempre que tiver info
		for (Aluno aluno : listaAlunos) {
			Row row = sheetAlunos.createRow(rownum++);
			int cellnum = 0;
			Cell cellNome = row.createCell(cellnum++);
			cellNome.setCellValue(aluno.getNome());

			Cell cellRA = row.createCell(cellnum++);
			cellRA.setCellValue(aluno.getRa());

			Cell cellNota1 = row.createCell(cellnum++);
			cellNota1.setCellValue(aluno.getNota1());

			Cell cellNota2 = row.createCell(cellnum++);
			cellNota2.setCellValue(aluno.getNota2());

			Cell cellMedia = row.createCell(cellnum++);
			cellMedia.setCellValue(aluno.getNota1() + aluno.getNota2() / 2);

			Cell cellAprovado = row.createCell(cellnum++);
			cellAprovado.setCellValue(cellMedia.getNumericCellValue() >= 7);

		}
		try {
			FileOutputStream out = new FileOutputStream(new File(CriarExcel.fileName));
			workbook.write(out);
			out.close();
			System.out.println("Arquivo gerado com sucesso!!");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro na criação do Arquivo!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
