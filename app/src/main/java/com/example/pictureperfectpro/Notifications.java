package com.example.pictureperfectpro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Notifications extends Fragment {
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View notifications = inflater.inflate(R.layout.notifications_layout, container,false);
		
		return notifications;
	}

}
