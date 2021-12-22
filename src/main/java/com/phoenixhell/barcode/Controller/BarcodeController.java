package com.phoenixhell.barcode.Controller;

import com.phoenixhell.barcode.Bean.Barcode;
import com.phoenixhell.barcode.service.BarcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author phoenixhell
 * @since 2021/3/29 0029-下午 3:50
 */
@Controller
public class BarcodeController {
    @Autowired
    private BarcodeService barcodeService;

    @ResponseBody
    @GetMapping("/get/{packageNO}")
    public List<Barcode> getQRData(@PathVariable String packageNO){
        List<Barcode> list = barcodeService.query().eq("PackageNo", packageNO).orderByAsc("ItemNo").list();
//        model.addAttribute("list",list);
//        model.addAttribute("packageNO",packageNO);
//        System.out.println(list);
        return list;
    }

    @GetMapping("/sd")
    public String sd(){
        return "another";
    }

    @GetMapping("/gls")
    public String gls(){
        return "gls";
    }

    @GetMapping("/dc20")
    public String dc20(){
        return "dc20";
    }

    @GetMapping("/dc22")
    public String dc22(){
        return "dc22";
    }

    @GetMapping({"/index","/"})
    public String index(){
        return "index";
    }
}
