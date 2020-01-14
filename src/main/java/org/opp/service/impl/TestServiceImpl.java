package org.opp.service.impl;

import org.opp.service.CustomerService;
import org.opp.util.CommonUtil;

import java.util.*;

public class TestServiceImpl implements CustomerService {

    private String[] myStrArr;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;

    public void setMyStrArr(String[] myStrArr) {
        this.myStrArr = myStrArr;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void saveCustomer() {
        CommonUtil.print(Arrays.toString(myStrArr));
        CommonUtil.print(myList);
        CommonUtil.print(mySet);
        CommonUtil.print(myMap);
        CommonUtil.print(myProps);
    }
}
