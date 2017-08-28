#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.entity;

import javax.persistence.*;
import org.apache.ibatis.type.*;
import tk.mybatis.mapper.annotation.*;

@Table(name = "AP_ACCOUNT")
public class Account {
    /**
     * PK
     */
    @Id
    @Column(name = "ID")
    @ColumnType(jdbcType = JdbcType.DECIMAL)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select SEQ_AP_ACCOUNT.nextval from dual")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String username;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String password;

    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String nickname;

    /**
     * 电子邮箱
     */
    @Column(name = "EMAIL")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String email;

    /**
     * 移动电话
     */
    @Column(name = "MOBILE_PHONE")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String mobilePhone;

    /**
     * 锁定状态 T 是 F 否
     */
    @Column(name = "LOCKED")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private Boolean locked;

    /**
     * 过期状态 T 是 F 否
     */
    @Column(name = "EXPIRED")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private Boolean expired;

    /**
     * 启用状态 T 是 F 否
     */
    @Column(name = "ENABLED")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private Boolean enabled;

    /**
     * 预留/系统角色名/默认ROLE_USER/多个,隔开/不允许有空格
     */
    @Column(name = "ROLES")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String roles;

    /**
     * 获取PK
     *
     * @return ID - PK
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置PK
     *
     * @param id PK
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return USERNAME - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return NICKNAME - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取电子邮箱
     *
     * @return EMAIL - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取移动电话
     *
     * @return MOBILE_PHONE - 移动电话
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置移动电话
     *
     * @param mobilePhone 移动电话
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取锁定状态 T 是 F 否
     *
     * @return LOCKED - 锁定状态 T 是 F 否
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 设置锁定状态 T 是 F 否
     *
     * @param locked 锁定状态 T 是 F 否
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * 获取过期状态 T 是 F 否
     *
     * @return EXPIRED - 过期状态 T 是 F 否
     */
    public Boolean getExpired() {
        return expired;
    }

    /**
     * 设置过期状态 T 是 F 否
     *
     * @param expired 过期状态 T 是 F 否
     */
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    /**
     * 获取启用状态 T 是 F 否
     *
     * @return ENABLED - 启用状态 T 是 F 否
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置启用状态 T 是 F 否
     *
     * @param enabled 启用状态 T 是 F 否
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取预留/系统角色名/默认ROLE_USER/多个,隔开/不允许有空格
     *
     * @return ROLES - 预留/系统角色名/默认ROLE_USER/多个,隔开/不允许有空格
     */
    public String getRoles() {
        return roles;
    }

    /**
     * 设置预留/系统角色名/默认ROLE_USER/多个,隔开/不允许有空格
     *
     * @param roles 预留/系统角色名/默认ROLE_USER/多个,隔开/不允许有空格
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }
}