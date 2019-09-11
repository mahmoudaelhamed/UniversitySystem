package com.example.universitysystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter_Doctor_LectureList extends ArrayAdapter {
    ArrayList<Model_Doctor_LecturesList> dataList;

    public Adapter_Doctor_LectureList(@NonNull Context context, int resource, ArrayList<Model_Doctor_LecturesList> dataList) {
        super(context, resource, dataList);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_lecture_list,parent,false);

        TextView lectureNumberET = convertView.findViewById(R.id.lecture_number);
        TextView topicET = convertView.findViewById(R.id.topic);
        TextView lectureDateET = convertView.findViewById(R.id.lectureDate);

        lectureNumberET.setText(dataList.get(position).getLectureNumber());
        topicET.setText(dataList.get(position).getTopic());
        lectureDateET.setText(dataList.get(position).getDate());
        return convertView;
    }
}
