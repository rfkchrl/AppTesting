package arisyrifki.app.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import arisyrifki.app.test.Adapter.AdapterSch;
import arisyrifki.app.test.Model.ModelSch;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class SchActivity extends AppCompatActivity {

    public List<ModelSch> sch = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sch);

        recyclerView = (RecyclerView)findViewById(R.id.rec_sch);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

        schColl();

        AdapterSch adapter = new AdapterSch(sch);
        recyclerView.setAdapter(adapter);
    }

    private void schColl() {
        sch.add(new ModelSch("asddd","dsaaa",R.drawable.ic_android_black_24dp));
    }
}
