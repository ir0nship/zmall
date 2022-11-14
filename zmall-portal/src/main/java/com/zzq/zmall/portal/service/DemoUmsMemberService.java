package com.zzq.zmall.portal.service;

import com.zzq.zmall.common.api.CommonResult;

public interface DemoUmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
