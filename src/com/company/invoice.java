package com.company;

public class invoice implements payable {
    private int quantity;
    private  int partNumber;
    private  String partName;
    private  double pricePerItem;


    public invoice(){

    }


    public invoice(int quantity,
                   int partNumber,
                   String partName,
                   double pricePerItem){
        setQuantity(quantity);
        setPartName(partName);
        setPartNumber(partNumber);
        setPricePerItem(pricePerItem);
    }


    @Override
    public double payment() {
        return getPricePerItem()*getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

public String toString(){
    System.out.println("Quantity::"+Constants.SPACE+"Part_Number"+Constants.SPACE+"Part_Name"+Constants.SPACE+"Price_Per_Item"+Constants.SPACE+"Payment");
        return (getQuantity()+Constants.SPACE+getPartNumber()+Constants.SPACE+getPartName()+Constants.SPACE+getPricePerItem()+Constants.SPACE+payment());
}



}
