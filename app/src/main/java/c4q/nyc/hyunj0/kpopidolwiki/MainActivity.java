package c4q.nyc.hyunj0.kpopidolwiki;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    private static final KPopIdol[] AFTERSCHOOL = {
            new KPopIdol(R.drawable.jungah, "Jungah", "After School", KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT),
            new KPopIdol(R.drawable.uee, "UEE", "After School", KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT),
            new KPopIdol(R.drawable.raina, "Raina", "After School", KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT),
            new KPopIdol(R.drawable.nana, "Nana", "After School", KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT),
            new KPopIdol(R.drawable.lizzy, "Lizzy", "After School", KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT),
            new KPopIdol(R.drawable.e_young, "E-Young", "After School", KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT),
            new KPopIdol(R.drawable.kaeun, "Kaeun", "After School", KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
        rv.setAdapter(new KPopIdolAdapter(AFTERSCHOOL));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}