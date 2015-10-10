package example.com.checkstand.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import example.com.checkstand.R;
import example.com.checkstand.bean.GoodOrder;

/**
 * Created by laizuhong on 2015/10/10.
 */
public class GoodOrderAdapter extends BaseAdapter{

    List<GoodOrder> goodOrders;
    Context context;

    public GoodOrderAdapter(List<GoodOrder> goodOrders, Context context) {
        this.goodOrders = goodOrders;
        this.context = context;
    }

    @Override
    public int getCount() {
        return goodOrders.size();
    }

    @Override
    public Object getItem(int position) {
        return goodOrders.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item_list_goodorder,null);
        TextView name= (TextView) convertView.findViewById(R.id.goodname);
        TextView desc= (TextView) convertView.findViewById(R.id.describe);
        TextView price= (TextView) convertView.findViewById(R.id.price);
        TextView preferential= (TextView) convertView.findViewById(R.id.preferential);
        TextView count= (TextView) convertView.findViewById(R.id.count);
        TextView amount= (TextView) convertView.findViewById(R.id.amount);

        GoodOrder goodOrder=goodOrders.get(position);
        name.setText(goodOrder.getGoodName());
        desc.setText(goodOrder.getDescribe());
        price.setText(goodOrder.getPrice()+"");
        preferential.setText(goodOrder.getPreferential()+"");
        count.setText(goodOrder.getCount()+"");
        amount.setText(goodOrder.getAmount()+"");

        return convertView;
    }
}
