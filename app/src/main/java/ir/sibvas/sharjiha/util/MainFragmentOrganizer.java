package ir.sibvas.sharjiha.util;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import ir.sibvas.sharjiha.R;
import ir.sibvas.sharjiha.fragment.MainFragment;


public class MainFragmentOrganizer extends FragmentOrganizer {

    Context context;
    public MainFragmentOrganizer(Context context, FragmentManager fragmentManager) {
        super(fragmentManager, R.id.activity_main_fragment_container);
        this.context = context;
    }

    @Override
    protected Fragment getInitialFragment() {
//        return ProductFragment.newInstance(2);
        return MainFragment.newInstance();
//        return MainFragment.newInstance();
//        return ProductOptionsFragment.newInstance(1);
//        return SearchFragment.newInstance();
//        return ComparisonFragment.newInstance();
//        return ProfileFragment.newInstance();
//        return OrderHistoryFragment.newInstance(1);
//        return LoginFragment.newInstance();
//        return HomeFragment.newInstance();
//        return PromotionFragment.newInstance();
//        return new TestFragment();
//        return CategoryProductsFragment.newInstance(1);
//        return FilterFragment.newInstance();
//        return ProductFragment.newInstance(101);
//        return SpecFragment.newInstance(101);
//        return CommentListFragment.newInstance(101);
//        return CartFragment.newInstance();

    }

    @Override
    public boolean handleBackNavigation() {
        Fragment fragment = getOpenFragment();

//        if(fragment instanceof MainFragment){ //if user is in not in promotion tab. go to promotion. if in promotion exit.
//            return ((MainFragment) fragment).handleBackNavigation();
//        }

//        if(fragment instanceof ProfileFragment)
//            fragmentManager.popBackStack(getFragmentTagAt(0), 0);

        fragmentManager.popBackStack();

        return true;


//        Fragment prevFragment = null;
//        if(fragmentManager.getBackStackEntryCount() >= 2)
//            prevFragment = fragmentManager.findFragmentByTag(getFragmentTagAt(fragmentManager.getBackStackEntryCount() - 2));
//
//        if(prevFragment != null)
//            EventBus.getDefault().post(new FragmentGetBackFromStackEvent(prevFragment.getClass().getSimpleName()));

//        if(fragment instanceof PromotionFragment) {
//            return false;
//
//        } if(fragment instanceof CategoryProductsFragment) { //go to main
//            fragmentManager.popBackStack(getFragmentTagAt(0), 0);
//
//        } else {
//            fragmentManager.popBackStack();
//
//        }


//        if (fragment instanceof MainFragment) {
//            return false;
//        } else if (fragment instanceof KhedmatFragment || fragment instanceof AppDetailFragment || fragment instanceof SliderFragment) {
//            fragmentManager.popBackStack();
//            return true;
//        } else {
//            String firstTag = fragmentManager.getBackStackEntryAt(0).getName();
//            fragmentManager.popBackStack(firstTag, 0);
//            return true;
//        }

    }


}
