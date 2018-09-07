package com.example.estudiante.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private ListView lv_contactos;
    ContactAdap customAdapter;
    ImageButton btn_generar;
    EditText et_contact;
    EditText et_telefono;
    Switch swt_genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_contact =findViewById(R.id.et_contact);
        et_telefono = findViewById(R.id.et_telefono);
        btn_generar = findViewById(R.id.btn_generar);
        swt_genero = findViewById(R.id.swt_genero);

        lv_contactos = findViewById(R.id.lv_contactos);
        customAdapter = new ContactAdap(this);
        lv_contactos.setAdapter(customAdapter);

        Contact contact1 = new Contact("Gabriela Cruz", 3006231932, "Femenino");
        Contact contact2 = new Contact("Juan Martinez", 3023000332, "Femenino");
        Contact contact3 = new Contact("Vito Maziota", 3155197540, "Masculino");


        customAdapter.agregarContact(contact1);
        customAdapter.agregarContact(contact2);
        customAdapter.agregarContact(contact3);




    }
}
