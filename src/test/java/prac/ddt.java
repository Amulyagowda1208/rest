package prac;//import org.apache.poi.prac.ss.usermodel.Workbook;
//import org.apache.poi.prac.ss.usermodel.WorkbookFactory;
//import org.apache.poi.prac.ss.util.NumberToTextConverter;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class prac.prac.ddt {
//    public static void main(String args[]) throws IOException {
////        FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\untitled1\\Myxl.xlsx");
////        Workbook wb = WorkbookFactory.create(fis);
////        String username = wb.getSheet("hello").getRow(1).getCell(0).getStringCellValue();
////        String pass= NumberToTextConverter.toText(wb.getSheet("hello").getRow(1).getCell(1).getNumericCellValue());
////        System.out.println(username);
////        System.out.println(pass);
        import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;
import java.io.FileInputStream;
import java.io.IOException;

        public class ddt {
            public static void main(String[] args) throws IOException {
                FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\untitled1\\Myxl.xlsx");
                Workbook wb = WorkbookFactory.create(fis);
                Sheet sheet = wb.getSheet("hello");

                // Get the number of rows
                int rowCount = sheet.getLastRowNum();

                // Loop through each row (starting from 1 if 0 is header)
                for (int i = 1; i <= rowCount; i++) {
                    Row row = sheet.getRow(i);
                    if (row != null) {
                        // Assuming column 0 is username, column 1 is password
                        String username = row.getCell(0).getStringCellValue();

                        String pass = "";
                        Cell cell = row.getCell(1);
                        if (cell.getCellType() == CellType.NUMERIC) {
                            pass = NumberToTextConverter.toText(cell.getNumericCellValue());
                        } else if(cell.getCellType() == CellType.STRING) {
                            pass = cell.getStringCellValue();
                        }

                        System.out.println("Username: " + username + ", Password: " + pass);
                    }
                }

                wb.close();
                fis.close();
            }
        }


