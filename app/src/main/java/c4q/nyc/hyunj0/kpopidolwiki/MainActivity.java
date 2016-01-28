package c4q.nyc.hyunj0.kpopidolwiki;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public DrawerLayout drawer;
    private NavigationView navigationView;

    private KPopEntertainmentCompany cube, fnc, jyp, loen, pledis, sm, ts, woollim, yg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        initializeEntertainmentCompanies();
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void initializeViews() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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

    public void initializeEntertainmentCompanies() {
        cube = new KPopEntertainmentCompany(KPopEntertainmentCompany.CUBE_ENTERTAINMENT, KPopEntertainmentCompany.CUBE_ENTERTAINMENT_FOUNDER);
        fnc = new KPopEntertainmentCompany(KPopEntertainmentCompany.FNC_ENTERTAINMENT, KPopEntertainmentCompany.FNC_ENTERTAINMENT_FOUNDER);
        jyp = new KPopEntertainmentCompany(KPopEntertainmentCompany.JYP_ENTERTAINMENT, KPopEntertainmentCompany.JYP_ENTERTAINMENT_FOUNDER);
        loen = new KPopEntertainmentCompany(KPopEntertainmentCompany.LOEN_ENTERTAINMENT, KPopEntertainmentCompany.LOEN_ENTERTAINMENT_FOUNDER);
        pledis = new KPopEntertainmentCompany(KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT, KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT_FOUNDER);
        sm = new KPopEntertainmentCompany(KPopEntertainmentCompany.SM_ENTERTAINMENT, KPopEntertainmentCompany.SM_ENTERTAINMENT_FOUNDER);
        ts = new KPopEntertainmentCompany(KPopEntertainmentCompany.TS_ENTERTAINMENT, KPopEntertainmentCompany.TS_ENTERTAINMENT_FOUNDER);
        woollim = new KPopEntertainmentCompany(KPopEntertainmentCompany.WOOLLIM_ENTERTAINMENT, KPopEntertainmentCompany.WOOLLIM_ENTERTAINMENT_FOUNDER);
        yg = new KPopEntertainmentCompany(KPopEntertainmentCompany.YG_ENTERTAINMENT, KPopEntertainmentCompany.YG_ENTERTAINMENT_FOUNDER);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (id == R.id.cube_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(cube));
        } else if (id == R.id.fnc_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(fnc));
        } else if (id == R.id.jyp_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(jyp));
        } else if (id == R.id.loen_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(loen));
        } else if (id == R.id.pledis_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(pledis));
        } else if (id == R.id.sm_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(sm));
        } else if (id == R.id.ts_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(ts));
        } else if (id == R.id.woollim_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(woollim));
        } else if (id == R.id.yg_entertainment) {
            ft.replace(R.id.container, KPopEntertainmentFragment.newInstance(yg));
        } else {

        }

        ft.commit();

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}