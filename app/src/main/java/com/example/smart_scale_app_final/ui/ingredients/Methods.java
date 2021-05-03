package com.example.smart_scale_app_final.ui.ingredients;

public class Methods {
    public String stepNum;
    public String methodDescription;

    public Methods(String stepNum, String methodDescription) {
        this.stepNum = stepNum;
        this.methodDescription = methodDescription;
    }

    public String getStepNum() {
        return stepNum;
    }

    public void setStepNum(String stepNum) {
        this.stepNum = stepNum;
    }

    public String getMethodDescription() {
        return methodDescription;
    }

    public void setMethodDescription(String methodDescription) {
        this.methodDescription = methodDescription;
    }

}