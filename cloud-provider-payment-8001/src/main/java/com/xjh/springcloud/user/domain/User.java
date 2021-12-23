package com.xjh.springcloud.user.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author xjh
 * @date 2021/12/23 15:38
 */
@Data
/*@Component
@AllArgsConstructor
@NoArgsConstructor*/
@TableName(value = "user")
public class User implements Serializable {

    @TableId(value = "id")
    private Integer id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;
}
