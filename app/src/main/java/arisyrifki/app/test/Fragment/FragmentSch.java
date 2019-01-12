package arisyrifki.app.test.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabItem;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import arisyrifki.app.test.R;

/**
 * Created by rfkchrl on 1/13/2019.
 */

public class FragmentSch extends Fragment {

    private TabItem tabSing, tabSch, tabShop;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_btn_main, container, false);

        tabSch = (TabItem) view.findViewById(R.id.tab_schedule);
        tabSing = (TabItem) view.findViewById(R.id.tab_sing);
        tabShop = (TabItem) view.findViewById(R.id.tab_shop);




        return view;
    }
}

