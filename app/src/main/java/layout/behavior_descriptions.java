package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import projectmadcap.madcap.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class behavior_descriptions extends Fragment {


    public behavior_descriptions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_behavior_descriptions, container, false);
    }

}
