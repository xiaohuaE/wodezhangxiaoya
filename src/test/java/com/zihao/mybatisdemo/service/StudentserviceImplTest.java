package com.zihao.mybatisdemo.service;
import com.zihao.mybatisdemo.model.TStudent;
import com.zihao.mybatisdemo.util.PageBean;
import com.zihao.mybatisdemo.vo.StudentVo;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


public class StudentserviceImplTest extends  BaseTest {

    @Resource
    private  IStudentservice studentservice;



    @Test
    @Rollback(value = true)
    @Transactional(transactionManager = "transactionManager")
    public void add() {
        TStudent student = new TStudent();
        student.setSname("小t");
        student.setAge(19);
        student.setRemark("啊啊啊");
        System.out.println(studentservice.add(student));
    }



    @Test
    public void load() {
        TStudent student = new TStudent();
        student.setSid(1);
        System.out.println(studentservice.load(student));

        System.out.println("-------");
        System.out.println(studentservice.load(student));
    }

    @Test
    public void del() {
        TStudent student = new TStudent();
        student.setSid(6);
        System.out.println(studentservice.del(student));
    }

    @Test
    public void edit() {
        TStudent student = new TStudent();
        student.setSid(1);
        student.setSname("贺娜");
        student.setRemark("嘤嘤嘤");
        student.setAge(20);
        System.out.println(studentservice.edit(student));
    }

    @Test
    public void getAll() {
        TStudent student = new TStudent();
        student.setSname("小");
        List<TStudent> ss =  studentservice.getAll(student);
        for (TStudent st: ss) {
            System.out.println(st.toString());
        }
    }

    @Test
    public void getAlls() {
      StudentVo so = new StudentVo();
      //so.setSname("");
        List<Integer>  sid = new ArrayList<>();
        sid.add(2);
        sid.add(2);
        sid.add(2);
        sid.add(2);
        so.setSids(sid);



        PageBean pa = new PageBean();
        pa.setPage(1);
        pa.setRows(3);
        List<TStudent> ss   =  studentservice.getallsPaging(so,pa);

        for (TStudent st: ss) {
            System.out.println(st.toString());
        }
    }


}