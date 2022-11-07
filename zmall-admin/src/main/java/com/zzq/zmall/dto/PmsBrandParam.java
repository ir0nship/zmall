package com.zzq.zmall.dto;

import com.zzq.zmall.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * [一句话描述该类的功能]
 *
 * @author : [ironship]
 * @version : [v1.0]
 * @createTime : [2022/11/7 21:55]
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsBrandParam {
    @NotEmpty
    @ApiModelProperty(value = "品牌名称",required = true)
    private String name;
    @ApiModelProperty(value = "品牌首字母")
    private String firstLetter;
    @Min(value = 0)
    @ApiModelProperty(value = "排序字段")
    private Integer sort;
    @FlagValidator(value = {"0","1"}, message = "厂家状态不正确")
    @ApiModelProperty(value = "是否为厂家制造商")
    private Integer factoryStatus;
    @FlagValidator(value = {"0","1"}, message = "显示状态不正确")
    @ApiModelProperty(value = "是否进行显示")
    private Integer showStatus;
    @NotEmpty
    @ApiModelProperty(value = "品牌logo",required = true)
    private String logo;
    @ApiModelProperty(value = "品牌大图")
    private String bigPic;
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;
}
