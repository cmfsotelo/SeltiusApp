package pt.seltius.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import pt.seltius.adapters.CustomListViewAdapter;
import pt.seltius.R;
import pt.seltius.utils.RowItem;


public class ScheduleFragment extends Fragment {

    //TODO REMOVE
    public static final String[] titles = new String[] { "Loja 1",
            "Loja 2", "Loja 3", "Loja 4" };

    public static final String[] descriptions = new String[] {
            "Rua dos testes ABC",
            "Rua dos testes ABC",
            "Rua dos testes ABC",
            "Rua dos testes ABC" };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        List<RowItem> rowItems = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            RowItem item = new RowItem(titles[i], descriptions[i]);
            rowItems.add(item);
        }

        ListView listView = (ListView) view.findViewById(R.id.storeList);
        CustomListViewAdapter adapter = new CustomListViewAdapter(getContext(),
                R.layout.list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animation animation = new AlphaAnimation(0.3f, 1.0f);
                animation.setDuration(2000);
                view.startAnimation(animation);
            }
        });


        // Inflate the layout for this fragment
        return view;
    }
}