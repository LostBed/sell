package com.yinze.sell.utils;

import com.yinze.sell.VO.ResultVo;

/**
 * @Author: Yinze
 * @Created: 2018/6/25 9:51
 */

public class ResultVOUtil {
    public static ResultVo success(Object object){
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
    
    public static ResultVo success(){
        return success(null);
    }
    
    public static ResultVo error(Integer code,String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
