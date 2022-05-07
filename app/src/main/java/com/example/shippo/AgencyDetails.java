package com.example.shippo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AgencyDetails extends AppCompatActivity {

    FirebaseDatabase agencynode;
    DatabaseReference agencyref;
    TextView aname,oname,comloc;
    Button anext;
    Random ran = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agency_details);

        aname = findViewById(R.id.agencyname);
        oname = findViewById(R.id.ownername);
        comloc = findViewById(R.id.companylocation);
        anext = findViewById(R.id.agencynext);

        anext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agencynode = FirebaseDatabase.getInstance();
                agencyref = agencynode.getReference("ship/agency/register");
                String agency_name = aname.getText().toString();
                String owner_name = oname.getText().toString();
                String company_location = comloc.getText().toString();
                int random = getRandomNumber();
                AgencyHelperClass cla = new AgencyHelperClass();
                agencyref.child(String.valueOf(random)).setValue(cla);

            }
        });

    }
    public int getRandomNumber()
    {
        int m = 10000;
        final int l = ran.nextInt(m);
        return l;
    }
}