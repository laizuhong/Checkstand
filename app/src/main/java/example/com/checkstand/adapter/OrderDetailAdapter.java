package example.com.checkstand.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import example.com.checkstand.R;
import example.com.checkstand.bean.OrderDetail;

/**
 * Created by laizuhong on 2015/10/10.
 */
public class OrderDetailAdapter extends BaseAdapter{

    List<OrderDetail> orderDetails;
    Context context;

    public OrderDetailAdapter(List<OrderDetail> orderDetails, Context context) {
        this.orderDetails = orderDetails;
        this.context = context;
    }

    @Override
    public int getCount() {
        return orderDetails.size();
    }

    @Override
    public Object getItem(int position) {
        return orderDetails.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item_list_orderdetail,null);
        TextView number= (TextView) convertView.findViewById(R.id.number);
        TextView amount= (TextView) convertView.findViewById(R.id.amount);
        TextView realamount= (TextView) convertView.findViewById(R.id.realityamount);
        TextView time= (TextView) convertView.findViewById(R.id.time);
        TextView username= (TextView) convertView.findViewById(R.id.username);
        TextView cloundnumber= (TextView) convertView.findViewById(R.id.cloundnumber);
        TextView state= (TextView) convertView.findViewById(R.id.state);
        TextView service= (TextView) convertView.findViewById(R.id.service);
        TextView servicestate= (TextView) convertView.findViewById(R.id.servicestate);

        OrderDetail detail=orderDetails.get(position);
        number.setText(detail.getNumber()+"");
        amount.setText(detail.getAmount()+"");
        realamount.setText(detail.getRealityAmount()+"");
        time.setText(detail.getTime()+"");
        username.setText(detail.getName()+"");
        cloundnumber.setText(detail.getCloundNumber()+"");
        state.setText(detail.getOrderState()+"");
        service.setText(detail.getService()+"");
        servicestate.setText(detail.getServiceState()+"");

        return convertView;
    }
}
