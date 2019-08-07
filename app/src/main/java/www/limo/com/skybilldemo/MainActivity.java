package www.limo.com.skybilldemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import www.limo.com.skybilldemo.Adapters.PageAdapter;

public class MainActivity extends AppCompatActivity {

    public Toolbar toolbar;
    public TabLayout tabLayout;
    public PageAdapter pageAdapter;
    public ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        toolbar.setTitle("Skybill Demo"+System.getProperty("line.separator")+"John Doe");

        viewPager=findViewById(R.id.myViewPager);

        tabLayout=findViewById(R.id.myTabLayout);

        tabLayout.addTab(tabLayout.newTab().setText("My Bills"));
        tabLayout.addTab(tabLayout.newTab().setText("Grouped Bills"));
        pageAdapter=new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(pageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
