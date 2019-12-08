package com.zihao.mybatisdemo.vo;

import com.zihao.mybatisdemo.model.TStudent;

import java.util.List;

public class StudentVo extends TStudent {

    private List<Integer> sids;

    private  String sname;




    public List<Integer> getSids() {
        return sids;
    }

    public void setSids(List<Integer> sids) {
        this.sids = sids;
    }


    @Override
    public String getSname() {
        return sname;
    }

    @Override
    public void setSname(String sname) {
        this.sname = sname;
    }
}
