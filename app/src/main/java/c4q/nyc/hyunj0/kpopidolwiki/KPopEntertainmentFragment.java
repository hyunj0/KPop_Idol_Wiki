package c4q.nyc.hyunj0.kpopidolwiki;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class KPopEntertainmentFragment extends Fragment {

    private static final String ENTERTAINMENT_COMPANY = "entertainment_company";

    private String entertainmentCompany;

    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbar;
    private ImageView backdrop;
    private RecyclerView rv;

    public KPopEntertainmentFragment() {

    }

    public static KPopEntertainmentFragment newInstance(KPopEntertainmentCompany kPopEntertainmentCompany) {
        KPopEntertainmentFragment fragment = new KPopEntertainmentFragment();
        Bundle args = new Bundle();
        args.putString(ENTERTAINMENT_COMPANY, kPopEntertainmentCompany.getName());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            entertainmentCompany = getArguments().getString(ENTERTAINMENT_COMPANY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kpop_entertainment, container, false);

        getActivity().findViewById(R.id.background).setVisibility(View.INVISIBLE);

        collapsingToolbar = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar);
        backdrop = (ImageView) view.findViewById(R.id.backdrop);
        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        rv = (RecyclerView) view.findViewById(R.id.rv);

        collapsingToolbar.setTitle(entertainmentCompany);
        backdrop.setImageResource(getCompanyLogo(entertainmentCompany));
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(getActivity(), drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        KPopIdolAdapter adapter = new KPopIdolAdapter(getArtists(entertainmentCompany));
        rv.setLayoutManager(new LinearLayoutManager(container.getContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        return view;
    }

    public int getCompanyLogo(String entertainmentCompany) {
        int logo = 0;
        switch (entertainmentCompany) {
            case KPopEntertainmentCompany.CUBE_ENTERTAINMENT:
                logo = R.drawable.cube_family;
                break;
            case KPopEntertainmentCompany.FNC_ENTERTAINMENT:
                logo = R.drawable.fnc_family;
                break;
            case KPopEntertainmentCompany.JYP_ENTERTAINMENT:
                logo = R.drawable.jyp_family;
                break;
            case KPopEntertainmentCompany.LOEN_ENTERTAINMENT:
                logo = R.drawable.loen_family;
                break;
            case KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT:
                logo = R.drawable.pledis_family;
                break;
            case KPopEntertainmentCompany.SM_ENTERTAINMENT:
                logo = R.drawable.sm_family;
                break;
            case KPopEntertainmentCompany.TS_ENTERTAINMENT:
                logo = R.drawable.ts_family;
                break;
            case KPopEntertainmentCompany.WOOLLIM_ENTERTAINMENT:
                logo = R.drawable.woollim_family;
                break;
            case KPopEntertainmentCompany.YG_ENTERTAINMENT:
                logo = R.drawable.yg_family;
                break;
        }
        return logo;
    }

    public KPopIdol[] getArtists(String entertainmentCompany) {
        switch (entertainmentCompany) {
            case KPopEntertainmentCompany.CUBE_ENTERTAINMENT:
                return KPopEntertainmentCompany.CUBE_ARTISTS;
            case KPopEntertainmentCompany.FNC_ENTERTAINMENT:
                return KPopEntertainmentCompany.FNC_ARTISTS;
            case KPopEntertainmentCompany.JYP_ENTERTAINMENT:
                return KPopEntertainmentCompany.JYP_ARTISTS;
            case KPopEntertainmentCompany.LOEN_ENTERTAINMENT:
                return KPopEntertainmentCompany.LOEN_ARTISTS;
            case KPopEntertainmentCompany.PLEDIS_ENTERTAINMENT:
                return KPopEntertainmentCompany.PLEDIS_ARTISTS;
            case KPopEntertainmentCompany.SM_ENTERTAINMENT:
                return KPopEntertainmentCompany.SM_ARTISTS;
            case KPopEntertainmentCompany.TS_ENTERTAINMENT:
                return KPopEntertainmentCompany.TS_ARTISTS;
            case KPopEntertainmentCompany.WOOLLIM_ENTERTAINMENT:
                return KPopEntertainmentCompany.WOOLLIM_ARTISTS;
            case KPopEntertainmentCompany.YG_ENTERTAINMENT:
                return KPopEntertainmentCompany.YG_ARTISTS;
            default:
                return KPopEntertainmentCompany.NO_ARTISTS;
        }
    }
}