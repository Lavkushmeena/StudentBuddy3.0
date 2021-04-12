package com.nitukbt19.StudentBuddy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitukbt19.StudentBuddy.Adapter.studentlistAdapter;
import com.nitukbt19.StudentBuddy.model.studentlist;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Student_List#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Student_List extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public View View;

    public Student_List() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Student_List.
     */
    // TODO: Rename and change types and number of parameters
    public static Student_List newInstance(String param1, String param2) {
        Student_List fragment = new Student_List();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
private List<studentlist>list=new ArrayList<>(1);
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View= inflater.inflate(R.layout.fragment_student__list, container, false);
       recyclerView = recyclerView.findViewById(R.id.recyclerView);
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getstudentlist();
        return View;
    }

    private void getstudentlist() {
        list.add(new studentlist( "11","kush","hey","12/04/2021","https://assets.entrepreneur.com/content/3x2/2000/learn-beiber-twitter.jpg"));
        list.add(new studentlist( "12","love","hiiii","12/04/2021","data:image/jpeg;base64,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"));
recyclerView.setAdapter(new studentlistAdapter(list,getContext()));
    }

}