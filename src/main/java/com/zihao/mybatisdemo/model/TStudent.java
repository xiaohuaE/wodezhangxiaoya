package com.zihao.mybatisdemo.model;

import com.zihao.mybatisdemo.util.PinYinUtil;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@ToString
public class TStudent {

    //分组接口
    public  static  interface  ValidGroup{
        public  static  interface  Add{};
        public  static  interface Edit{};
    }

    @NotNull(message = "id不能为空")
    private int sid;

    @NotBlank(message = "姓名不能为空" ,groups= ValidGroup.Add.class)
    private String sname;

    @NotNull(message = "年龄不能为空" ,groups = {ValidGroup.Add.class,ValidGroup.Edit.class})
    private Integer age;
    private String remark;
    private String snamePinyin;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
        this.snamePinyin = PinYinUtil.toPinyin(sname);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSnamePinyin() {
        return snamePinyin;
    }

    public void setSnamePinyin(String snamePinyin) {
        this.snamePinyin = snamePinyin;
    }


    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, age, remark, snamePinyin);
    }
}
