package com.example.estudiante.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.estudiante.myapplication.R.layout.renglon;

public class ContactAdap extends BaseAdapter {

    ArrayList<Contact> contacts;
    Activity activity;

    public ContactAdap(Activity activity){
        this.activity = activity;
        contacts = new ArrayList<>();
    }

    public int getCount() {return contacts.size();}

    public Object getItem(int i){ return contacts.get(i);}

    public long getItemId(int i){ return i;}


    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();

       View renglon = inflater.inflate(R.layout.renglon, null, false);
        TextView item_nombre = renglon.findViewById(R.id.item_nombre);
        ImageView item_genero = renglon.findViewById(R.id.item_genero);
        final  TextView item_telefono = renglon.findViewById(R.id.item_telefono);

        ImageButton item_llamar = renglon.findViewById(R.id.item_call);
        ImageButton item_eliminar = renglon.findViewById(R.id.item_delete);

        String genero = contacts.get(position).getGenero();

        if(genero.toString().equals("Femenino")) {
            item_genero.setImageResource(R.drawable.mujer);
        }else {
            item_genero.setImageResource(R.drawable.hombre);
        }

        item_nombre.setText(contacts.get(position).getNombre());
        item_telefono.setText(contacts.get(position).getTelefono());

        item_llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return renglon;

        public void agregarContact(Contact contacts){
            contacts.add(contac);
            notifyDataSetChanged();
        }
    }
}
