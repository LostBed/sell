package com.yinze.sell.controller;

import com.yinze.sell.VO.ResultVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:44
 */

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    
    @GetMapping("/list")
    public ResultVo list(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }
}
