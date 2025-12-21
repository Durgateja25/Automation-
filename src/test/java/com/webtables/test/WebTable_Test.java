package com.webtables.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Pages.WebTable_Page;
import com.base.Base_class;

public class WebTable_Test extends Base_class {
	@Test
    public void verifyWebTableData() {

        WebTable_Page table = new WebTable_Page(driver);

        System.out.println("Rows: " + table.getRowCount());
        System.out.println("Columns: " + table.getColumnCount());
        table.printTableData();

        String salary = table.getCellValue(1, 5);
        System.out.println("Salary: " + salary);
        Assert.assertTrue(table.isValuePresent("Cierra"),"Expected value not found in table");
        table.clickEditByName("Cierra");
    }
}
