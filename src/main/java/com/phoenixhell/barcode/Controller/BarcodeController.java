package com.phoenixhell.barcode.Controller;

import com.phoenixhell.barcode.Bean.Barcode;
import com.phoenixhell.barcode.service.BarcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author phoenixhell
 * @since 2021/3/29 0029-下午 3:50
 */
@RestController
public class BarcodeController {
    @Autowired
    private BarcodeService barcodeService;
    @GetMapping("/get/{packageNO}")
    public List<Barcode> getQRData(@PathVariable String packageNO){
        List<Barcode> list = barcodeService.query().eq("PackageNo", packageNO).orderByAsc("ItemNo").list();
//        model.addAttribute("list",list);
//        model.addAttribute("packageNO",packageNO);
        return list;
    }
}
