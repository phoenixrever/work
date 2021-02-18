package com.phoenixhell.ivtest.Bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("acl_user")
public class IVData {
    private Integer id;
    private String username;
    private String password;
}
