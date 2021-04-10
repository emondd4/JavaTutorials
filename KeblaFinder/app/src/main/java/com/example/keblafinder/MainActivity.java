package com.example.keblafinder;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    ImageView compass;
    TextView coordinate,correct;
    float coordinate_value;
    private SensorManager sensorManager;
    private Sensor Rotation, Accelerometer,Magnetometer;
    float[] rMat = new float[9];
    float[] orientation = new float[9];
    private float[] mLastAccelerometer = new float[3];
    private float[] mLastMagnetometer = new float[3];
    private boolean haveSensor = false, haveSensor2 = false;
    private boolean mLastAccelerometerSet = false;
    private boolean mLastMagnetometerSet = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting screen orientation locked so it will be acting as potrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        compass = findViewById(R.id.compass);
        coordinate = findViewById(R.id.cordinate);
        correct = findViewById(R.id.confirmation);

        start();
    }

    //this method will be executed every time the sensor changed.
    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ROTATION_VECTOR){
            sensorManager.getRotationMatrixFromVector(rMat,event.values);
            coordinate_value = (float) ((Math.toDegrees(SensorManager.getOrientation(rMat,orientation)[0])+360)%360);
        }
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER){
            System.arraycopy(event.values,0,mLastAccelerometer,0,event.values.length);
            mLastAccelerometerSet=true;
        }else
            if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD){
                System.arraycopy(event.values,0,mLastMagnetometer,0,event.values.length);
                mLastMagnetometerSet=true;
            }

            if (mLastMagnetometerSet && mLastAccelerometerSet){
                sensorManager.getRotationMatrix(rMat,null,mLastAccelerometer,mLastMagnetometer);
                sensorManager.getOrientation(rMat,orientation);
                coordinate_value = (float) ((Math.toDegrees(SensorManager.getOrientation(rMat,orientation)[0])+360)%360);
            }

            coordinate_value = Math.round(coordinate_value);
            compass.setRotation(-coordinate_value);

            String where = "NO";

            if (coordinate_value >=360.00 || coordinate_value <=10.00)
                where = "N";
            if (coordinate_value < 360.00 && coordinate_value >280.00)
                where = "NW";
            if (coordinate_value <=280.00 && coordinate_value >260.00)
                where = "W";
            if (coordinate_value <=260.00 && coordinate_value >190.00)
                where = "SW";
            if (coordinate_value <=190.00 && coordinate_value >170.00)
                where = "S";
            if (coordinate_value <=170.00 && coordinate_value >100.00)
                where = "SE";
            if (coordinate_value <=100.00 && coordinate_value >80.00)
                where = "E";
            if (coordinate_value <=80.00 && coordinate_value >10.00)
                where = "NE";
            if (coordinate_value >= 21.40 && coordinate_value <= 39.80) {
                where = "Accurate Makka";
                correct.setVisibility(View.VISIBLE);
            }else {
                correct.setVisibility(View.GONE);
            }
            coordinate.setText(coordinate_value +"°"+where);
        }
    //we wont use this method.
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    //in this method we are going to check if we have three sensor active or not?
    public void start(){
        if (sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR) == null){
            if (sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) == null || sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) == null){
                noSensorAlert();
            }else {
                Accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
                Magnetometer = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

                haveSensor  = sensorManager.registerListener(this,Accelerometer,SensorManager.SENSOR_DELAY_UI);
                haveSensor2  = sensorManager.registerListener(this,Magnetometer,SensorManager.SENSOR_DELAY_UI);
            }
        }else {
            Rotation = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
            haveSensor  = sensorManager.registerListener(this,Rotation,SensorManager.SENSOR_DELAY_UI);
        }
    }

    //if any sensor is missing this method will be called to show alert
    public void noSensorAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("Your Device doesn't Support the Compass")
                .setCancelable(false)
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        alertDialog.show();
    }

    //method to stop all sensors
    public void stop(){
        if (haveSensor && haveSensor2){
            sensorManager.unregisterListener(this,Accelerometer);
            sensorManager.unregisterListener(this,Magnetometer);
        }else {
            if (haveSensor){
                sensorManager.unregisterListener(this,Rotation);
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        stop();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        start();
    }
}
