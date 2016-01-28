package c4q.nyc.hyunj0.kpopidolwiki;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
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
    private static final String FOUNDER = "founder";

    private String entertainmentCompany;
    private String founder;

    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbar;
    private ImageView backdrop;
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

    public KPopEntertainmentFragment() {

    }

    public static KPopEntertainmentFragment newInstance(KPopEntertainmentCompany kPopEntertainmentCompany) {
        KPopEntertainmentFragment fragment = new KPopEntertainmentFragment();
        Bundle args = new Bundle();
        args.putString(ENTERTAINMENT_COMPANY, kPopEntertainmentCompany.getName());
        args.putString(FOUNDER, kPopEntertainmentCompany.getFounder());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            entertainmentCompany = getArguments().getString(ENTERTAINMENT_COMPANY);
            founder = getArguments().getString(FOUNDER);
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
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        KPopIdolAdapter adapter = new KPopIdolAdapter(AFTERSCHOOL);
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
}