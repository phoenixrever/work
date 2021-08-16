package com.phoenixhell.barcode.Bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author phoenixhell
 * @since 2021/3/29 0029-下午 3:50
 */
@Data
@TableName(value = "dbo.VIEW_PACKAGE_DATA")//指定表名
public class Barcode {
    @TableField(value = "LotNumber")
    private String lotNumber;
    @TableField(value = "ItemNo")
    private String itemNo;
}
