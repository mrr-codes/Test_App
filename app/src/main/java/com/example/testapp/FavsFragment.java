package com.example.testapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavsFragment extends Fragment  {

    
    /*String s1[],s2[];
    int images[] = {R.drawable.eightonebytwo,R.drawable.twelveangrymen,R.drawable.bicyclethieves,R.drawable.lifeisbeautiful,R.drawable.m,R.drawable.patherpanchali,R.drawable.rashomon,R.drawable.sevensamurai,R.drawable.thegodfather,R.drawable.theshawshankredemption};*/



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favs, container, false);



        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.FavsRecyclerView);

        FavsAdapter FavsAdapter = new FavsAdapter();
        recyclerView.setAdapter(FavsAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;

      

       /* s1 = getResources().getStringArray(R.array.Good_Old_Movies);
        s2 = getResources().getStringArray(R.array.description);

        FavsAdapter favsAdapter = new FavsAdapter(this, s1, s2, images);*/


    }


}
