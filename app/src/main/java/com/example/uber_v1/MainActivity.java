package com.example.uber_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Car car = new Car();
    Car car2 = new Car();
    Car car3 = new Car();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        car.driver = "Johnny";
        car.id = 123456;
        car.license = "ABC123";
        car.passenger = 4;

        Toast.makeText(this, "Los datos de tu servicio son: " +"\n"+"\n" + "Nombre del conductor: " + car.driver +"\n"+"\n" + "Placa del vehiculo: " + car.id +"\n"+"\n" + "Numero de pasajeros (MAX): " + car.passenger +"\n"+"\n" + " # de licencia: " + car.license, Toast.LENGTH_LONG).show();

        car2.driver = "Faruth";
        car2.id = 987654;
        car2.license = "XYZ987";
        car2.passenger = 3;

        Toast.makeText(this, "Los datos son: " +"\n"+"\n" + "Nombre del conductor: " + car2.driver +"\n"+"\n" + "Placa del vehiculo: " + car2.id +"\n"+"\n" + "Numero de pasajeros: " + car2.passenger +"\n" +"\n"+ " # de licencia: " + car2.license, Toast.LENGTH_LONG).show();


        car3.driver = "Johnny";
        car3.id = 123456;
        car3.license = "ABC123";
        car3.passenger = 4;

        Toast.makeText(this, "Los datos son: " +"\n" + "Nombre del conductor: " + car3.driver +"\n" + "Placa del vehiculo: " + car3.id +"\n"+ "Numero de pasajeros: " + car3.passenger +"\n"+ " # de licencia: " + car3.license, Toast.LENGTH_LONG).show();


    }
}
