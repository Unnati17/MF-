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
 
   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rn == null) ? 0 : rn.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((spl == null) ? 0 : spl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rn == null) {
			if (other.rn != null)
				return false;
		} else if (!rn.equals(other.rn))
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (spl == null) {
			if (other.spl != null)
				return false;
		} else if (!spl.equals(other.spl))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
	 @Override
	    public String toString()
	    {
	        return "Employee [rn=" + rn + ", name=" + name + ", spl=" + spl + ", dept=" + dept + "]";
	    }
    
    
    
}
