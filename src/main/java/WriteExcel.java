import model.Advertisment;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.List;

public class WriteExcel {
    private static String fileName="D:\\Новая папка (2)\\parsingApp\\src\\main\\resources\\file.xls";

    public static void saveInfo(List<Advertisment> list){
        HSSFWorkbook workbook=new HSSFWorkbook();
        HSSFSheet sheet=workbook.createSheet("sheet1");
        int rownum=0;
        for (Advertisment adv:list){
            Row row=sheet.createRow(rownum++);
            Cell cell=row.createCell(1);
            cell.setCellValue(adv.getName());
            Cell cell2=row.createCell(2);
            cell2.setCellValue(adv.getPrice());

        }
        try{
            FileOutputStream file=new FileOutputStream(fileName);
            workbook.write(file);
            workbook.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        WriteExcel.fileName = fileName;
    }
}
