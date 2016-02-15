package ir.sibvas.sharjiha.activity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import de.greenrobot.event.EventBus;
import ir.sibvas.sharjiha.R;
import ir.sibvas.sharjiha.util.FragmentOrganizer;
import ir.sibvas.sharjiha.util.MainFragmentOrganizer;

public class MainActivity extends BaseActivity {


    private FragmentOrganizer fragmentOrganizer;
//    private RTLToolbar rtlToolbar;
//    private CircleProgressView progressView;

    // connection page
    private RelativeLayout connectionTransparent;
    private TextView settings;
    private TextView reload;

    private LinearLayout frame;
//    private NetworkChangedReceiver networkChangedReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EventBus.getDefault().register(this);

        setContentView(R.layout.activity_main);
        /*if (checkPlayServices()) {
            // Start IntentService to register this application with GCM.
            Intent intent = new Intent(this, RegistrationIntentService.class);
            startService(intent);
        }*/
        fragmentOrganizer = new MainFragmentOrganizer(this, getSupportFragmentManager());
        /*rtlToolbar = (RTLToolbar) findViewById(R.id.main_toolbar);
        rtlToolbar.setGoToCartOnClickListener(this);*/

        //connection page
//        connectionTransparent = (RelativeLayout) findViewById(R.id.connection_layer);
//        settings = (TextView) findViewById(R.id.settings);
//        reload = (TextView) findViewById(R.id.reload);

        frame = (LinearLayout) findViewById(R.id.frame_main_activity);

//        connectionTransparent.setOnClickListener(this);
//        settings.setOnClickListener(this);
//        reload.setOnClickListener(this);

//        BadgeView badgeView = new BadgeView(this, rtlToolbar.getBasketIV());
//
//        ApplicationContext.getDataCache(this).setBasketCount(3);
//        badgeView.setText(ApplicationContext.getDataCache(this).getBasketCount() + "");
//        badgeView.setTextSize(10);
//        badgeView.setBadgePosition(BadgeView.POSITION_TOP_RIGHT);
//        badgeView.show();
////        ActionItemBadge.update(this, null, rtlToolbar.getBasketIV(), )
//
//        setUpDrawer();
    }

    public void onEventMainThread(Object event){

    }

    private void testRegisterWebservice() {


    }

    private boolean checkPlayServices() {
//        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
//        if (resultCode != ConnectionResult.SUCCESS) {
////            if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
////                GooglePlayServicesUtil.getErrorDialog(resultCode, this,
////                        PLAY_SERVICES_RESOLUTION_REQUEST).show();
////            } else {
////                Log.i("ali", "This device is not supported.");
////                finish();
////            }
//            return false;
//        }
        return true;
    }

    @Override
    public void onBackPressed() {
//        if(hideDrawer()) return;
//
//        if(!fragmentOrganizer.handleBackNavigation())
//            finish();
//
//        Util.hideKeyboard(this);
    }

    @Override
    public FragmentOrganizer getFragmentOrganizer() {
        return fragmentOrganizer;
    }

    @Override
    public void setToolbarType(int type, String title) {
        switch (type){
            case TOOLBAR_TYPE_NO_TOOLBAR:
//                rtlToolbar.setVisibility(View.GONE);
                break;
            case TOOLBAR_TYPE_TITLE_AND_BACK:
//                rtlToolbar.setVisibility(View.VISIBLE);
//                rtlToolbar.setTitle(title);
//                rtlToolbar.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
//                rtlToolbar.setNavigationIcon(R.drawable.ic_arrow_forward);
//
//                rtlToolbar.setNavigationOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        onBackPressed();
//                    }
//                });
//
//                rtlToolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.text_color_default));
//                Util.setTypefaceToChildren(toolbar, ApplicationContext.primaryTypeFace);

                break;
        }
    }

    @Override
    public void setToolbarShadow(boolean hasElevation) {
        if(Build.VERSION.SDK_INT >= 21) {
//            if (hasElevation)
////                rtlToolbar.setElevation(getResources().getDimensionPixelSize(R.dimen.elevation_toolbar));
//            else
////                rtlToolbar.setElevation(0);
        }
    }


//    @Override
//    public void onClick(View v) {
//        int id = v.getId();
//
////        if(id == R.id.connection_layer) {
////
////            connectionTransparent.setVisibility(View.GONE);
////
////        } else if (id == R.id.reload) {
////
////            connectionTransparent.setVisibility(View.GONE);
////            EventBus.getDefault().post(new ConnectionEvent(ConnectionEvent.TYPE_PAGE_RELOAD));
////
////        } else if (id == R.id.settings) {
////
////            startActivityForResult(new Intent(android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS), 0);
////
////        }
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);

//        unregisterReceiver(networkChangedReceiver);
    }

    @Override
    public void setConnectionErrorVisibility(Boolean isConnected) {
        if (isConnected) {
            connectionTransparent.setVisibility(View.VISIBLE);
        } else {
            connectionTransparent.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
//        networkChangedReceiver = new NetworkChangedReceiver();
//        registerReceiver(networkChangedReceiver, intentFilter);
    }


//    @Override
//    public void onClickListener() {
////        getFragmentOrganizer().replaceFragment(CartFragment.newInstance());
//    }
}
