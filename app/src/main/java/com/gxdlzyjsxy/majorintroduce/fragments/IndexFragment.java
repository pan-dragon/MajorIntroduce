package com.gxdlzyjsxy.majorintroduce.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gxdlzyjsxy.majorintroduce.R;

/**
 * Created by Administrator
 * on 2017-01-29.
 */

public class IndexFragment extends Fragment
{
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragment_index, container, false);
		// This is Test Content
		//this is remote of test content for PDY that to send orgison to me, which to  here.
	}
}
