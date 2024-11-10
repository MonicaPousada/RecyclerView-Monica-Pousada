package com.example.tarearecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Crear conjunto de datos
        ArrayList<Contacto> contactos = new ArrayList<>(Arrays.asList(new Contacto[]{
                new Contacto("Nombre1", "Apellidos1", "email1@email.com", "111111111", R.mipmap.imagen1),
                new Contacto("Nombre2", "Apellidos2", "email2@email.com", "222222222", R.mipmap.imagen2),
                new Contacto("Nombre3", "Apellidos3", "email3@email.com", "333333333", R.mipmap.imagen3),
                new Contacto("Nombre4", "Apellidos4", "email4@email.com", "444444444", R.mipmap.imagen4),
                new Contacto("Nombre5", "Apellidos5", "email5@email.com", "555555555", R.mipmap.imagen5),
                new Contacto("Nombre6", "Apellidos6", "email6@email.com", "666666666", R.mipmap.imagen6),
                new Contacto("Nombre7", "Apellidos7", "email7@email.com", "777777777", R.mipmap.imagen7),
                new Contacto("Nombre8", "Apellidos8", "email8@email.com", "888888888", R.mipmap.imagen8),
                new Contacto("Nombre9", "Apellidos9", "email9@email.com", "999999999", R.mipmap.imagen9),
                new Contacto("Nombre10", "Apellidos10", "email10@email.com", "101010101", R.mipmap.imagen10)
        }));

        // Crear el adaptador
        Adaptador adaptador = new Adaptador(contactos);

        // Instanciar el RecyclerView
        RecyclerView rvContactos = findViewById(R.id.rvContactos);

        // Opcionalmente podríamos modificar el tipo de LayoutManager
        rvContactos.setLayoutManager(new LinearLayoutManager(this));

        //rvContactos.setLayoutManager(new GridLayoutManager(this, 2));

        // Asignar el adaptador al RecyclerView
        rvContactos.setAdapter(adaptador);



    }
}