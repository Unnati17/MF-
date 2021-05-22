package com.ncu.model;

import java.io.Serializable;

public class Student implements Serializable 
{
    private static final long serialVersionUID = -1280037900360314186L;

    private String name;
    private String rn;
    private String dept;
    private String spl;
    public Student()
    {
        super();
    }
    public Student(String rn, String name,String spl, String dept)
    {
        super();
        this.rn = rn;
        this.name = name;
        this.spl = spl;
        this.dept = dept;
    }
    public String getRn()
    {
        return rn;
    }
    public void setRn(String rn)
    {
        this.rn = rn;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSpl()
    {
        return spl;
    }
    public void setSpl(String spl)
    {
        this.spl = spl;
    }
    public String getDept()
    {
        return dept;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }
}
