package arisyrifki.app.test;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import arisyrifki.app.test.Adapter.AdapterContainer;
import arisyrifki.app.test.Fragment.FragmentSch;

public class MainActivity extends AppCompatActivity {


    private AdapterContainer mAdapterContainer;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapterContainer = new AdapterContainer( getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.Vpager);

        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager mViewPager) {
        AdapterContainer adapter = new AdapterContainer( getSupportFragmentManager());
        adapter.addFragment(new FragmentSch(),"SchFragment");
        //adapter.addFragment(new FragmentSatwa(),"SatwaFragment");
        //adapter.addFragment(new FragmentFun(),"FunfactFragment");

        mViewPager.setAdapter(adapter);
    }
    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
