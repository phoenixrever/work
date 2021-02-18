package com.phoenixhell.ivtest.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phoenixhell.ivtest.Bean.IVData;
import com.phoenixhell.ivtest.Mapper.IVDataMapper;
import com.phoenixhell.ivtest.service.IVService;
import org.springframework.stereotype.Service;

@Service
public class IVServiceImpl extends ServiceImpl<IVDataMapper, IVData> implements IVService {
}
