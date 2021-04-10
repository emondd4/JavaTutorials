package com.example.sawom2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tomer.fadingtextview.FadingTextView;

import org.w3c.dom.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    FadingTextView fadingTextView;
    Button button1,button2,button3;
    TextView textView1,textView2;
    private CountDownTimer countDownTimer;
    private long currentTimeInMilliSeconds1;
    private long  timeToCalculate1;
    private Date ParseDate1;
    private long counter1;
    private long currentTimeInMilliSeconds2;
    private long  timeToCalculate2;
    private Date ParseDate2;
    private long counter2;
    private long counter3;
    private Date ParseDate3;
    private long  timeToCalculate3;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fadingTextView = findViewById(R.id.homeQuotes);
        fadingTextView.setTimeout(8,FadingTextView.SECONDS);

        button1 =findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);
        button3 =findViewById(R.id.button3);
        textView1 = findViewById(R.id.ifterText);
        textView2 = findViewById(R.id.seheriText);

        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss",Locale.getDefault()).format(new Date());

        currentTimeInMilliSeconds1 = System.currentTimeMillis();
        currentTimeInMilliSeconds2 = System.currentTimeMillis();

        String dateInit = "24-04-2020";
        String date1 = "25-04-2020";
        String date2 = "26-04-2020";
        String date3 = "27-04-2020";
        String date4 = "28-04-2020";
        String date5 = "29-04-2020";
        String date6 = "30-04-2020";
        String date7 = "01-05-2020";
        String date8 = "02-05-2020";
        String date9 = "03-05-2020";
        String date10 = "04-05-2020";
        String date11 = "05-05-2020";
        String date12 = "06-05-2020";
        String date13 = "07-05-2020";
        String date14 = "08-05-2020";
        String date15 = "09-05-2020";
        String date16 = "10-05-2020";
        String date17 = "11-05-2020";
        String date18 = "12-05-2020";
        String date19 = "13-05-2020";
        String date20 = "14-05-2020";
        String date21 = "15-05-2020";
        String date22 = "16-05-2020";
        String date23 = "17-05-2020";
        String date24 = "18-05-2020";
        String date25 = "19-05-2020";
        String date26 = "20-05-2020";
        String date27 = "21-05-2020";
        String date28 = "22-05-2020";
        String date29 = "23-05-2020";
        String date30 = "24-05-2020";

        String ifterDate1 = "2020/04/25 18:28:00";
        String ifterDate2 = "2020/04/26 18:29:00";
        String ifterDate3 = "2020/04/27 18:29:00";
        String ifterDate4 = "2020/04/28 18:29:00";
        String ifterDate5 = "2020/04/29 18:30:00";
        String ifterDate6 = "2020/04/30 18:30:00";
        String ifterDate7 = "2020/05/01 18:31:00";
        String ifterDate8 = "2020/05/02 18:31:00";
        String ifterDate9 = "2020/05/03 18:32:00";
        String ifterDate10 = "2020/05/04 18:32:00";
        String ifterDate11 = "2020/05/05 18:33:00";
        String ifterDate12 = "2020/05/06 18:33:00";
        String ifterDate13 = "2020/05/07 18:34:00";
        String ifterDate14 = "2020/05/08 18:34:00";
        String ifterDate15 = "2020/05/09 18:35:00";
        String ifterDate16 = "2020/05/10 18:35:00";
        String ifterDate17 = "2020/05/11 18:36:00";
        String ifterDate18 = "2020/05/12 18:36:00";
        String ifterDate19 = "2020/05/13 18:36:00";
        String ifterDate20 = "2020/05/14 18:37:00";
        String ifterDate21 = "2020/05/15 18:37:00";
        String ifterDate22 = "2020/05/16 18:38:00";
        String ifterDate23 = "2020/05/17 18:38:00";
        String ifterDate24 = "2020/05/18 18:39:00";
        String ifterDate25 = "2020/05/19 18:39:00";
        String ifterDate26 = "2020/05/20 18:40:00";
        String ifterDate27 = "2020/05/21 18:40:00";
        String ifterDate28 = "2020/05/22 18:41:00";
        String ifterDate29 = "2020/05/23 18:42:00";
        String ifterDate30 = "2020/05/24 18:42:00";

        String seheriInit = "2020/04/24 04:06:00";
        String seheriDate1 = "2020/04/25 04:05:00";
        String seheriDate2 = "2020/04/26 04:04:00";
        String seheriDate3 = "2020/04/27 04:03:00";
        String seheriDate4 = "2020/04/28 04:02:00";
        String seheriDate5 = "2020/04/29 04:01:00";
        String seheriDate6 = "2020/04/30 04:00:00";
        String seheriDate7 = "2020/05/01 03:59:00";
        String seheriDate8 = "2020/05/02 03:58:00";
        String seheriDate9 = "2020/05/03 03:57:00";
        String seheriDate10 = "2020/05/04 03:55:00";
        String seheriDate11 = "2020/05/05 03:54:00";
        String seheriDate12 = "2020/05/06 03:53:00";
        String seheriDate13 = "2020/05/07 03:52:00";
        String seheriDate14 = "2020/05/08 03:51:00";
        String seheriDate15 = "2020/05/09 03:50:00";
        String seheriDate16 = "2020/05/10 03:50:00";
        String seheriDate17 = "2020/05/11 03:49:00";
        String seheriDate18 = "2020/05/12 03:49:00";
        String seheriDate19 = "2020/05/13 03:48:00";
        String seheriDate20 = "2020/05/14 03:48:00";
        String seheriDate21 = "2020/05/15 03:47:00";
        String seheriDate22 = "2020/05/16 03:47:00";
        String seheriDate23 = "2020/05/17 03:46:00";
        String seheriDate24 = "2020/05/18 03:46:00";
        String seheriDate25 = "2020/05/19 03:45:00";
        String seheriDate26 = "2020/05/20 03:44:00";
        String seheriDate27 = "2020/05/21 03:44:00";
        String seheriDate28 = "2020/05/22 03:43:00";
        String seheriDate29 = "2020/05/23 03:43:00";
        String seheriDate30 = "2020/05/24 03:42:00";
        String seheriFinal = "2020/05/25 03:42:00";

        //ifter time stars
        if (date.equals(date1)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate1);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date2)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate2);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date3)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate3);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date4)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate4);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date5)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate5);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date6)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate6);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date7)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate7);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date8)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate8);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date9)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate9);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date10)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate10);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }

        if (date.equals(date11)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate11);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date12)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate12);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date13)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate13);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date14)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate14);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date15)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate15);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date16)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate16);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date17)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate17);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date18)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate18);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date19)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate19);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date20)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate20);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }

        if (date.equals(date21)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate21);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date22)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate22);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date23)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate23);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date24)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate24);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date25)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate25);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date26)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate26);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date27)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate27);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date28)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate28);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date29)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate29);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        if (date.equals(date30)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate1 = sdf.parse(ifterDate30);
                counter1 = ParseDate1.getTime();
                timeToCalculate1 = counter1 - currentTimeInMilliSeconds1;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds1 > counter1){
                textView1.setText("00:00:00");
            }else {
                Startifter();
                updateTimerifter();
            }

        }
        //ifter timer ends

        //seheri time starts
        if (date.equals(dateInit)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate1);
                ParseDate3 = sdf.parse(seheriInit);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date1)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate2);
                ParseDate3 = sdf.parse(seheriDate1);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date2)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate3);
                ParseDate3 = sdf.parse(seheriDate2);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date3)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate4);
                ParseDate3 = sdf.parse(seheriDate3);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date4)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate5);
                ParseDate3 = sdf.parse(seheriDate4);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date5)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate6);
                ParseDate3 = sdf.parse(seheriDate5);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date6)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate7);
                ParseDate3 = sdf.parse(seheriDate6);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date7)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate8);
                ParseDate3 = sdf.parse(seheriDate7);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date8)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate9);
                ParseDate3 = sdf.parse(seheriDate8);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date9)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate10);
                ParseDate3 = sdf.parse(seheriDate9);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }

        if (date.equals(date10)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate11);
                ParseDate3 = sdf.parse(seheriDate10);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date11)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate12);
                ParseDate3 = sdf.parse(seheriDate11);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date12)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate13);
                ParseDate3 = sdf.parse(seheriDate12);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date13)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate14);
                ParseDate3 = sdf.parse(seheriDate13);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date14)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate15);
                ParseDate3 = sdf.parse(seheriDate14);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date15)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate16);
                ParseDate3 = sdf.parse(seheriDate15);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date16)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate17);
                ParseDate3 = sdf.parse(seheriDate16);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date17)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate18);
                ParseDate3 = sdf.parse(seheriDate17);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date18)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate19);
                ParseDate3 = sdf.parse(seheriDate18);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date19)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate20);
                ParseDate3 = sdf.parse(seheriDate19);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }

        if (date.equals(date20)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate21);
                ParseDate3 = sdf.parse(seheriDate20);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date21)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate22);
                ParseDate3 = sdf.parse(seheriDate20);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date22)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate23);
                ParseDate3 = sdf.parse(seheriDate22);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date23)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate24);
                ParseDate3 = sdf.parse(seheriDate23);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date24)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate25);
                ParseDate3 = sdf.parse(seheriDate24);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date25)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate26);
                ParseDate3 = sdf.parse(seheriDate25);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date26)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate27);
                ParseDate3 = sdf.parse(seheriDate26);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date27)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate28);
                ParseDate3 = sdf.parse(seheriDate27);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date28)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate29);
                ParseDate3 = sdf.parse(seheriDate28);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date29)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriDate30);
                ParseDate3 = sdf.parse(seheriDate29);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        if (date.equals(date30)){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            try {
                ParseDate2 = sdf.parse(seheriFinal);
                ParseDate3 = sdf.parse(seheriDate30);
                counter2 = ParseDate2.getTime();
                counter3 = ParseDate3.getTime();
                timeToCalculate2 = counter2 - currentTimeInMilliSeconds2;
                timeToCalculate3 = counter3 - currentTimeInMilliSeconds2;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (currentTimeInMilliSeconds2 < counter3){
                flag = 1;
                StartSeheri();
                updateTimerseheri1();
            }else {
                StartSeheri();
                updateTimerseheri();
            }

        }
        //seheri timer ends

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), NiyotActivity.class);
                startActivity(myIntent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), DuahAvtivity.class);
                startActivity(myIntent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), TimeActivity.class);
                startActivity(myIntent);
            }
        });

    }

    public void Startifter(){
        countDownTimer = new CountDownTimer(timeToCalculate1,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeToCalculate1 = millisUntilFinished;
                updateTimerifter();
            }

            @Override
            public void onFinish() {
                textView1.setText("00:00:00");
            }
        }.start();
    }

    public void StartSeheri(){
        if (flag == 1){
            countDownTimer = new CountDownTimer(timeToCalculate3,1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    timeToCalculate3 = millisUntilFinished;
                    updateTimerseheri1();
                }

                @Override
                public void onFinish() {
                    textView2.setText("00:00:00");
                }
            }.start();
        }else {
            countDownTimer = new CountDownTimer(timeToCalculate2,1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    timeToCalculate2 = millisUntilFinished;
                    updateTimerseheri();
                }

                @Override
                public void onFinish() {
                    textView2.setText("00:00:00");
                }
            }.start();
        }
    }

    public void updateTimerifter(){
        int hour = (int) timeToCalculate1 / 3600000;
        int minute = (int) timeToCalculate1 % 3600000 / 60000;
        int seconds = (int) timeToCalculate1 % 60000 / 1000;

        String timeLeftText;

        if (hour < 10) timeLeftText = "0" + hour;
        else timeLeftText ="" + hour;
        timeLeftText += ":";
        if (minute < 10) timeLeftText += "0";
        timeLeftText += "" + minute;
        timeLeftText += ":";
        if (seconds < 10) timeLeftText += "0";
        timeLeftText += seconds;

        textView1.setText(timeLeftText);
    }

    public void updateTimerseheri(){
        int hour = (int) timeToCalculate2 / 3600000;
        int minute = (int) timeToCalculate2 % 3600000 / 60000;
        int seconds = (int) timeToCalculate2 % 60000 / 1000;

        String timeLeftText;

        if (hour < 10) timeLeftText = "0" + hour;
        else timeLeftText ="" + hour;
        timeLeftText += ":";
        if (minute < 10) timeLeftText += "0";
        timeLeftText += "" + minute;
        timeLeftText += ":";
        if (seconds < 10) timeLeftText += "0";
        timeLeftText += seconds;

        textView2.setText(timeLeftText);
    }

    public void updateTimerseheri1(){
        int hour = (int) timeToCalculate3 / 3600000;
        int minute = (int) timeToCalculate3 % 3600000 / 60000;
        int seconds = (int) timeToCalculate3 % 60000 / 1000;

        String timeLeftText;

        if (hour < 10) timeLeftText = "0" + hour;
        else timeLeftText ="" + hour;
        timeLeftText += ":";
        if (minute < 10) timeLeftText += "0";
        timeLeftText += "" + minute;
        timeLeftText += ":";
        if (seconds < 10) timeLeftText += "0";
        timeLeftText += seconds;

        textView2.setText(timeLeftText);
    }
}
