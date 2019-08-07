package www.limo.com.skybilldemo.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import www.limo.com.skybilldemo.GroupedBills;
import www.limo.com.skybilldemo.MyBills;

public class PageAdapter extends FragmentPagerAdapter {

    public int tabCount;

    public PageAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
               return new MyBills();
            case 1:
                return new GroupedBills();
                default:
                    return new MyBills();
        }
    }

    @Override
    public int getCount() {
        return tabCount ;
    }
}
