package prac;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;

import java.io.FileInputStream;
import java.io.IOException;

public class allcell {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\untitled1\\Myxl.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("hello");
        int rowlast = sh.getLastRowNum();
        for (int i = 1; i <= rowlast; i++) {
            Row row = sh.getRow(i);
            if (row != null) {
                String username = row.getCell(0).getStringCellValue();

                String pass = "";
                Cell cell = row.getCell(1);
                if (cell.getCellType() == CellType.NUMERIC) {
                    pass = NumberToTextConverter.toText(cell.getNumericCellValue());

                } else if (cell.getCellType() == CellType.STRING) {
                    pass = (cell.getStringCellValue());
                }
                System.out.println(pass + "=" + username);
            }
        }
    }
}
