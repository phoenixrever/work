package com.phoenixhell.ivtest.Controller;

import com.phoenixhell.ivtest.Bean.IVData;
import com.phoenixhell.ivtest.service.Impl.IVServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class IVInfo {
    @GetMapping("/index")
    private String index(){
        return "index";
    }

    @Resource
    private IVServiceImpl ivService;
    @GetMapping("/iv/{username}")
    @ResponseBody
    private  IVData  iv(@PathVariable("username") String username){
        System.out.println(username);
        IVData ivData = ivService.query().eq("username", username).one();
        return ivData;
    }
}
