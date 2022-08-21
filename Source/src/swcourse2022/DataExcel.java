package swcourse2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {
	

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // �� Workbook ����
        XSSFWorkbook workbook = new XSSFWorkbook();

        // �� Sheet�� ����
        XSSFSheet sheet = workbook.createSheet("employee data");

        // Sheet�� ä��� ���� �����͵��� Map�� ����
        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"ID", "NAME", "PHONE_NUMBER"});
        data.put("2", new Object[]{"1", "cookie", "010-1111-1111"});
        data.put("3", new Object[]{"2", "sickBBang", "010-2222-2222"});
        data.put("4", new Object[]{"3", "workingAnt", "010-3333-3333"});
        data.put("5", new Object[]{"4", "wow", "010-4444-4444"});

        // data���� keySet�� �����´�. �� Set ������ ��ȸ�ϸ鼭 �����͵��� sheet�� �Է��Ѵ�.
        Set<String> keyset = data.keySet();
        int rownum = 0;

        // �˾ƾ��� ��, TreeMap�� ���� ������ keySet�� for�� ��ȸ��, Ű���� ������������ ��ȸ�ȴ�.
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String) {
                    cell.setCellValue((String)obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer)obj);
                }
            }
        }

        try {
            FileOutputStream out = new FileOutputStream("JavaBooks.xlsx");
            workbook.write(out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
	
}
