package org.huluo.springrmi;

public class SpringRmiStudentServiceImpl implements SpringRmiStudentService {
    @Override
    public String getNumber() {
        return "student服务";
    }
}
