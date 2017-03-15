package org.huluo.springapiprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 当我们在开发中,使用数据库连接的时候,往往是测试的时候连接测试数据库,生产环境用的是生产环境的数据库。
 * 这两个数据库的用户名密码往往是不同的。但是当我们打完包上线app到生产环境中去的时候,发现数据库的用户名密码用的是测试数据库的用户名密码。
 * 这时候就很麻烦了。所以从Spring3开始提供了profile的功能。
 * 就是当环境符合那个profile就激活哪个profile。
 * 这里我们用Dao去演示,里面的成员变量封装了数据库的类型,数据库的用户名和密码
 * 正式开发的时候,这里应该是DataSource
 */
@Component
public class SpringProfileDao {


    @Value("#{config.username}")
    private String username;
    @Value("#{config.password}")
    private String password;
    @Value("#{config.dbtype}")
    private String dbType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }
}
