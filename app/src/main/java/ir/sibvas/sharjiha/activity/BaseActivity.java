package ir.sibvas.sharjiha.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import ir.sibvas.sharjiha.util.FragmentOrganizer;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public abstract class BaseActivity extends AppCompatActivity {
    public static final int TOOLBAR_TYPE_NO_TOOLBAR = 1;
    public static final int TOOLBAR_TYPE_TITLE_AND_BACK = 2;


    //used to apply default font to all the views in the app
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public FragmentOrganizer getFragmentOrganizer() {
        throw new UnsupportedOperationException("sub class doesn't implement method");
    }

    public abstract void setToolbarType(int type, String title);
    public abstract void setToolbarShadow(boolean hasElevation);

    public abstract void setConnectionErrorVisibility(Boolean flag);

}
