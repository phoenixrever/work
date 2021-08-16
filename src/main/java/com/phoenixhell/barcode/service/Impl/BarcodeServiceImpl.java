package com.phoenixhell.barcode.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phoenixhell.barcode.Bean.Barcode;
import com.phoenixhell.barcode.Mapper.BarcodeMapper;
import com.phoenixhell.barcode.service.BarcodeService;
import org.springframework.stereotype.Service;

/**
 * @author phoenixhell
 * @since 2021/3/29 0029-下午 3:59
 */
@Service
public class BarcodeServiceImpl extends ServiceImpl<BarcodeMapper,Barcode> implements BarcodeService {
}
