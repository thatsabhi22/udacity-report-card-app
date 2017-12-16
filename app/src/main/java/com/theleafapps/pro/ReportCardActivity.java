package com.theleafapps.pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReportCardActivity extends AppCompatActivity {

    ReportCard reportCard;
    TextView reportCardtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card);

        //Initializing report card object
        reportCard = new ReportCard("Udacity",
                                    "Abhijeet",
                                    "A",
                                    "B",
                                    "B+",
                                    "C",
                                    "A");

        //Finding the textview
        reportCardtv = (TextView) findViewById(R.id.reportCardtv);

        //Setting text to the textview
        reportCardtv.setText(reportCard.toString());
    }
}
