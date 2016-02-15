package ir.sibvas.sharjiha.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import de.greenrobot.event.EventBus;
import ir.sibvas.sharjiha.event.FragmentGetBackFromStackEvent;


/**
 * Created by alirezaahmadi on 7/12/15 AD.
 */


public abstract class FragmentOrganizer implements FragmentManager.OnBackStackChangedListener {

    protected FragmentManager fragmentManager;
    private int containerResourceId;
    private int backStackCount = 0;


    public FragmentOrganizer(FragmentManager fragmentManager, int containerResourceId) {
        this.fragmentManager = fragmentManager;
        this.containerResourceId = containerResourceId;
        Fragment initFragment = getInitialFragment();
        if(initFragment != null)
            replaceFragment(getInitialFragment());

        fragmentManager.addOnBackStackChangedListener(this);
    }

    protected abstract Fragment getInitialFragment();
    public abstract boolean handleBackNavigation();


    protected Fragment getOpenFragment(){
        if(fragmentManager.getBackStackEntryCount() > 0) {
            String tag = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1).getName();
            return fragmentManager.findFragmentByTag(tag);
        }

        return null;
    }

    protected String getFragmentTagAt(int index){
        return fragmentManager.getBackStackEntryAt(index).getName();
    }


    protected boolean isFragmentOpen(Fragment fragment){
        return isFragmentOpen(fragment, true);
    }

    protected boolean isFragmentOpen(Fragment fragment, boolean useArgs){
        String fragmentTag = createFragmentTag(fragment, useArgs);

        if (fragmentManager.getBackStackEntryCount() != 0) {
            String name = fragmentManager.getBackStackEntryAt(fragmentManager.getBackStackEntryCount() - 1).getName();

            if(!useArgs)
                name = name.substring(0, name.indexOf("-"));
                return name.equals(fragmentTag);
        }

        return false;
    }


    private String createFragmentTag(Fragment fragment, boolean addArgs) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fragment.getClass().getSimpleName());
        if(addArgs) {
            stringBuilder.append("-");
            if (fragment.getArguments() != null)
                stringBuilder.append(fragment.getArguments().toString());
        }
        return stringBuilder.toString();
    }



    public void addFragment(Fragment fragment){
        openFragment(fragment, false);
    }

    public void replaceFragment(Fragment fragment) {
        openFragment(fragment, true);
    }

    private void openFragment(Fragment fragment, boolean replace){
        String fragmentTag = createFragmentTag(fragment, true);

        if(isFragmentOpen(fragment))
            return;

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if(replace)
            transaction.replace(containerResourceId, fragment, fragmentTag);
        else
            transaction.add(containerResourceId, fragment, fragmentTag);

        transaction.addToBackStack(fragmentTag);
        transaction.commit();

    }

    @Override
    public void onBackStackChanged() {
        //check list of fragment in stack before and after transition for more correct result!
        if(fragmentManager.getBackStackEntryCount() < backStackCount) { //something removed
            Fragment fragment = getOpenFragment();
            if (fragment != null)
                EventBus.getDefault().post(new FragmentGetBackFromStackEvent(fragment.getClass().getName()));
        }
        backStackCount = fragmentManager.getBackStackEntryCount();

    }
}
