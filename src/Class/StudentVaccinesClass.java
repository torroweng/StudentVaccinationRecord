package Class;
import studentvaccinationrecord.StudentVaccines;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cweng
 */
public class StudentVaccinesClass extends StudentVaccines{
     private String StuId;
    private String StuName;
    private String VacName;
    private String VacBatch;
    private String VacExpDate;
    private String EncryptData;


    public String getEncryptData() {
        return EncryptData;
    }

    public void setEncryptData(String EncryptData) {
        this.EncryptData = EncryptData;
    }
    

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getVacName() {
        return VacName;
    }

    public void setVacName(String VacName) {
        this.VacName = VacName;
    }

    public String getVacBatch() {
        return VacBatch;
    }

    public void setVacBatch(String VacBatch) {
        this.VacBatch = VacBatch;
    }

    public String getVacExpDate() {
        return VacExpDate;
    }

    public void setVacExpDate(String VacExpDate) {
        this.VacExpDate = VacExpDate;
    }
    public StudentVaccinesClass(String StuId, String StuName, String VacName, String VacBatch, String VacExpDate, String EncryptData ) {
        this.StuId = StuId;
        this.StuName = StuName;
        this.VacName = VacName;
        this.VacBatch = VacBatch;
        this.VacExpDate = VacExpDate;
        this.EncryptData = EncryptData;
    }

    public StudentVaccinesClass(String data) {
        String[] dataArr = data.split(",");
        
        this.StuId = dataArr[0];
        this.StuName = dataArr[1];
        this.VacName = dataArr[2];
        this.VacBatch = dataArr[3];
        this.VacExpDate = dataArr[4];
        this.EncryptData =dataArr[5];
    }
    
    @Override
    public String toString() {
        return (this.StuId + "," + this.StuName + "," + this.VacName +","+this.VacBatch+","+this.VacExpDate+","+this.EncryptData ).toLowerCase();
    }
}
