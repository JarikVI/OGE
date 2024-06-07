package com.example.oge.ui.tems;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.oge.databinding.FragmentTemsBinding;


public class TemsFragment extends Fragment {

    private FragmentTemsBinding binding;
    private Button reg;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TemsViewModel dashboardViewModel =
                new ViewModelProvider(this).get(TemsViewModel.class);

        binding = FragmentTemsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}