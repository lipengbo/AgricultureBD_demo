package cn.edu.seu.agriculture.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface DatePriceService {

    public List<Map<Date,Double>> getPriceListByInfo(String province,  //省份
                                                     String market,
                                                     String type,      //品种
                                                     String name);     //名字
}