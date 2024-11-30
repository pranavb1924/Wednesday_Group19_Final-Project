/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

/**
 *
 * @author rexinshiminsutongxue
 */
public class LawyerWorkRequest extends WorkRequest{
    private String Result;
    private boolean approval = false;
    //private UserAccount approvedBy;
    
    

    public String getTestResult() {
        return Result;
    }

    public void setTestResult(String testResult) {
        this.Result = testResult;
    }
}
