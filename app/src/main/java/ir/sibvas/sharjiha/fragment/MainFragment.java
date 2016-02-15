package ir.sibvas.sharjiha.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import ir.sibvas.sharjiha.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MainFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment implements View.OnClickListener {


    private LinearLayout directMainWrap;
    private TextView directMain;
    private ImageView directMainLogo;

    private LinearLayout directAnotherWrap;
    private TextView directAnother;
    private ImageView directAnotherLogo;

    private ImageView irancell;
    private ImageView rightel;
    private ImageView mci;

    private ImageView basketIV;

    public static MainFragment newInstance(){
        return new MainFragment();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        directMainWrap = (LinearLayout) view.findViewById(R.id.direct_main_wrap);
        directMain = (TextView) view.findViewById(R.id.direct_main);
        directMainLogo = (ImageView) view.findViewById(R.id.direct_main_logo);
        directMain.setOnClickListener(this);
        directMainLogo.setOnClickListener(this);

        directAnotherWrap = (LinearLayout) view.findViewById(R.id.direct_another_wrap);
        directAnother = (TextView) view.findViewById(R.id.direct_another);
        directAnotherLogo = (ImageView) view.findViewById(R.id.direct_another_logo);
        directAnother.setOnClickListener(this);
        directAnotherLogo.setOnClickListener(this);

        irancell = (ImageView) view.findViewById(R.id.irancell);
        irancell.setOnClickListener(this);

        mci = (ImageView) view.findViewById(R.id.mci);
        mci.setOnClickListener(this);

        rightel = (ImageView) view.findViewById(R.id.rightel);
        rightel.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.direct_main || id == R.id.direct_main_logo) {
            closeAllWraps();
            toggleDirectMainWrap();
        } else if (id == R.id.direct_another || id == R.id.direct_another_logo) {
            closeAllWraps();
            toggleDirectAnotherWrap();
        } else if (id == R.id.irancell) {
            clearAllWraps();
            irancell.setBackgroundColor(getResources().getColor(R.color.accent));
        } else if (id == R.id.mci) {
            clearAllWraps();
            mci.setBackgroundColor(getResources().getColor(R.color.accent));
        } else if (id == R.id.rightel) {
            clearAllWraps();
            rightel.setBackgroundColor(getResources().getColor(R.color.accent));
        }
    }

    private void clearAllWraps() {
        irancell.setBackgroundColor(Color.TRANSPARENT);
        mci.setBackgroundColor(Color.TRANSPARENT);
        rightel.setBackgroundColor(Color.TRANSPARENT);
    }

    private void closeAllWraps() {
        directAnotherWrap.setVisibility(View.GONE);
        directMainWrap.setVisibility(View.GONE);
    }

    private void toggleDirectAnotherWrap() {
        if(directAnotherWrap.getVisibility() == View.VISIBLE) {
            directAnotherWrap.setVisibility(View.GONE);
        } else {
            directAnotherWrap.setVisibility(View.VISIBLE);
        }
    }

    private void toggleDirectMainWrap() {
        if(directMainWrap.getVisibility() == View.VISIBLE) {
            directMainWrap.setVisibility(View.GONE);
        } else {
            directMainWrap.setVisibility(View.VISIBLE);
        }
    }

}
