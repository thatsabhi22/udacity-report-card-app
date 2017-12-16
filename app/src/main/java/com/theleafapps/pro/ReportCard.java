package com.theleafapps.pro;

/**
 * Created by aviator on 17/12/17.
 */

public class ReportCard {

    private String schoolName;
    private String mName;

    private String mEnglish;
    private String mHistory;
    private String mMath;
    private String mChemistry;
    private String mPhysics;

    public ReportCard(String schoolName,
                      String mName,
                      String mEnglish,
                      String mHistory,
                      String mMath,
                      String mChemistry,
                      String mPhysics) {
        this.schoolName = schoolName;
        this.mName = mName;
        this.mEnglish = mEnglish;
        this.mHistory = mHistory;
        this.mMath = mMath;
        this.mChemistry = mChemistry;
        this.mPhysics = mPhysics;
    }

    // Get name of Student
    public String getmName() {
        return mName;
    }

    // Set name of Student
    public void setmName(String mName) {
        this.mName = mName;
    }

    // Get english marks
    public String getmEnglish() {
        return mEnglish;
    }

    // Set english marks
    public void setmEnglish(String mEnglish) {
        this.mEnglish = mEnglish;
    }

    // Get history marks
    public String getmHistory() {
        return mHistory;
    }

    // Set english marks
    public void setmHistory(String mHistory) {
        this.mHistory = mHistory;
    }

    // Get math marks
    public String getmMath() {
        return mMath;
    }

    // Set english marks
    public void setmMath(String mMath) {
        this.mMath = mMath;
    }

    // Get chemistry marks
    public String getmChemistry() {
        return mChemistry;
    }

    // Set english marks
    public void setmChemistry(String mChemistry) {
        this.mChemistry = mChemistry;
    }

    // Get physics marks
    public String getmPhysics() {
        return mPhysics;
    }

    // Set english marks
    public void setmPhysics(String mPhysics) {
        this.mPhysics = mPhysics;
    }


    // The toString() method gives a human-readable String representing the data
    // stored in the report card
    @Override
    public String toString() {
        return "ReportCard" + "\n\n" +
                "School Name = '"+ schoolName + '\'' + "\n" +
                "Student Name='" + mName + '\'' + "\n\n" +
                "English Grade='" + mEnglish + '\'' + "\n" +
                "History Grade='" + mHistory + '\'' + "\n" +
                "Math Grade='" + mMath + '\'' + "\n" +
                "Chemistry Grade='" + mChemistry + '\'' + "\n" +
                "Physics Grade='" + mPhysics + '\'' + "\n";
    }
}
