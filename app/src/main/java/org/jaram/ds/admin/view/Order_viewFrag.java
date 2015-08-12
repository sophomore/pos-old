package org.jaram.ds.admin.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import org.jaram.ds.R;
import org.jaram.ds.data.Data;
import org.jaram.ds.data.struct.Order;

import java.util.ArrayList;

/**
 * Created by cheonyujung on 15. 7. 23..
 */
public class Order_viewFrag extends Fragment {
    View view;
    public Order_viewFrag(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_orderview, container, false);
        ArrayList<Order> orderlist;
        orderlist = Data.orderList;

        ListView list = (ListView)view.findViewById(R.id.orderlist);
        OrderlistAdapter Adapter = new OrderlistAdapter(view.getContext(),R.layout.orderlist_item,orderlist);
        list.setAdapter(Adapter);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //listview 클릭 시

            }
        };


        return view;
    }

}

