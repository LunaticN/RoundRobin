import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellBase;

import java.io.*;

//Workbook>sheet>rows>cell
public class XSSFTesting {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet 1");

        for (int i = 0; i < 7; i++) { //make rows (total pairs so probably like rounds*mpr)
            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < 5; j++) { //make cells within rows (i.e. columns sorta) (for the roundrobin this would only have to be like 3 cells per row)
                XSSFCell cell = row.createCell(j);//.setCellValueImpl(4.0); why doesn't this work hello?????
            }
        }
        String filePath = ".\\src\\test.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();

        System.out.println("it worked dumbass!");
    }
}
