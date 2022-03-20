/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author cweng
 */
public class AppointmentClass {
    String ApId;
    String ApDate;
    String ApTime;
    String ApStuName;
    String ApLocation;
    String ApStatus;
    String ApDSign;

    public String getApDSign() {
        return ApDSign;
    }

    public void setApDSign(String ApDSign) {
        this.ApDSign = ApDSign;
    }

    public String getApId() {
        return ApId;
    }

    public void setApId(String ApId) {
        this.ApId = ApId;
    }

    public String getApDate() {
        return ApDate;
    }

    public void setApDate(String ApDate) {
        this.ApDate = ApDate;
    }

    public String getApTime() {
        return ApTime;
    }

    public void setApTime(String ApTime) {
        this.ApTime = ApTime;
    }

    public String getApStuName() {
        return ApStuName;
    }

    public void setApStuName(String ApStuName) {
        this.ApStuName = ApStuName;
    }

    public String getApLocation() {
        return ApLocation;
    }

    public void setApLocation(String ApLocation) {
        this.ApLocation = ApLocation;
    }

    public String getApStatus() {
        return ApStatus;
    }

    public void setApStatus(String ApStatus) {
        this.ApStatus = ApStatus;
    }
    public AppointmentClass(String ApId, String ApDate, String ApTime, String ApStuName, String ApLocation, String ApStatus, String ApDSign ) {
        this.ApId = ApId;
        this.ApDate = ApDate;
        this.ApTime = ApTime;
        this.ApStuName = ApStuName;
        this.ApLocation = ApLocation;
        this.ApStatus = ApStatus;
        this.ApDSign = ApDSign;
    }
    public AppointmentClass(String data) {
        String[] dataArr = data.split(",");
        
        this.ApId = dataArr[0];
        this.ApDate = dataArr[1];
        this.ApTime = dataArr[2];
        this.ApStuName = dataArr[3];
        this.ApLocation = dataArr[4];
        this.ApStatus = dataArr[5];
        this.ApDSign = dataArr[6];
    }
    @Override
    public String toString() {
       return (this.ApId + "," + this.ApDate + "," + this.ApTime +","+this.ApStuName+","+this.ApLocation+","+this.ApStatus+","+this.ApDSign ).toLowerCase();
    }
    
}
