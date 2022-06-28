
package model;

/**
 *
 * @author maoza
 */
public class InvoiceLine {
       
   private String itemName;
   private double itemPrice;
   private int  count;
   InvoiceHeader header;

    public InvoiceLine(String itemName, double itemPrice, int Count, InvoiceHeader header) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = Count;
        this.header = header;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int Count) {
        this.count = Count;
    }
    public double getLineTotal() {
        return count * itemPrice;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + " , getLineTotal"+ getLineTotal()+", itemPrice=" + itemPrice + ", count=" + count + '}';
    }

    
   
}
